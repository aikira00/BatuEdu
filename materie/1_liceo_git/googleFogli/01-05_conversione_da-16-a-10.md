# Compito 01-05: Conversione da base 16 a base 10**
Importante!!!
Riprendete il foglio di calcolo dell'esercitazione 01-02_conversione-da-2-a-10 e fatene una copia, rinominarlo con **vostroCognome_01-05_conversione_da-16-a-10**. 
Se avete fatto tutto giusto nell'esercitazione precedente, la copia verrà creata nella cartella attuale e non avete bisogno di spostare il file nella cartella su GDrive: home -> informatica -> primoAnno -> googleFogli.

Aggiungete la sezione per convertire da base 16 a base 10

![Struttura data](01-05_conversione_da-16-a-10.png)

- Il **numero da convertire** viene inserito nella cella accanto alla dicitura: “Numero da convertire formato da 10 cifre”.

- Il numero da convertire deve sempre essere composto da **10 cifre**. Se non tutte le cifre sono presenti, inserite degli zeri nelle posizioni più significative (ovvero le posizioni più a sinistra nel numero).

- Nella riga **Cifre** inserite la formula che estrae le cifre in posizione **0, 1, …, 9** nelle celle da D24 a M24.

**Righe da completare:**

1. **Potenza base**: inserite le potenze della base 16. Attenzione ad usare i riferimenti assoluti e relativi in modo corretto. Per calcolare la potenza della base elevata alla posizione di una cifra, usate la formula **POTENZA**. Potete trovare maggiori informazioni nel seguente tutorial: [Tutorial Google Sheets - Formula POTENZA](https://support.google.com/docs/answer/3093433?hl=it&sjid=7205696594401168587-EU#null)
2. **Cifre con lettere**: adatta la formula per estrarre le cifre. Ricorda che il numero deve essere sempre composto da 10 cifre, quindi inserisci il valore **0** nelle posizioni più a sinistra, ovvero nelle cifre più significative.
3. **Cifre con cerca.vert, da lettere a numeri**: è necessario convertire le lettere esadecimali nelle cifre corrette. Utilizzare la funzione **CERCA.VERT** in combinazione con la tabella di riferimento **Tabella Riferimento Base Esadecimale**. Potete trovare maggiori informazioni nel seguente tutorial: [Tutorial Google Sheets - Formula CERCA.VERT](https://support.google.com/docs/answer/3093318?hl=it&sjid=7013453192677893803-EU#null)
	1. Suggerimento: Supponiamo che la lettera che vuoi convertire sia in **D1**. Puoi utilizzare la seguente formula: =CERCA.VERT(D1, A1:B6, 2, FALSO). 
		1. **D1**: Questa è la cella in cui inserisci la lettera (A, B, C, D, E, F).
		2. **A1:B6**: Questo è l’intervallo della tabella di riferimento che contiene le lettere e i loro valori corrispondenti.
		3. **2**: Indica che vuoi restituire il valore dalla seconda colonna della tabella (i numeri decimali).
		4. **FALSO**: Specifica che la corrispondenza deve essere esatta.
	Se D1 contiene “A”, la formula restituirà 10; se D1 contiene “C”, la formula restituirà 12 e così via.
4. **Risultato parziale cifra moltiplicata per base elevata a posizione**: moltiplicate le cifre della riga **Cifre con cerca.vert, da lettere a numeri** per la potenza della base.
5. **Risultato in base 10**: sommate i risultati parziali per ottenere il numero finale in base 10.

**Attenzione!**

1. Usate correttamente i **riferimenti assoluti** e **riferimenti relativi** per trascinare le formule, in modo che siano corretti i riferimenti alle celle.
2. Nella tabella  **Tabella Riferimento Base Esadecimale** attenzione a formattare correttamente le colonne. La colonna **Simbolo** deve essere formattata come **testo** mentre la colonna **Valore** come numero. 

Ecco un esempio di risultato finale:

![Struttura data](01-05_conversione_da-16-a-10_sol.png)

Buon lavoro!



