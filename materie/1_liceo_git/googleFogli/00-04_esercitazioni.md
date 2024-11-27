# 04 Esercitazione Guidata : Uso Avanzato degli Operatori Aritmetici e delle Formule**

 **Obiettivi:**
1. Imparare a usare gli operatori aritmetici di base: addizione, sottrazione, moltiplicazione e divisione.
2. Comprendere la differenza tra espressioni aritmetiche e formule predefinite nel foglio di calcolo.
3. Utilizzare le parentesi per controllare la precedenza delle operazioni.

## **Parte 1: Inserimento Dati**

1. Apri un nuovo foglio di calcolo.
2. Nella colonna **A**, inserisci i seguenti numeri:
   - **A1**: 40
   - **A2**: 20
   - **A3**: 10
   - **A4**: 5

3. Nella colonna **B**, inserisci i seguenti numeri:
   - **B1**: 8
   - **B2**: 4
   - **B3**: 2
   - **B4**: 1

## **Parte 2: Operazioni Aritmetiche**

### **Sottrazione**
1. Seleziona la cella **C1**.
2. Digita la seguente espressione aritmetica per sottrarre il valore di **B1** da **A1**:
   ```
   =A1-B1
   ```
3. Premi **Invio**. Dovresti ottenere 32 come risultato.
4. Trascina la formula verso il basso fino a **C4**.

### **Divisione**
1. Seleziona la cella **D1**.
2. Digita la seguente espressione aritmetica per dividere il valore di **A1** per **B1**:
   ```
   =A1/B1
   ```
3. Premi **Invio**. Il risultato sarà 5.
4. Trascina la formula verso il basso fino a **D4**.

## **Parte 3: Differenza tra Espressioni Aritmetiche e Formule**

### **Somma con Formula Integrata**
1. Seleziona la cella **E1**.
2. Digita la seguente formula per sommare i valori di **A1** e **B1**:
   ```
   =SOMMA(A1;B1)
   ```
3. Premi **Invio**. Il risultato sarà 48.
4. Trascina la formula verso il basso fino a **E4**.

### **Somma con Espressione Aritmetica**
1. Seleziona la cella **F1**.
2. Digita la seguente espressione aritmetica per sommare i valori di **A1** e **B1**:
   ```
   =A1+B1
   ```
3. Premi **Invio**. Il risultato sarà sempre 48, ma questa volta l’operazione è eseguita senza l’uso della funzione SOMMA.
4. Trascina la formula verso il basso fino a **F4**.

### **Parte 4: Uso delle Parentesi per la Precedenza**

### **Operazione senza Parentesi**
1. Seleziona la cella **G1**.
2. Digita la seguente espressione:
   ```
   =A1+B1*2
   ```
3. Premi **Invio**. Il risultato sarà 56, poiché la moltiplicazione viene eseguita prima della somma (B1 * 2 = 16, quindi 40 + 16 = 56).

## **Operazione con Parentesi**
1. Seleziona la cella **H1**.
2. Digita la seguente espressione con parentesi:
   ```
   =(A1+B1)*2
   ```
3. Premi **Invio**. Il risultato sarà 96, poiché la somma viene eseguita prima della moltiplicazione (A1 + B1 = 48, quindi 48 * 2 = 96).

4. Trascina entrambe le formule verso il basso fino a **H4**.

## **Parte 5: Esercizi Pratici**

1. **Differenza e divisione combinate:**
   - Calcola la differenza tra **A1** e **B1**, poi dividi il risultato per il valore di **B2** e inserisci il risultato in **I1**.
   - Se hai inserito la formula corretta, il risultato è 8
   - Trascina la formula fino alla cella **I4**. I risultati saranno 8, 8 e un errore DIV/0. Perché?

2. **Media dei risultati con priorità definita:**
   - Calcola la media dei risultati delle espressioni in **G1** e **H1** e metti il risultato in **J1**.
   - Il risultato in **J2** sarà 76.
   - Trascina fino a **J4**. I risultati saranno 38, 19 e 9,5.
   
3. **Somma e divisione con espressione aritmetica:**
   - Somma i valori di **A2** e **A3**, quindi dividi il risultato per la somma di **B2** e **B3**. Inserisci il risultato in **K1**.
   -  - Il risultato in **K1** sarà 5.
   - Trascina fino a **K4**. I risultati saranno 5, 5 e 5.
   - Nota cosa succede nell'ultima formula in **K4** dove la cella **B6** non contiene valori
   

## **Parte 6: Riflessione e Domande**
- Cosa accade se cambiamo l'ordine delle operazioni in un'espressione? Come cambiano i risultati?
- Come influenzano le parentesi la sequenza delle operazioni in un foglio di calcolo?
- Quali sono i vantaggi dell'uso delle formule integrate rispetto alle espressioni aritmetiche?