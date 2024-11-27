3 domande

1 su connessioni TCP/UDP

1 su socket

1 su progettazione protocollo su uno dei compiti eseguiti in classe



DOMANDA 1 Spiega perché le seguenti association identificano comunicazioni diverse:

a. TCP , 200.100.50.20, 2780, 150.75.31.5, 50123

b. UDP , 200.100.50.20, 2780, 150.75.31.5, 50123

c. TCP , 200.100.50.20, 2780, 150.75.31.5, 50200

d. TCP , 200.100.50.20, 2780, 150.75.31.3, 50123



DOMANDA 2 Supponi di dover scrivere il codice di un server che usi a livello di trasporto i servizi offerti dal protocollo TCP , rispondi in modo esaustivo alle seguenti domande.

a. Scrivi l’istruzione necessaria affinché il server possa creare un socket utilizzando un determinato numero di porta.

b. Scrivi la corrispondente istruzione che dovrà essere presente nel client affinché venga creato un socket per connettersi successivamente a questo server , ndicando i parametri che dovranno essere passati e spiegandone il significato.

c. Scrivi l’istruzione necessaria affinché il server possa accettare una richiesta diconnessione da parte di un client.

d. Spiega cosa avviene a livello di trasporto in corrispondenza dell’esecuzione delle struzioni indicate nel punto (c).

e. Spiega cosa viene creato a livello di trasporto in corrispondenza della seguente riga di codice nel server:

PrintWriter out = new PrintWriter(new OutputStreamWriter(onnection.getOutputStream()));


DOMANDA 3 progettazione
Dati fli RFC 3 e RFC 4 svolti in classe, motivare perché è necessario che il protocollo applicativo implementi l'aseptto dell'indirizziamento nella progettazione del protocollo e perché indirizzi ip e porte non sono sufficienti.
	**Domanda 1 - Indirizzamento**: In base agli RFC 3 e RFC 4 analizzati in classe, spiega perché è fondamentale che il protocollo applicativo per le EcoBox implementi un sistema di indirizzamento specifico, e perché l’uso di indirizzi IP e porte non garantisce un’identificazione univoca e sicura per ogni EcoBox.
	**Domanda 2 - Struttura del Protocollo**: Considerando le informazioni tratte dagli RFC discussi, perché è essenziale progettare protocolli con una struttura definita? Cosa significa per un protocollo avere una sintassi e una semantica chiare?
	**Domanda 3** Basandoti sugli RFC 3 e 4, spiega in che modo una progettazione attenta dei protocolli può ottimizzare l’uso delle risorse di rete (come banda e capacità di elaborazione). Perché è fondamentale considerare queste risorse nella fase di progettazione?

	Domanda 3 progettazine
	Con riferimento agli RFC svolti in classe, motiva perché è necessario progettare dei protocolli e cosa vuol dire.
**Domanda 8 - Performance e Latency**: In che modo le differenze nelle API socket tra TCP e UDP influenzano la performance e la latenza delle applicazioni? Quali funzioni possono essere ottimizzate per migliorare le prestazioni in ciascun protocollo?

Le differenze nelle API socket tra TCP e UDP influenzano notevolmente la performance e la latenza delle applicazioni. TCP è un protocollo orientato alla connessione, il che significa che stabilisce una connessione prima di inviare dati e garantisce la consegna ordinata e senza errori dei pacchetti. Questo processo introduce latenza, poiché il protocollo deve gestire l’handshake iniziale, la conferma di ricezione dei pacchetti e la ritrasmissione in caso di perdita di dati. Le funzioni delle API socket, come send() e recv(), operano in modo affidabile ma possono rallentare la trasmissione.

Al contrario, UDP è un protocollo senza connessione che invia pacchetti senza stabilire una connessione preliminare. Questo riduce notevolmente la latenza, poiché i pacchetti possono essere inviati immediatamente utilizzando funzioni come sendto() e recvfrom(). Tuttavia, UDP non garantisce l’ordine di consegna o l’affidabilità, quindi è più adatto per applicazioni dove la velocità è cruciale, come streaming video o giochi online. Pertanto, le scelte di progettazione delle API socket influenzano direttamente l’equilibrio tra performance e latenza, rendendo ogni protocollo più adatto a scenari specifici.

DOMANDA 4 video socket protocollo
https://www.youtube.com/watch?v=Vdc8TCESIg8
https://www.youtube.com/watch?v=fK7oAc_V-Kk
https://www.youtube.com/watch?v=hi9BVTNvl4c
https://www.youtube.com/watch?v=WyrxZB7Mbs4

- date le API socket, dire quali funzionoi sono presentisia i tCP e in UDP e quali in emtrambi

**Che cos’è un protocollo di rete e perché è fondamentale nelle comunicazioni tra dispositivi?**

**escrivi brevemente il processo di creazione di un socket server e di un socket client in un’applicazione di rete.**

• _Risposta attesa:_ In genere, il server crea un socket e si mette in ascolto di connessioni in entrata, mentre il client crea un socket e si connette al server. Una volta stabilita la connessione, i dati possono essere inviati e ricevuti.

**uali sono i passaggi principali per creare una connessione server-client con socket?**