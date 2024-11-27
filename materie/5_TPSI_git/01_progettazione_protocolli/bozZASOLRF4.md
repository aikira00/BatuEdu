# Esercizio: Gestione dei Rifiuti Elettronici

Una città ha deciso di migliorare la gestione dei rifiuti elettronici, come cellulari, computer e altri dispositivi elettronici dismessi, installando delle EcoBox intelligenti in vari punti della città. Queste EcoBox sono collegate a un server centrale e devono comunicare con esso per tenere aggiornato lo stato delle raccolte e ricevere istruzioni su eventuali interventi necessari, come lo svuotamento quando sono piene o la risoluzione di guasti.

Si è scelto di non utilizzare HTTP per questa comunicazione, preferendo sviluppare un proprio protocollo basato su TCP.

Le EcoBox, una volta connesse, inviano periodicamente aggiornamenti al server, informandolo sul livello di riempimento, specificando la percentuale di spazio ancora disponibile. Inoltre, se una EcoBox rileva problemi, come un blocco nello sportello o un malfunzionamento del sensore, comunica immediatamente questi errori al server. Il server, a sua volta, può rispondere inviando comandi alle EcoBox, come il ripristino dei dati dopo uno svuotamento o la notifica che un intervento di manutenzione è stato programmato. Inoltre, può essere cambiata la modalità operativa dell’EcoBox per ottimizzare il consumo energetico o per altri scopi tecnici.

## Soluzione

### Electronic Waste Management Protocol (EWMP)

#### Stato del Documento

Stato attuale del protocollo: **draft**. Questo protocollo è in fase di sviluppo per l’implementazione del sistema di EcoBox nella città. Consente la comunicazione tra le EcoBox e un server centrale.

#### Riepilogo

Il protocollo EWMP consente alle EcoBox di inviare informazioni sullo stato di riempimento e sul tipo di rifiuto raccolto al server. Il server, a sua volta, può inviare comandi per il reset delle EcoBox e segnalazioni di intervento. Il protocollo utilizza una connessione TCP per garantire l’affidabilità e la corretta consegna dei messaggi.

### Panoramica del Protocollo

Per la comunicazione tra EcoBox e server, i messaggi saranno inviati sotto forma di stringhe di testo formattate. Di seguito è descritto il formato generale per i messaggi:

#### Tipi di Messaggi

Il protocollo EWMP prevede due principali categorie di messaggi: quelli inviati dalle EcoBox al server e quelli inviati dal server alle EcoBox. Ogni tipo di messaggio ha un formato specifico e uno scopo chiaro.

1. **Messaggi inviati dalle EcoBox al server**

   Le EcoBox inviano diversi tipi di messaggi per informare il server sullo stato attuale e sugli eventi significativi. I principali tipi di messaggi includono:

   - **Stato di riempimento** (`%FILL:<percentage>`): Questo messaggio comunica al server la percentuale di riempimento dell’EcoBox. È fondamentale per la pianificazione della raccolta e per garantire che le EcoBox non strabordino.  
     **Esempio**: `"%FILL:85"` indica che l’EcoBox è piena all’85%.

   - **Tipo di rifiuto raccolto** (`%TYPE:<device type>`): Con questo messaggio, l’EcoBox informa il server del tipo di dispositivo elettronico che ha raccolto. Questo aiuta il server a categorizzare e gestire meglio i rifiuti.  
     **Esempio**: `"%TYPE:Cellulare"` indica che è stato raccolto un cellulare.

   - **Segnalazioni di errore** (`%ERROR:<error code>`): Se l’EcoBox riscontra problemi operativi, come un malfunzionamento del sensore o un blocco nello sportello, invia immediatamente un messaggio di errore al server per richiedere assistenza.  
     **Esempio**: `"%ERROR:DOOR_BLOCKED"` segnala un problema di blocco della porta.

2. **Messaggi inviati dal server alle EcoBox**

   Il server invia messaggi di risposta e istruzioni alle EcoBox per garantire un funzionamento efficace e coordinato. I principali tipi di messaggi includono:

   - **Messaggio di benvenuto** (`"Welcome to EWMP"`): All’atto della connessione, il server accoglie l’EcoBox, confermando l’avvenuta connessione.

   - **Comando di reset** (`"%RESET"`): Questo messaggio istruisce l'EcoBox a ripristinare il proprio stato dopo che è stata svuotata, assicurando che i dati di riempimento siano azzerati.

   - **Segnalazione di intervento** (`%MAINTENANCE:<scheduled time>`): Quando il server prevede un intervento di manutenzione, invia un messaggio per informare l'EcoBox della programmazione dell’intervento.  
     **Esempio**: `"%MAINTENANCE:2024-09-28T10:00:00"` indica che un intervento di manutenzione è programmato per quella data e ora.

   - **Cambio modalità operativa** (`"%MODE:<mode>"`): Il server può anche modificare le impostazioni operative dell'EcoBox per ottimizzare il consumo energetico o per altre esigenze tecniche.  
     **Esempio**: `"%MODE:SAVING"` imposta l’EcoBox in modalità di risparmio energetico.

### Esempio di Flusso di Messaggi

