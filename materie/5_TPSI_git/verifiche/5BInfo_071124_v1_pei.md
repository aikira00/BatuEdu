# Verifica di TPSI 

La seguente verifica deve essere svolta entro la scadenza indicata dal docente. La verifica sarà valutata sulla base della correttezza delle formule e dei risultati, e sulla capacità di applicare correttamente  i concetti visti in classe. L'intervallo dei voti è [2-10] calcolati su 10 punti.
Per l’assegnazione dei punti saranno considerati i seguenti criteri:  **Aderenze alla traccia** (la risposta è pertinente e rispetta la traccia), **Correttezza logica e completezza della soluzione/risposta** (la risposta è completa, precisa e correttamente motivata).

Sono previsti **0.5 punti bonus** per l’elaborato ordinato. Saranno presi in considerazione i seguenti aspetti: il foglio della verifica e il foglio protocollo devono essere **correttamente intestati**, l’elaborato deve essere **leggibile** e **ben organizzato**.

**Rispondere a tutte le domande su foglio protocollo, riportando la domanda in modo ordinato.**
Esempio: Domanda 1 - Risposta:

MISURE DISPENSANTIVE/COMPENSATIVE APPLICATE:
__________

** (2 pt) Domanda 1 ** he cos'è una "socket" in programmazione e qual è il suo ruolo nelle comunicazioni di rete? Utilizzando gli esempi di codice forniti, descrivi come si crea una socket server e una socket client in Java. Spiega i passaggi necessari per stabilire una connessione tra server e client. Inoltre, cosa accade a livello di trasporto quando il metodo _accept_ viene chiamato nel codice del server?

**Esempio di Codice**

**Server:**
ServerSocket serverSocket = new ServerSocket(1234);
Socket clientSocket = serverSocket.accept(); 

**Client:**
Socket socket = new Socket("server_address", 1234);

	
** (1 pt) Domanda 2 ** Spiega cosa rappresentano le seguenti quintuple e perché identificano comunicazioni diverse tra loro:

- a. `TCP, 200.100.50.20, 2780, 150.75.31.5, 50123`
- b. `UDP, 200.100.50.20, 2780, 150.75.31.5, 50123`
- c. `TCP, 200.100.50.20, 2780, 150.75.31.5, 50200`
- d. `TCP, 200.100.50.20, 2780, 150.75.31.3, 50123`

Per ogni quintupla, descrivi in che modo il protocollo, gli indirizzi IP e le porte specificate determinano una comunicazione univoca rispetto alle altre.

** ( 2 pt) Domanda 3** Facendo riferimento agli RFC progettati in classe sui protocolli applicativi, che cos’è un protocollo di rete e perché è essenziale per garantire comunicazioni affidabili ed efficienti tra dispositivi? Motiva la tua risposta con un esempio pratico tratto dall'esercizio di laboratorio riportato sotto

## Esercizio Date Protocollo Laboratorio 
Scrivere un protocollo per gestire la seguente comunicazione tra un client e un server multithread, sapendo che il client invia al server:
1. Una data per sapere i giorni che intercorrono fra la data inviata e oggi.

2. Una data per sapere il giorno della settimana della data inviata.

3. Due date per sapere il numero di giorni che intercorrono fra le due.

4. Un comando per terminare.

### Formato della Data
La data deve essere inviata con il seguente formato: **AAAA-MM-GG**.

### Gestione degli Errori
- Nel caso di invio di una data non nel formato richiesto, il server invia un messaggio di errore esplicativo.
- Identificare altri due tipi di errori che si possono verificare e i relativi messaggi di errore.

