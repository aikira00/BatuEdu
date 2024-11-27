# Esercizio: Gestione dei Rifiuti Elettronici

Una città ha deciso di migliorare la gestione dei rifiuti elettronici, come cellulari, computer e altri dispositivi elettronici dismessi, installando delle EcoBox intelligenti in vari punti della città. Queste EcoBox sono collegate a un server centrale e devono comunicare con esso per tenere aggiornato lo stato delle raccolte e ricevere istruzioni su eventuali interventi necessari, come lo svuotamento quando sono piene o la risoluzione di guasti.

SI è scelto di non utilizzare HTTP per questa comunicazione, preferendo sviluppare un proprio protocollo basato su TCP. 

Le EcoBox, una volta connesse, inviano periodicamente aggiornamenti al server, informandolo sul livello di riempimento, specificando la percentuale di spazio ancora disponibile. Inoltre, se una EcoBox rileva problemi, come un blocco nello sportello o un malfunzionamento del sensore, comunica immediatamente questi errori al server. Il server, a sua volta, può rispondere inviando comandi alle EcoBox, come il ripristino dei dati dopo uno svuotamento o la notifica che un intervento di manutenzione è stato programmato. Inoltre, può essere cambiata la modalità operativa dell'EcoBox per ottimizzare il consumo energetico o per altri scopi tecnici.

## Soluzione
### Electronic Waste Management Protocol (EWMP)

#### Stato Documento

Stato attuale del protocollo: **draft**. Questo protocollo è in fase di sviluppo per l’implementazione del sistema di EcoBox nella città. Consente la comunicazione tra le EcoBox e un server centrale.

#### Riepilogo

Il protocollo consente alle EcoBox di inviare informazioni sullo stato di riempimento e sul tipo di rifiuto raccolto al server. Il server, a sua volta, può inviare comandi per il reset delle EcoBox e segnalazioni di intervento.  Il protocollo utilizza una connessione TCP per garantire l’affidabilità e la corretta consegna dei messaggi.

Il protocollo è connesso a livello applicativo e prevede una fase di scambio di **ID dell’EcoBox** e **ID del server** che insieme permettono di definire in modo univoco la coppia echo box e server. 


**Panoramica del Protocollo**

Il protocollo di comunicazione tra EcoBox e server è **connesso** e prevede una coppia di identificatori per EcoBox e server, che permettono di associare la comunicazione a livello applicativo. Ogni messaggio scambiato include gli ID dell’EcoBox (<EcoBox_ID>) e del server (<Server_ID>), che permettono di tracciare ogni comunicazione e garantire che i dati siano correttamente assegnati alla rispettiva entità.



Durante l’instaurazione della connessione, **EcoBox** e server si scambiano i rispettivi ID in una fase di **handshake**. Solo dopo questo scambio è possibile inviare i messaggi operativi. La prima volta che un EcoBox contatta un server, si registra inviando il proprio ID. Il server risponde con una coppia composta dall’**ID dell’EcoBox** e dall’**ID del server**. Da quel momento in poi, tutti i messaggi conterranno questa coppia di ID: <**ID dell’EcoBox** e **ID del server**>. Il server conferma l'avvenuta connessione a livello applicativo con un messaggio di benvenuto. Questo significa che l'ecobox si è correttamente registrato presso il server.

Ogni volta che il client invia un messaggio al server utilizzando il protocollo **TCP** a livello di trasporto, chiude la connessione **TCP** dopo aver ricevuto la risposta dal server, e viceversa. 

La connessione è gestita a livello di trasporto tramite TCP, mentre l’identificazione a livello applicativo è garantita dallo scambio di ID.

L’EWMP non richiede frammentazione specifica, poiché i messaggi sono brevi. In caso di congestione, TCP gestirà automaticamente la frammentazione.  

Non è previsto incapsulamento, poiché i messaggi sono semplici stringhe senza intestazioni aggiuntive. 

Non è prevista conferma dei pacchetti e controllo del flusso.

Servizi di Trasmissione: Non vengono forniti servizi aggiuntivi come sicurezza o qualità del servizio. Si consiglia di considerare l’uso di protocolli di sicurezza come TLS a livello di trasporto. 

Nota: si potrebbe usare UDP per i soli dati di monitoraggio e TCP per gli altri.

**Fase di Connessione a Livello Applicativo**

1. **Connessione TCP**: L’EcoBox stabilisce una connessione TCP con il server.

