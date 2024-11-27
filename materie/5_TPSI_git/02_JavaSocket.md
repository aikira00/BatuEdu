# 5TPSI_02_javaSocket
Libro di testo 
	Unità 1 Lezione 5 pg. 44-52.
	Unità 2 - Il socket e la comunicazione con i protocolli TCP/UDP

* 2.1 I socket e i protocolli per la comunicazione di rete pp.106-112
    * Generalità
    * Le porte di comunicazione e i socket
* 2.2 La connessione tramite socket pp.113-143
    * Generalità
    * Famiglie e tipi di socket
    * Trasmissione unicast e multicast
    * Lab 1 Java socket
    * Lab 2 Java socket: realizzazione di un server TCP
    * Lab 3 Realizzazione di un server multiplo in Java
    * Lab 4 Java socket: un’animazione client-server
      
# API Socket

finire di vedere https://www.youtube.com/watch?v=WyrxZB7Mbs4 


# Java API Socket
[Link oracle networking tutorial](https://docs.oracle.com/javase/tutorial/networking/TOC.html)

https://www.tutorialspoint.com/java/java_networking.htm
[Maffucci - esercizi sui socket in Java](https://docs.google.com/document/d/1udjdcIC8sOXWCjaNZtO26IQOgKzK4fCEMeh4RzUO4JY/edit#heading=h.gjdgxs)
[video Java socket tutorial](https://www.youtube.com/watch?v=aEDV0WlwXTs)
[video java socket tutorial thread](https://www.youtube.com/watch?v=Zm5fKTpovO0)
[video java server riceve numeri interi](https://www.youtube.com/watch?v=aIFHMzBcg5Y)
[video java server che riceve stringhe](https://www.youtube.com/watch?v=aIFHMzBcg5Y)

appunti da qui http://www.cs.unibo.it/~sangio/SO_currentAA/Luc_SO/Schirinzi/Socket.pdf e da Azzolini 15 socket per TCP e 16 per UDP

https://www.codejava.net/java-se/networking/java-socket-client-examples-tcp-ip

https://ebooks.inflibnet.ac.in/csp12/chapter/java-socket-programming/

Ecco una descrizione concisa dell'API Java Socket e cosa succede dopo che un client contatta un server bloccato su `accept()`:

---

### API Java Socket

L'API Java Socket fornisce le classi e i metodi necessari per stabilire connessioni di rete tra client e server. Le due principali classi coinvolte sono:

- **`java.net.Socket`**: Utilizzata dal client per connettersi a un server.
- **`java.net.ServerSocket`**: Utilizzata dal server per ascoltare le richieste di connessione dai client.

#### Principali Metodi

- **`Socket`**:
  - **`Socket(String host, int port)`**: Crea un socket e si connette al server specificato.
  - **`getInputStream()`** e **`getOutputStream()`**: Ottengono i flussi di input e output per la comunicazione.

- **`ServerSocket`**:
  - **`ServerSocket(int port)`**: Crea un server socket che ascolta sulla porta specificata.
  - **`accept()`**: Blocca e attende una connessione da un client. Restituisce un `Socket` per comunicare con il client.

---

### Comportamento Dopo che il Client Contatta il Server

1. **Server in Attesa (`accept()` Bloccato)**:
   - Quando un server avvia il metodo `accept()` su un oggetto `ServerSocket`, il thread che esegue `accept()` è bloccato e in attesa di una connessione in ingresso. Il server non può eseguire altre operazioni finché non viene accettata una connessione.

2. **Client Stabilisce Connessione**:
   - Il client crea un `Socket` e chiama il costruttore `Socket(String host, int port)`, specificando l'indirizzo IP del server e la porta a cui connettersi.
   - Il client invia una richiesta di connessione al server.

3. **Connessione Stabilita**:
   - Quando il server accetta la connessione, il metodo `accept()` restituisce un nuovo `Socket` che rappresenta la connessione con il client. Questo nuovo `Socket` viene utilizzato per la comunicazione con il client.
   - Il server può ora utilizzare il flusso di input e output del nuovo `Socket` per scambiare dati con il client.

4. **Continua l’Esecuzione**:
   - Dopo aver accettato la connessione, il server può continuare a chiamare `accept()` per accettare ulteriori connessioni, se necessario. Ogni connessione verrà gestita da un nuovo `Socket`.

---

**Esempio di Codice**

**Server:**
```java
ServerSocket serverSocket = new ServerSocket(1234);
Socket clientSocket = serverSocket.accept(); // Blocca finché non arriva una connessione
// Usa clientSocket per comunicare con il client
```

**Client:**
```java
Socket socket = new Socket("server_address", 1234);
// Usa socket per comunicare con il server
```

Questo meccanismo consente al server di gestire più client, uno alla volta, se si utilizza un approccio sincrono, oppure di gestire più connessioni contemporaneamente utilizzando tecniche di multithreading o asincrone.


**Maffucci CLIL**

Answer to the following questions.

1. Describe the Java classes used to create a TCP socket.
2. Describe the Java classes used to create a UDP socket.
3. Watch [this video](https://youtu.be/aEDV0WlwXTs) and answer to the following questions.
   1. In this video is not used a method that you used in all your TCP socket projects. Are you able to identify it?
   2. The class Socket uses different constructors, [here](https://docs.oracle.com/javase/7/docs/api/java/net/Socket.html) you can find all of them. Try to identify which of them requires the use of the method you found on question one.

## Propedeutica

### UML

vedere tutorial class diagram https://www.visual-paradigm.com/guide/uml-unified-modeling-language/uml-class-diagram-tutorial/

materiale università bologna https://www.cs.unibo.it/~cianca/wwwpages/labspo/

diagrammi sequenza https://www.visual-paradigm.com/guide/uml-unified-modeling-language/what-is-sequence-diagram/

https://www.edrawsoft.com/it/article/uml-aggregazione-vs-composizione.html



### Design Pattern

### I/O in java
vedere tutorial https://docs.oracle.com/javase/tutorial/essential/io/index.html 

### Thread 

gestire i thread con executor https://www.html.it/pag/61449/gestire-thread-con-gli-executor/
https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/Executor.html
https://www.baeldung.com/java-executor-service-tutorial
