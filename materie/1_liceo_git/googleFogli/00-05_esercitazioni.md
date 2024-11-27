# 00-05 Esercitazione Guidata: Uso delle Percentuali in un Foglio di Calcolo con Formattazione e Riferimenti, riferimento assoluto e relativo 

 **Obiettivi:**
1. Comprendere l'uso dell'operatore percentuale nei calcoli.
2. Imparare a calcolare una percentuale di un valore.
3. Utilizzare la formattazione con percentuali per visualizzare correttamente i risultati.
4. Formattare il foglio di calcolo per renderlo più leggibile e professionale.
5. Comprendere la differenza tra riferimenti assoluti e relativi.
6. Capire come il foglio di calcolo interpreta i numeri decimali quando viene applicata la formattazione percentuale.


## Parte 1: Inserimento Dati

1. Apri un nuovo foglio di calcolo.
2. **Inserisci i seguenti titoli per le colonne:**
   - **A1**: "Vendite Giornaliere"
   - **B1**: "Sconto (%)"
   - **C1**: "Importo Sconto"
   - **D1**: "Prezzo Dopo Sconto"
   - **E1**: "Percentuale sul Totale"

3. **Inserisci i dati nelle righe successive:**
   - Nella colonna **A** (Vendite Giornaliere):
     - **A2**: 1000
     - **A3**: 1200
     - **A4**: 1500
     - **A5**: 1100
     - **A6**: 1300

   - Nella colonna **B** (Sconto %):
     - Inserisci i valori come numeri decimali con la virgola, rappresentanti la percentuale di sconto (es. 10% = 0,10):
       - **B2**: 0,10
       - **B3**: 0,15
       - **B4**: 0,20
       - **B5**: 0,05
       - **B6**: 0,12

## Parte 2: Calcolo della Percentuale e Formattazione delle Celle

### **Calcolo dell'importo dello sconto e del prezzo dopo lo sconto**
1. **Calcolo dell'importo dello sconto:**
   - Seleziona la cella **C2**.
   - Digita la seguente formula:
     ```
     =A2*B2
     ```
   - Premi **Invio**. Trascina la formula verso il basso fino a **C6**.

2. **Calcolo del prezzo dopo lo sconto:**
   - Seleziona la cella **D2**.
   - Digita la seguente formula:
     ```
     =A2-C2
     ```
   - Premi **Invio**. Trascina la formula verso il basso fino a **D6**.

### **Formattazione delle Celle**
1. **Formattazione del testo nelle celle A1:E1:**
   - Seleziona l'intervallo **A1:E1**.
   - Applica il grassetto e allinea il testo al centro. Manda il testo a capo in modo automatico
     
2. **Applicazione di bordi e sfondo:**
   - Seleziona l'intervallo **A1:E6**.
   - Applica un bordo esterno a tutto l'intervallo selezionando **Formato -> Bordi -> Tutti i bordi**.
   - Applica un colore di sfondo leggero alle celle di intestazione **A1:E1** 

3. **Formattazione dei numeri:**
   - **Importante:** Se i valori nella colonna **B** sono stati inseriti come numeri decimali (es. 0,10 per il 10%), seleziona l'intervallo **B2:B6** e applica il formato percentuale.
   - Dopo l'applicazione della formattazione percentuale, il valore 0,10 diventerà 10%. Il foglio di calcolo moltiplica il numero decimale per 100 e aggiunge il simbolo **%**. Diminuisci le posizioni decimali in modo che non si visualizzino numeri dopo la virgola.
   - Seleziona le celle nelle colonne **C** e **D** (C2:D6) e formatta come numeri con due decimali. Diminuisci le posizioni decimali in modo che non si visualizzino numeri dopo la virgola.
   - Seleziona le celle nella colonna **E** (E2:E6) e applica il formato percentuale.

   **Nota sulla Formattazione Percentuale:**
   - Quando applichi la formattazione percentuale a un numero decimale (come 0,10), il foglio di calcolo lo interpreta come 10% e lo visualizza come tale. Tuttavia, se inserisci direttamente un numero come 10 nella cella, e poi applichi la formattazione percentuale, il foglio di calcolo lo mostrerà come 1000% perché considererà il numero intero come già moltiplicato per 100.

## Parte 3: Calcolo di una Parte del Totale con Riferimenti Assoluti e Relativi

### **Calcolo della Percentuale sul Totale**
1. **Calcolo della somma delle vendite:**
   - Seleziona la cella **A7**.
   - Digita "Totale Vendite".
   - Nella cella **B7**, calcola la somma delle vendite giornaliere:
     ```
     =SOMMA(A2:A6)
     ```
   - Premi **Invio**.

2. **Calcolo della percentuale che ogni giorno rappresenta sul totale:**
   - Seleziona la cella **E2**.
   - Digita la seguente formula:
     ```
     =A2/$B$7
     ```
   - Premi **Invio**. Trascina la formula verso il basso fino a **E6**.

   **Spiegazione del riferimento assoluto e relativo:**
   - **Riferimento Relativo:** Quando si trascina una formula, il riferimento alle celle si aggiorna automaticamente in base alla posizione relativa. Ad esempio, nella formula **=A2/B7**, **A2** è un riferimento relativo, quindi diventa **A3** quando la formula è copiata in **E3**.
   - **Riferimento Assoluto:** Usando il simbolo **$$** davanti a una colonna o riga, si blocca quel riferimento. Ad esempio, **$B$7** è un riferimento assoluto (sia riga che colonna) che non cambia quando la formula viene copiata in altre celle.
   - 
## Parte 4: Calcolo di una Parte del Totale con Riferimenti Assoluti e Relativi
   - Finisci di formattare il foglio di calcolo a piacimento.


## Parte 5: Riflessione e Domande
- Come influisce l'uso del riferimento assoluto e relativo sulla copia delle formule in diverse celle?
- Quali vantaggi offre la formattazione in termini di leggibilità e comprensione del foglio di calcolo?
- Come cambia il risultato quando applichi la formattazione percentuale a numeri inseriti come decimali? E se invece inserissi direttamente un numero intero?