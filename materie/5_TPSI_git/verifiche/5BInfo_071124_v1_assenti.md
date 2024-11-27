# Verifica di TPSI - 2h

La seguente verifica deve essere svolta entro la scadenza indicata dal docente. La verifica sarà valutata sulla base della correttezza delle formule e dei risultati, e sulla capacità di applicare correttamente  i concetti visti in classe. L'intervallo dei voti è [2-10] calcolati su 10 punti.
Per l’assegnazione dei punti saranno considerati i seguenti criteri:  **Aderenze alla traccia** (la risposta è pertinente e rispetta la traccia), **Correttezza logica e completezza della soluzione/risposta** (la risposta è completa, precisa e correttamente motivata).

Sono previsti **0.5 punti bonus** per l’elaborato ordinato. Saranno presi in considerazione i seguenti aspetti: il foglio della verifica e il foglio protocollo devono essere **correttamente intestati**, l’elaborato deve essere **leggibile** e **ben organizzato**.

**Rispondere a tutte le domande su foglio protocollo, riportando la domanda in modo ordinato.**
Esempio: Domanda 1 - Risposta:

MISURE DISPENSANTIVE/COMPENSATIVE APPLICATE:
__________

** (1 pt) Domanda 1 **  Definisci il termine _socket_ e descrivi il suo ruolo nella comunicazione di rete. Spiega la differenza tra _socket stream_ e _socket datagram_, indicando il livello di trasporto in cui operano. Descrivi anche il concetto di _porta_ nel contesto dei socket e il significato di _connessione logica_ tra client e server.

** (2 pt) Domanda 2 ** Supponi di dover scrivere il codice di un server che usi a livello di trasporto i servizi offerti dal protocollo TCP , rispondi in modo esaustivo alle seguenti domande.
	a. Scrivi l’istruzione necessaria affinché il server possa creare un socket utilizzando un determinato numero di porta.
	b. Scrivi la corrispondente istruzione che dovrà essere presente nel client affinché venga creato un socket per connettersi successivamente a questo server, indicando i parametri che dovranno essere passati e spiegandone il significato.
	c. Scrivi l’istruzione necessaria affinché il server possa accettare una richiesta di connessione da parte di un client.
	d. Spiega cosa avviene a livello di trasporto in corrispondenza dell’esecuzione delle istruzioni indicate nel punto (c).
	e. Spiega cosa viene creato a livello di trasporto in corrispondenza della seguente riga di codice nel server:
```
PrintWriter out = new PrintWriter(new OutputStreamWriter(connection.getOutputStream()));
```


** (1 pt) Domanda 2 ** Spiega cosa rappresentano le seguenti quintuple e perché identificano comunicazioni diverse tra loro:

- a. `TCP, 200.100.50.20, 2780, 150.75.31.5, 50123`
- b. `UDP, 200.100.50.20, 2780, 150.75.31.5, 50123`
- c. `TCP, 200.100.50.20, 2780, 150.75.31.5, 50200`
- d. `TCP, 200.100.50.20, 2780, 150.75.31.3, 50123`

Per ogni quintupla, descrivi in che modo il protocollo, gli indirizzi IP e le porte specificate determinano una comunicazione univoca rispetto alle altre.

** (6 pt) Domanda 4** Facendo riferimento al seguente contesto applicativo

	
	Un protocollo di rete permette a un *client* di richiedere a un *server* informazioni meteo specifiche. Il protocollo deve essere in grado di supportare le seguenti funzionalità:
	
	A) Il client può richiedere i dati meteo per la giornata corrente relativi a una specifica provincia italiana, identificata tramite la sigla di due lettere (ad es., RM per Roma, MI per Milano). Le informazioni che il client può richiedere per la giornata corrente includono:
	
	- **Temperatura**: espressa in gradi Celsius o Fahrenheit.
	- **Condizioni meteo**: stato del meteo (ad es., *pioggia*, *nuvoloso*, *sereno*).
	- **Vento**: velocità del vento (in km/h) e direzione (ad es., NE, N, NO, O, SO, S, SE, E).
	
	B)Il client può richiedere previsioni meteo fino a un massimo di 7 giorni dopo la data corrente, per la provincia specificata. Le informazioni disponibili per ogni giorno futuro sono:
	
	- **Temperatura massima e minima giornaliera** (espressa in gradi Celsius o Fahrenheit).
	- **Probabilità di pioggia**: espressa in percentuale.
	
	C) Il protocollo deve prevedere la gestione di errori comuni, ad esempio:
	
	- Provincia non valida o non disponibile.
	- Richiesta per un giorno fuori dal range supportato (oltre 7 giorni).
	- Richiesta di dati meteo non disponibili per la specifica provincia o data.


discuti le seguenti parti essenziali, giustificandole in modo puntuale:

- a. (0,5 pt) il tipo di servizio usato a livello di trasporto e la porta usata dal server;
- b. (2 pt) le caratteristiche del protocollo, **selezionando accuratamente** gli aspetti più rilevanti tra:
		  - indirizzamento
		  - frammentazione e riassemblaggio
		  - incapsulamento
		  - controllo della connessione
		  - servizio confermato o non confermato
		  - controllo degli errori
- c. (2) l’elenco dei comandi dei singoli protocolli con una spiegazione sintetica della sua funzione generale e della funzione di ogni singolo campo;
- d. (1,5 pt)almeno due diagrammi di sequenza che mostri lo scambio temporale dei messaggi tra il client e il server .

Suggerimento: 	Nella progettazione del protocollo, tratta in modo completo e motivato:
	
- **Formato dei messaggi**: Definisci il formato dei messaggi di richiesta e risposta, dettagliando la struttura di ciascun campo (es., tipo di richiesta, codice provincia, unità di misura, ecc.).
- **Codici di errore**: Assegna codici di errore specifici per i principali casi di errore, e specifica come il server deve comunicarli al client.
- **Struttura delle Risposte**: Descrivi come verranno restituiti i dati richiesti, organizzati per rispondere in modo chiaro alle richieste del client.