Un flusso tipico di comunicazione tra un’EcoBox e il server potrebbe includere:

1. **Connessione**: L’EcoBox si connette al server.
2. **Messaggio di Benvenuto**: Il server risponde con un messaggio di benvenuto.
3. **Stato di Riempimento**: L’EcoBox invia il proprio stato di riempimento.
4. **Tipo di Rifiuto**: L’EcoBox comunica il tipo di rifiuto raccolto.
5. **Comando di Conferma**: Il server conferma la ricezione delle informazioni o fornisce ulteriori istruzioni.
6. **Segnalazione di Manutenzione**: Se necessario, il server invia una notifica di intervento programmato.
7. **Chiusura della Connessione**: L’EcoBox può decidere di chiudere la connessione o continuare a inviare aggiornamenti periodicamente.

Il protocollo utilizza TCP per garantire un’affidabilità nella consegna dei messaggi e per mantenere l’integrità dei dati. TCP è scelto per la sua capacità di gestire la sequenza dei pacchetti e il controllo degli errori.

Il server ascolta sulla porta **6000**, un numero di porta non riservato, per evitare conflitti con altri servizi di rete.

### Scambio Messaggi

Il protocollo prevede i seguenti passaggi per lo scambio di messaggi tra EcoBox e server:

1. L’EcoBox si connette al server.
2. Il server invia un messaggio di benvenuto all’EcoBox, ad esempio: "Welcome to EWMP".
3. L’EcoBox invia il livello di riempimento, ad esempio: "%FILL:75%".
4. L’EcoBox invia il tipo di rifiuto raccolto, ad esempio: "%TYPE:Computer".
5. Il server invia una risposta di conferma o un comando, ad esempio: "CONFIRM" o "%RESET".
6. Il server può inviare una segnalazione di intervento, ad esempio: "%MAINTENANCE_REQUIRED".
7. L’EcoBox chiude la connessione o continua a inviare aggiornamenti periodicamente.

### Aspetti del Protocollo

1. **Indirizzamento**  
   Non è previsto un indirizzamento a livello applicativo, in quanto il protocollo utilizza l’indirizzamento TCP.

2. **Frammentazione e Riassemblaggio**  
   L’EWMP non richiede frammentazione specifica, poiché i messaggi sono brevi. In caso di congestione, TCP gestirà automaticamente la frammentazione.

3. **Incapsulamento**  
   Non è previsto incapsulamento, poiché i messaggi sono semplici stringhe senza intestazioni aggiuntive.

4. **Controllo della Connessione**  
   Il protocollo non è connesso a livello applicativo e sfrutta TCP per il controllo della connessione e la conferma dei pacchetti.

5. **Servizio Confermato o Non Confermato**  
   Il protocollo non implementa una conferma dei pacchetti, ma utilizza il servizio confermato tramite TCP, garantendo l’arrivo dei pacchetti.

6. **Controllo degli Errori**  
   L’EWMP prevede la gestione degli errori tramite messaggi di errore in caso di problemi di comunicazione, ad esempio: "%ERROR:CONNECTION_LOST".

7. **Controllo del Flusso**  
   Non è previsto controllo del flusso a livello applicativo; TCP gestirà questo aspetto a livello di trasporto.

8. **Multiplexing e Demultiplexing**  
   Non è previsto multiplexing a livello applicativo; l’EcoBox comunica direttamente con il server.

9. **Servizi di Trasmissione**  
   Non vengono forniti servizi aggiuntivi come sicurezza o qualità del servizio. Si consiglia di considerare l’uso di protocolli di sicurezza come TLS a livello di trasporto.

### Gestione degli Errori

Nel caso in cui si verifichino errori di connessione o trasmissione di messaggi, EcoBox e server invieranno messaggi di errore specifici.

1. **EcoBox invia errore al server**:
   - **Formato generale**: `"%ERROR:<Codice_Errore>"`
  - **Esempi**:
     - **Errore di Connessione**: `"%ERROR:CONNECTION_LOST"`
     - **Dati Non Validi**: `"%ERROR:INVALID_DATA"`
     - **Errore di Tipo di Rifiuto**: `"%ERROR:UNKNOWN_TYPE"`

### Comandi del Server

Il server invia messaggi in formato testuale. I possibili comandi sono:

- **Messaggio di Benvenuto**: `"Welcome to EWMP"`
- **Conferma di Stato**: `"CONFIRM"`
- **Comando di Reset**: `"%RESET"`
- **Segnalazione di Intervento**: `"%MAINTENANCE_REQUIRED"`
- **Messaggi di Errore**: `"ERROR: <DESCRIZIONE>"`
  - **Errore di Connessione**: `"ERROR: CONNECTION_LOST"`
  - **Dati Non Validi**: `"ERROR: INVALID_DATA"`
  - **Errore di Tipo di Rifiuto**: `"ERROR: UNKNOWN_TYPE"`

### Comandi dell’EcoBox

L’EcoBox invia comandi in formato testuale. Può inviare:

- **Livello di Riempimento**: `"%FILL:75%"`
- **Tipo di Rifiuto Raccolto**: `"%TYPE:Computer"`

### Sequenze Temporali