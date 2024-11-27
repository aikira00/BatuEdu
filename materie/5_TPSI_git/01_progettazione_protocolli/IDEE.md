
CORRIERE
Un corriere espresso ha molti centri di accettazione e smistamento distribuiti sul territorio nazionale identificati dal codice di avviamento postale del luogo in cui si trovano; i pacchi sono identificati da un codice numerico generato al momento dell’accettazione. Un server TCP tiene traccia del centro accetta- zione e dei centri di smistamento in cui è transi- tato ogni singolo pacco con associata la data/ora di accettazione o transito (timestamp): quando il server viene avviato carica da un file in formato CSV l’elenco dei pacchi da consegnare con la lista dei centri in cui è transitato e i relativi timestamp e quando viene arrestato genera il file per il pro- prio riavvio. Mentre è attivo il server è in grado di accettare i seguenti comandi: A. accettazione di un nuovo pacco con gene- razione del codice numerico, registrazione del centro di accettazione e del relativo time- stamp ; B. transito del pacco da un centro di smista- mento; richiesta del centro di accettazione e dei cen- tri di smistamento da cui è transitato un de- terminato pacco con relativo timestamp (nella risposta deve essere fornito lo stato del pac- co: già consegnato o non ancora consegnato); D. consegna del pacco al destinatario finale con registrazione del timestamp. Dopo aver definito e documentato il protocollo applicativo implementato, realizzare in linguag- gio Java il server TCP concorrente per il corriere espresso.

SPORT
Nello sport dell’orienteering i con- correnti dimostrano il passaggio dai punti di tap- pa acquisendo con l’APP del proprio smartphone il QR-code esposto: l’APP invia l’identificativo della tappa costituito da una stringa alfanume- rica e quello numerico del concorrente registrato nell’APP a un server TCP. Dopo aver definito e documentato un protocollo testuale applicativo che permetta l’invio al ser- ver dell’identificativo numerico del concorrente e di quello alfanumerico del QR-code di una tap- pa, p

SMART_RIFIUTI
I cassonetti smart per i rifiuti si aprono solo previa lettura di una tessera RFID che fornisce un identificativo numerico univoco. Il sistema di apertura del cassonetto contatta un server per verificare che la tessera risulti regi- strata e ottiene in risposta il consenso o meno all’apertura: in caso di consenso viene memoriz- zata la data/ora in modo da impedire successive aperture nelle 72 ore successive. Il servizio di distribuzione delle tessere utilizza tessere RFID con identificativo numerico univo- co preimpostato in fabbrica: per ogni nuova tes- sera da distribuire deve quindi essere registrato sul server tale identificativo; nel caso di denun- cia al servizio di smarrimento o sottrazione di una tessera, il corrispondente identificativo vie- ne eliminato dal server allo scopo di impedirne un uso non autorizzato. Sono richiesti: collo testuale applicativo implementato dal server;

CAFFE
n una gara di degustazione di caf- fè ogni varietà è identificata da un codice a barre applicato sul tavolo in cui è disponibile per l’as- saggio. I giudici di gara possono valutare ogni singolo caffè con un voto compreso tra 1 e 10 e dispongono di un’APP per il proprio smartphone per fotografare il codice a barre e inserire il voto relativo al rispettivo caffè: l’APP comunica via Wi-Fi con un server che ha lo scopo di registrare tutti i voti espressi per la classifica finale. Il server, dopo aver inizialmente caricato l’elenco dei codici a barre di tutti i caffè in gara da un file in formato CSV, deve consentire la registrazione dei voti assegnati dai giudici (è possibile limitare il numero di voti esprimibili per ogni caffè a 10) noltre deve rispondere a un comando di richie- sta avente come argomento il codice a barre di uno specifico caffè con il voto medio. Sono richiesti: noltre deve rispondere a un comando di richie- sta avente come argomento il codice a barre di uno specifico caffè con il voto medio. Sono richiesti: implementato dal server TCP; 

SUPERMERCATO TESSERA PUNTI
na catena di supermercati dota i propri clienti di una tessera con un codice nume- rico univoco per la raccolta di punti utilizzabili per ottenere sconti sugli acquisiti: ogni 10 € di spesa viene attribuito un punto che vale 1 € di sconto. La gestione delle tessere è gestita da un server che implementa le seguenti funzionalità: A. aggiunta dei punti relativi alla spesa effettua- ta utilizzando una tessera; B. restituzione a richiesta dei punti registrati su una tessera; C. sottrazione dei punti utilizzati per ottenere uno sconto; D. aggiunta di una nuova tessera con punteggio iniziale pari a 0. Si deve implementare il server come applicazio- ne Java utilizzando il protocollo TCP; a questo scopo sono richieste: di comunicazione tra client e server


METEO
Progettare un protocollo di rete che permetta a un client di chiedere a un server informazioni sul meteo. Il client può richiedere:

-  riguardo al giorno corrente, per una certa provincia italiana (individuata dalla sigla), la temperatura (in gradi celsius o farenheit) oppure lo stato (pioggia, nuovoloso, sereno) oppure la velocità del vento (in km/h) e la direzione (NE, N, NO, O, SO, S, SE, E).

- riguardo ai giorni successivi, fino a 7 giorni dopo la data corrente, la temperatura massima e minima giornaliera e la probabilità di pioggia (in percentuale).

Gestire eventuali errori.

Seguendo il format fornito, indicare il compito del protocollo, la sintassi dei comandi di client e server e almeno due diagrammi di sequenza.

SERRA
Progetta un protocollo per il monitoraggio di una serra in cui vari **sensori** inviano regolarmente dati ambientali (come temperatura, umidità, luminosità e umidità del suolo) a un **server centrale**. Il server raccoglie i dati e, in caso di letture incoerenti o incomplete, può richiederne la ritrasmissione. Inoltre, il server deve poter inviare comandi ai sensori per richiedere una rilevazione istantanea, modificare alcune **impostazioni dei sensori** (come l’intervallo di rilevazione, le soglie di allarme per temperatura o umidità e la sensibilità del sensore) e gestire allarmi in caso di valori anomali o malfunzionamenti dei sensori.