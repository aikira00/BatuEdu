
**Esercizio di progettazione del protocollo di comunicazione Client-Server per una banca**

**Obiettivo:**

Progettare e implementare un protocollo di comunicazione client-server per gestire operazioni bancarie di base. Il client sarà un’applicazione che consente a un utente di interagire con un server bancario per eseguire operazioni come il login, la visualizzazione del saldo, l’estratto conto, prelievi, trasferimenti di denaro, e la visualizzazione delle transazioni. Il server risponderà ai comandi del client e fornirà i risultati delle operazioni.

  

**Comandi:**

**Client → Server**:

- Login#user#pin: Effettua il login di un utente con nome utente e PIN.
-  Balance: Richiede il saldo del conto dell’utente.
-  AccountStatement: Richiede l’estratto conto dell’utente.
-  Withdrawal#amount: Richiede un prelievo di una certa somma dal conto.
- Transfer#account#amount: Richiede il trasferimento di una somma a un altro conto.
-  Transactions#previousdate#nextdate: Richiede la lista delle transazioni avvenute tra due date.
-  Logout: Effettua il logout dell’utente.

2. **Server → Client**:
- LoginResult#outcome: Risponde con l’esito del tentativo di login (success o fail).
-  Balance#amount: Risponde con il saldo corrente del conto.
-  AccountStatement#date§type§amount...#date§type§amount#balance: Risponde con l’estratto conto formato da una lista di transazioni, ogni transazione ha data, tipo (ad esempio, deposit, withdrawal, transfer), e importo, seguita dal saldo attuale.
-  Withdrawal#outcome: Risponde con l’esito del prelievo (success o fail).
- Transfer#outcome: Risponde con l’esito del trasferimento (success o fail).
-  Transaction#date§type§amount...#date§type§amount: Risponde con la lista di transazioni effettuate tra le date specificate.
-  Error#message: Risponde con un messaggio di errore se c’è un problema con una richiesta.