2. **Scambio degli ID**: Dopo l’instaurazione della connessione TCP, EcoBox e server si scambiano gli identificatori:

	I. **EcoBox ID** ("ECOBOX_ID:<id>"): L’EcoBox invia il proprio identificatore al server.

		Esempio: "ECOBOX_ID:12345" indica che l’ID dell’EcoBox è 12345.

	II. **Server ID** ("SERVER_ID:<id>"): Il server risponde inviando il proprio identificatore.

		Esempio: "SERVER_ID:67890" indica che l’ID del server è 67890.

3. **Conferma di Connessione Applicativa**: Il server conferma l’instaurazione della connessione con un messaggio di benvenuto.

4. **Messaggio di Benvenuto**: "Welcome to EWMP" conferma che la connessione applicativa è stata stabilita correttamente.

Dopo questa fase, si può procedere con l’invio dei messaggi operativi, che devono includere gli ID scambiati per garantire l’identificazione corretta delle comunicazioni.

**Messaggi Operativi**

**1. Messaggi inviati dalle EcoBox al server**
	- **Stato di riempimento**: %FILL:<EcoBox_ID>:<Server_ID>:<percentage>
		Questo messaggio indica al server la percentuale di riempimento dell’EcoBox, identificata dal suo ID.
		Esempio: %FILL:12345:67890:85 indica che l’EcoBox con ID 12345 è piena all’85% e comunica con il server con ID 67890.
	-  **Tipo di rifiuto raccolto**: %TYPE:<EcoBox_ID>:<Server_ID>:<device type>
		Comunica al server il tipo di dispositivo elettronico raccolto dall’EcoBox.
		Esempio: %TYPE:12345:67890:Cellulare segnala al server 67890 che l’EcoBox 12345 ha raccolto un cellulare.
	-  **Segnalazioni di errore**: %ERROR:<EcoBox_ID>:<Server_ID>:<error code>
		Se l’EcoBox rileva un malfunzionamento, invia un messaggio di errore contenente gli ID e il codice di errore.
		Esempio: %ERROR:12345:67890:DOOR_BLOCKED segnala un problema di blocco dello sportello nell’EcoBox 12345.

**2. Messaggi inviati dal server alle EcoBox**
	- **Reset**: %RESET:<EcoBox_ID>:<Server_ID>
		Questo comando indica all’EcoBox di ripristinare il proprio stato dopo che è stata svuotata, includendo gli ID.
		Esempio: %RESET:12345:67890 resetta lo stato dell’EcoBox 12345 sul server 67890.
	- **Segnalazione di intervento**: %MAINTENANCE:<EcoBox_ID>:<Server_ID>:<scheduled time>
		Il server comunica all’EcoBox quando è previsto un intervento di manutenzione, includendo l’ID della EcoBox e del server. Il campo scheduled time è nel formato YYYY-MM-DD#HH:MM
		Esempio: %MAINTENANCE:12345:67890:2024-09-28#10:00 indica che l’EcoBox 12345 ha un intervento programmato per il 28 settembre 2024 alle ore 10:00 dal server 67890.
	- **Cambio modalità operativa**: %MODE:<EcoBox_ID>:<Server_ID>:<mode>
		Il server può cambiare la modalità operativa dell’EcoBox. Il campo mode può assumere due valori: SAVING_ON per attivare il risparmio energetico, SAVING_OFF per disattivarlo.
		Esempio: %MODE:12345:67890:SAVING_ON imposta l’EcoBox 12345 in modalità risparmio energetico con il server 67890.

**Sequenza di Scambio Messaggi**
1. **Connessione TCP**: L’EcoBox si connette al server via TCP.
2. **Scambio ID**: L’EcoBox invia %ECOBOX_ID:<id>, e il server risponde con %SERVER_ID:<id>.
3. **Messaggio di Benvenuto**: Il server invia "Welcome to EWMP", confermando la connessione applicativa.
4. **Stato di Riempimento**: L’EcoBox invia %FILL:<EcoBox_ID>:<Server_ID>:<percentage>.
5. **Tipo di Rifiuto**: L’EcoBox invia %TYPE:<EcoBox_ID>:<Server_ID>:<device type>.
6. **Segnalazioni di errore, porta bloccata**: %ERROR:<EcoBox_ID>:<Server_ID>:<error code>
7. **Messaggi del Server**: Il server invia %MAINTENANCE:<EcoBox_ID>:<Server_ID>:<time>
8. **Aggiornamenti o Chiusura della Connessione**: L’EcoBox continua a inviare aggiornamenti o chiude la connessione.


### Sequenze temporali
da fare :P