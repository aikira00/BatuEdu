brew install telnet

	- **windows** pannello controllo -> programm -> abilita funzioni windows -> flag client Telnet

telnet 127.0.0.1 <numero_porta>

**IDE**

NetBEans o IntelliJ -> progetto Java Application Maven

IntelliJ no versione community, serve ultimate


# Socket

## Struttura classi

Server
- Lettura dalla rete di una stringa
- Parsing della stringa e scomposizione negli elementi costituenti
- Calcolo dell'operazione (app del server)
- Costruzione stringa da inviare

Client
- I/O utente (app del client)
- Costruzione stringa da inviare
- Scrittura rete della stringa
- Lettura dalla rete di una stringa
- Parsing della stringa e scomposizione negli elementi costituenti

MyReader -> LSI <- App <- CSI <- MySender
più LSI -> MyServer
o LSI -> MyClient

Questo modello non gestisce full duplex

Per ora client con console (bloccante) GUI no

``boolean done = app.read() //se lettura quit booleano falso
while(!done){
	// ricevo risultato da server
        // smantello risultato
        //mostro risultato app lato client
        // done = nuova stringa input e via
}``

hashmap operazione intera e stringa


# libreria TCPIOLibrary

progetto Maven
eseguire comando maven install per installare libreria nel sistema
riferirla poi dal pom.xml

in questo modo più semplice per web services che hanno diverse dipendenze

IntelliJ vedere sulla destra menu Maven ed eseguire comando mvn install scegliendo percorso in cui salvare libreria

# Interazioni tra clients

SPM non solo uno ma collezione di tutti i sender dei clients

evoluzione -> ogni client ha il suo SPM e la collezione di SPM degli altri. Devo identificare i clients con un id. 
Mappa id client, SPM 

Il server, quando crea APP, passa anche la mappa e l'id

ogni client avrà un id compotosto da numero_porta@indirizzo_ip

Esempio mappa

12350@192.45.67.809, suo SPM
12351@192.45.67.809 suo SPM
34567@192.08.45.46 suo SPM

etc.

La mappa deve essere dichiarata ed allocata all'interno del main e passata a tutti. 

Message#source#message a tutti nel metodo che gestisce arrivo del messaggio

private_message#source#message nel meotdo corrispondente al solo destinatario

App prende la mappa e passa tutti gli utenti connessi UserList#user#user#...#user => nel costruttore dell'app all'utente singolo

UserJoin#user => sventaglio lista SPM e faccio sapere che si è connesso un nuovo client => nel costruttore dall'app a tutti gli altri
UserQui#user stessa cosa quando un client si disconnette => nel metodo che gestisce il quit dell'utente spedito a tutti gli altri

![[interazione_tra_client.png]]

## client GUI


IAppObserver interfaccia => implementata da GUI 
- updateEsplicita
-  update 

App con setobserver this costrurttore con IAppObserver 
App implementa due interfacce, la solita ICommandConsumer e IEventObserver

App osserva la GUI (quando utente fa richiesta) => IEventObserver con sendFine, sendEsplicita, sendOrtogonale, sendPArallela
- utente sceglie di finire (click su X)
- utente chiede di avere versione esplicita equazione
- utente chiede equazione retta ortogonale
- utente chiede di avere retta parallela 


## NetBeans to IntelliJ

prokject structure modules => source
progetto gui come libreria (progetto separato)
check pom
libreria TPIO con logger, creare logger in client e server