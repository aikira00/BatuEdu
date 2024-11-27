# Compito 01-02: Conversione da base 2 a base 10**
Importante!!!
CREARE UN NUOVO FILE GOOGLE FOGLI, rinominarlo con **vostroCognome_01-02_conversione_da-2-a-10**. 
Spostarlo nella cartella che avete creato su GDrive: home -> informatica -> primoAnno -> googleFogli

Nel foglio di calcolo allegato, trovate la seguente struttura per convertire un numero dalla **base 2** alla **base 10** e dalla **base 8** alla **base 10**:

![Struttura data](01-02_conversione_da-2-a-10.png)

- Il **numero da convertire** viene inserito nella cella accanto alla dicitura: “Numero da convertire formato da 10 cifre”.

- Il numero da convertire deve sempre essere composto da **10 cifre**. Se non tutte le cifre sono presenti, inserite degli zeri nelle posizioni più significative (ovvero le posizioni più a sinistra nel numero).

- Nella riga **Cifre** trovate già inserita la formula che estrae le cifre in posizione **0, 1, …, 9** nelle celle da D6 a M6.

**Righe da completare:**

1. **Potenza base**: inserite le potenze della base 2 (per la conversione da base 2) o della base 8 (per la conversione da base 8) per ogni posizione. Attenzione ad usare i riferimenti assoluti e relativi in modo corretto. Per calcolare la potenza della base elevata alla posizione di una cifra, usate la formula **POTENZA**. Potete trovare maggiori informazioni nel seguente tutorial: [Tutorial Google Sheets - Formula POTENZA](https://support.google.com/docs/answer/3093433?hl=it&sjid=7205696594401168587-EU#null)

2. **Risultato parziale cifra moltiplicata per base elevata a posizione**: moltiplicate la cifra binaria (o ottale) per la potenza della base corrispondente.

3. **Risultato in base 10**: sommate i risultati parziali per ottenere il numero finale in base 10.

**Attenzione!**

1. Per la conversione dalla **base 8**, dovete **riadattare le formule** usate per la **base 2** nella riga 6 (Cifre) alla riga 15 (Cifre) per la base 8.

2. Usate correttamente i **riferimenti assoluti** e **riferimenti relativi** per trascinare le formule, in modo che siano corretti i riferimenti alle celle.

Ecco un esempio di risultato finale:

![Struttura data](01-02_conversione_da-2-a-10_sol.png)

Buon lavoro!



