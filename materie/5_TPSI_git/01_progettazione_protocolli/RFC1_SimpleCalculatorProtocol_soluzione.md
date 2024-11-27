#### Simple Calculator Protocol (SCP)

##### Stato Documento
Questo RFC è una possibile soluzione del secondo esercizio di laboratorio assegnato dal Prof. Bellucci ed è in stato di lavorazione. Protocollo proposto per l’interazione client-server in cui il client invia due numeri e un’operazione aritmetica (`+`, `-`, `*`, `/`) e il server risponde con il risultato.

##### Riepilogo
Il Simple Calculator Protocol (SCP) consente a un client di connettersi a un server per eseguire operazioni aritmetiche di base. Il servizio permette a un client di eseguire operazioni aritmetiche di base con un server remoto. Dopo l’iniziale messaggio di benvenuto dal server, il client invia i due numeri in sequenza e poi l’operazione aritmetica. Il server calcola il risultato e lo restituisce al client, quindi chiude la connessione.

##### Ringraziamenti
Un ringraziamento alla Prof.ssa Maria Grazia Maffucci.

##### Panoramica del Protocollo
Il Simple Calculator Protocol utilizza un’architettura client-server, in cui il client invia richieste di calcolo e il server le elabora. Il protocollo sfrutta una connessione TCP per garantire l’affidabilità nella consegna dei messaggi e la correttezza del risultato. Il protocollo TCP è stato scelto perché assicura l’affidabilità e l’integrità dei dati. In questo contesto, è cruciale che i numeri e l’operazione arrivino correttamente al server e che il risultato venga consegnato senza errori. Poiché TCP garantisce l’ordinamento dei pacchetti e la consegna, è la scelta migliore per un protocollo che richiede precisione nei calcoli.

Il server ascolta sulla porta `5000`, un numero di porta non riservato. Questa scelta permette di evitare conflitti con altri servizi di rete noti.

###### Scambio messaggi:
1. Il client si connette al server.
2. Il server invia un messaggio di benvenuto al client (es. `Welcome`).
3. Il client invia il primo numero (es. `5`).
4. Il client invia il secondo numero (es. `3`).
5. Il client invia l’operazione (es. `+`).
6. Il server calcola il risultato e lo invia al client (es. `Risultato: 8`).
7. Il server chiude la connessione.

###### Dettagli tecnici
1. **Indirizzamento**: Non è previsto un indirizzamento a livello applicativo; il protocollo utilizza l’indirizzamento gestito dal livello di trasporto.
2. **Frammentazione e riassemblaggio**: SCP non richiede frammentazione specifica, poiché il trasferimento di dati è limitato a messaggi di piccole dimensioni.
3. **Incapsulamento**: Non è previsto incapsulamento, poiché client e server si scambiano solo dati in formato testuale.
4. **Controllo della connessione**: SCP si appoggia su TCP, che garantisce l’arrivo dei pacchetti.
5. **Servizio confermato o non confermato**: SCP si basa su un servizio confermato grazie a TCP.
6. **Controllo degli errori**: SCP gestisce il controllo degli errori a livello applicativo inviando messaggi di errore in caso di input non valido.
7. **Controllo del flusso**: Non è previsto a livello applicativo; viene gestito dal protocollo TCP.
8. **Multiplexing e demultiplexing**: SCP non prevede multiplexing.
9. **Servizi di trasmissione**: SCP non offre servizi aggiuntivi come la sicurezza o la qualità del servizio.

##### Comandi del Server
Il server invia messaggi in formato testuale. I possibili comandi del server sono:

- **Messaggio di benvenuto**: Questo è il primo messaggio che il server invia al client per fargli sapere che è in ascolto.

    ```text
    "Welcome"
    ```

- **Risultato dell'operazione**: Dopo che ha ricevuto due numeri dal client.

    ```text
    "1030"
    ```

- **Messaggio di errore**: Se l'operazione effettuata porta a un errore di calcolo (e.g., divisione per zero):

    ```text
    "CODICE_ERRORE, <DESCRIZIONE>"
    ```

###### Codici di errore:
- `"DIV_0"`: Tentativo di divisione per zero.
  - <DESCRIZIONE>: "Division by zero is not allowed"
- `"OVERFLOW"`: Il risultato eccede i limiti numerici.
  - <DESCRIZIONE>: "The result exceeds the allowed numerical limits"
- `"INVALID_OP"`: Operazione non valida o non supportata.
  - <DESCRIZIONE>: "The operation is not supported. Allowed operations: +, -, *, /"
- `"INVALID_NUM"`: Uno dei numeri inviati dal client non è valido.
  - <DESCRIZIONE>: "One or both of the numbers are not valid integers"

##### Comandi del Client
Il client invia i comandi in formato testuale, consistenti in due numeri e un'operazione.

###### Esempi:
- Numero in formato stringa: `"530"`
- Operazioni ammesse: `["+", "-", "*", "/"]`

##### Sequenza Temporale
Utilizza lo strumento [sequencediagram.org](https://sequencediagram.org/) per creare i seguenti diagrammi.

###### Esempio 1: Operazione di somma
```plaintext
title SCP - example
Client->(1)Server: open TCP connection
Server->(2)Client: "Welcome"
Client->(3)Server: "5"
Client->(4)Server: "1005"
Client->(5)Server: "+"
Server->(6)Client: "1010"
Server->(7)Client: close TCP connection
```

###### Esempio 2: Operazione di moltiplicazione
```plaintext
title SCP - example
Client->(1)Server: open TCP connection
Server->(2)Client: "Welcome"
Client->(3)Server: "5"
Client->(4)Server: "35"
Client->(5)Server: "*"
Server->(6)Client: "175"
Server->(7)Client: close TCP connection
```

###### Esempio 3: Errore DIV_0 (divisione per zero)
```plaintext
title SCP - example error DIV_0
Client->(1)Server: open TCP connection
Server->(2)Client: "Welcome"
Client->(3)Server: "14"
Client->(4)Server: "0"
Client->(5)Server: "/"
Server->(6)Client: "DIV_0, Division by zero is not allowed"
Server->(7)Client: close TCP connection
```

###### Esempio 4: Errore `INVALID_OP`
```plaintext
title SCP - example error INVALID_OP
Client->(1)Server: open TCP connection
Server->(2)Client: "Welcome"
Client->(3)Server: "2"
Client->(4)Server: "8"
Client->(5)Server: "ˆ"
Server->(6)Client: "INVALID_OP, The operation is not supported. Allowed operations: +, -, *, /"
Server->(7)Client: close TCP connection
```

###### Esempio 5: Errore `INVALID_NUM`
```plaintext
title SCP - example error INVALID_NUM
Client->(1)Server: open TCP connection
Server->(2)Client: "Welcome"
Client->(3)Server: "2"
Client->(4)Server: "baubau"
Client->(5)Server: "ˆ"
Server->(6)Client: "INVALID_NUM, One or both of the numbers are not valid integers"
Server->(7)Client: close TCP connection
```

###### Esempio 6: Errore `OVERFLOW`
```plaintext
title SCP - example error OVERFLOW
Client->(1)Server: open TCP connection
Server->(2)Client: "Welcome"
Client->(3)Server: "999999999999999999999999999999"
Client->(4)Server: "999999999999999999999999999999"
Client->(5)Server: "*"
Server->(6)Client: "OVERFLOW, The result exceeds the allowed numerical limits"
Server->(7)Client: close TCP connection
'''