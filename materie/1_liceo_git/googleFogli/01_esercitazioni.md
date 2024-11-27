# 1Liceo_01_GoogleFogli

Nelle esercitazioni per la conversione di numeri tra le basi e la formattazione dei fogli di calcolo, si introducono le seguenti formule e funzioni:

**Esercitazione: Conversione da Base 2 a Base 10**

1. **Somma dei Prodotti:**
   - **Formula Usata:** `=SOMMA(B4:E4)`
   - **Descrizione:** Somma i valori delle celle che contengono i risultati della moltiplicazione tra le cifre binarie e le rispettive potenze di 2. Questa formula calcola il numero decimale finale sommando tutti i prodotti ottenuti.

 **Esercitazione: Conversione da Base 10 a Base 2**

1. **Modulo:**
   - **Formula Usata:** `=B3%2`
   - **Descrizione:** Calcola il resto della divisione del quoziente per 2, che rappresenta la cifra binaria (0 o 1) per ciascun passo della divisione.

2. **Divisione Intera:**
   - **Formula Usata:** `=INT(B3/2)`
   - **Descrizione:** Calcola il quoziente della divisione del numero per 2, che viene utilizzato nel passo successivo della conversione.

3. **Concatenazione:**
   - **Formula Usata:** `=CONCATENA(C7;C6;C5;C4;C3)`
   - **Descrizione:** Unisce i resti ottenuti in una stringa per formare il numero binario completo. La funzione CONCATENA (o `=CONCATENATE` a seconda della versione del foglio di calcolo) unisce i valori di celle specificate in una singola stringa di testo.

---
 **Formule Specifiche e Loro Applicazioni**

1. **Funzione `SOMMA`:**
   - **Scopo:** Somma una serie di numeri.
   - **Esempio di Utilizzo:** `=SOMMA(B4:E4)` per sommare i risultati della moltiplicazione.

2. **Operatore Modulo `%`:**
   - **Scopo:** Restituisce il resto della divisione di un numero.
   - **Esempio di Utilizzo:** `=B3%2` per ottenere il resto della divisione del quoziente per 2.

3. **Funzione `INT`:**
   - **Scopo:** Restituisce la parte intera di un numero, eliminando i decimali.
   - **Esempio di Utilizzo:** `=INT(B3/2)` per calcolare il quoziente intero della divisione.

4. **Funzione `CONCATENA`:**
   - **Scopo:** Unisce più stringhe di testo in una sola.
   - **Esempio di Utilizzo:** `=CONCATENA(C7;C6;C5;C4;C3)` per creare il numero binario concatenando i resti.

Queste formule aiutano a gestire e manipolare i dati numerici e testuali nei fogli di calcolo per eseguire calcoli e conversioni tra diverse basi numeriche.



  

#### **Obiettivo:**
Convertire un numero binario (base 2) in un numero decimale (base 10) utilizzando un foglio di calcolo.

---

### **Parte 1: Comprendere la Conversione da Base 2 a Base 10**

**Introduzione al concetto:**
Per convertire un numero binario in base 10, devi sommare le potenze di 2 corrispondenti alle cifre binarie che sono 1.

**Esempio:**
Il numero binario **1101** si converte come segue:
\[
1101_2 = 1 \times 2^3 + 1 \times 2^2 + 0 \times 2^1 + 1 \times 2^0 = 8 + 4 + 0 + 1 = 13_{10}
\]

---

### **Parte 2: Preparare il Foglio di Calcolo**

1. **Inserire il Numero Binario:**
   - Apri un nuovo foglio di calcolo.
   - Vai alla cella **A1** e scrivi "Numero Binario".
   - Nella cella **B1**, inserisci il numero binario che vuoi convertire, ad esempio **1101**.

2. **Espansione delle Cifre Binari:**
   - Vai alla cella **A2** e scrivi "Cifre".
   - Nelle celle **B2**, **C2**, **D2**, e **E2**, inserisci le singole cifre del numero binario:
     - **B2**: 1
     - **C2**: 1
     - **D2**: 0
     - **E2**: 1

3. **Inserire le Potenze di 2:**
   - Vai alla cella **A3** e scrivi "Potenze di 2".
   - Nelle celle **B3**, **C3**, **D3**, e **E3**, inserisci le potenze di 2:
     - **B3**: \(2^3\) (8)
     - **C3**: \(2^2\) (4)
     - **D3**: \(2^1\) (2)
     - **E3**: \(2^0\) (1)

---

### **Parte 3: Calcolo del Valore Decimale**

1. **Moltiplicazione delle Cifre per le Potenze di 2:**
   - Vai alla cella **A4** e scrivi "Prodotti".
   - Nella cella **B4**, inserisci la formula:
     ```
     =B2*B3
     ```
   - Premi **Invio** e trascina la formula verso destra fino alla cella **E4**.

2. **Somma dei Prodotti:**
   - Vai alla cella **A5** e scrivi "Numero Decimale".
   - Nella cella **B5**, inserisci la formula:
     ```
     =SOMMA(B4:E4)
     ```
   - Premi **Invio**.

---

### **Parte 4: Verifica e Formattazione**

1. **Verifica del Risultato:**
   - Controlla che il risultato sia corretto. Se hai inserito **1101** come numero binario, il risultato dovrebbe essere **13**.

2. **Formattazione del Foglio di Calcolo:**
   - **Colori e Stili:** Seleziona le celle **A1:E5** e applica un colore di sfondo leggero (ad esempio, un grigio chiaro) per distinguere l'intestazione e i dati.
   - **Bordi:** Applica un bordo esterno spesso alle celle **A1:E5** per migliorare la visibilità.
   - **Allineamento:** Centra il testo nelle celle da **B2** a **E4** e usa il grassetto per le intestazioni delle colonne (**A1**, **A2**, **A3**, **A4**, e **A5**).
   - **Formato Numerico:** Seleziona le celle **B2:E4** e applica un formato di numero con 0 decimali, se necessario.

---

### **Parte 5: Riflessione Finale**

- **Domande di Riflessione:**
  - Come cambia il numero binario con numeri decimali diversi?
  - Quali difficoltà hai incontrato e come le hai risolte?

---

### **Conclusione:**
Hai imparato a convertire un numero binario in un numero decimale e a formattare il foglio di calcolo per una presentazione chiara e professionale.

---

## **Esercitazione Guidata: Conversione di un Numero da Base 10 a Base 2**

#### **Obiettivo:**
Convertire un numero decimale (base 10) in un numero binario (base 2) utilizzando un foglio di calcolo.

---

### **Parte 1: Comprendere la Conversione da Base 10 a Base 2**

**Introduzione al concetto:**
Per convertire un numero decimale in base 2, dividi il numero per 2 e annota il resto. Continua con il quoziente fino a ottenere 0. I resti, letti dal basso verso l’alto, formano il numero binario.

**Esempio:**
Convertiamo **13**:
- 13 ÷ 2 = 6 resto 1
- 6 ÷ 2 = 3 resto 0
- 3 ÷ 2 = 1 resto 1
- 1 ÷ 2 = 0 resto 1

Il numero binario è **1101**.

---

### **Parte 2: Preparare il Foglio di Calcolo**

1. **Inserire il Numero Decimale:**
   - Apri un nuovo foglio di calcolo.
   - Vai alla cella **A1** e scrivi "Numero Decimale".
   - Nella cella **B1**, inserisci il numero decimale che vuoi convertire, ad esempio **13**.

2. **Creare una Tabella per la Conversione:**
   - Vai alla cella **A2** e scrivi "Divisione".
   - Vai alla cella **B2** e scrivi "Quoziente".
   - Vai alla cella **C2** e scrivi "Resto".

   - Vai alla cella **A3** e scrivi "Passo 1".
   - Vai alla cella **A4** e scrivi "Passo 2".
   - Continua a numerare i passi fino alla cella **A7** (o più in basso se necessario).

---

### **Parte 3: Calcolo della Conversione**

1. **Divisione e Calcolo del Resto:**
   - Vai alla cella **B3** e inserisci il numero decimale:
     ```
     =B1
     ```
   - Nella cella **C3**, calcola il resto della divisione:
     ```
     =B3%2
     ```
   - Nella cella **B4**, calcola il quoziente:
     ```
     =INT(B3/2)
     ```
   - Nella cella **C4**, calcola il resto del nuovo quoziente:
     ```
     =B4%2
     ```

   - Continua a copiare le formule nelle celle **B** e **C** verso il basso fino a quando il quoziente diventa 0.

2. **Raccogliere i Resti per Formare il Numero Binario:**
   - Vai alla cella **D2** e scrivi "Numero Binario".
   - Nella cella **D3**, inizia a raccogliere i resti dalla colonna **C**, partendo dall’ultimo ottenuto e risalendo verso il primo.

---

### **Parte 4: Automazione del Processo**

1. **Concatenazione dei Resti:**
   - Vai alla cella **E2** e scrivi "Numero Binario (Automatizzato)".
   - Nella cella **E3**, inserisci la formula per concatenare i resti:
     ```
     =CONCATENA(C7;C6;C5;C4;C3)
     ```
   - La formula mostrerà direttamente il numero binario nella cella **E3**.

---

### **Parte 5: Verifica e Formattazione**

1. **Verifica del Risultato:**
   - Controlla che il numero binario visualizzato sia corretto. Se hai inserito **13** come numero decimale, il risultato dovrebbe essere **1101**.

2. **Formattazione del Foglio di Calcolo:**
   - **Colori e Stili:** Seleziona le celle **A1:E3** e applica un colore di sfondo leggero (ad esempio, un grigio chiaro) per distinguere l'intestazione e i dati.
   - **Bordi:** Applica un bordo esterno spesso alle celle **A1:E3** per migliorare la visibilità.
   - **Allineamento:** Centra il testo nelle celle da **B3** a **C7** e usa il grassetto per le intestazioni delle colonne (**A1**, **A2**, **A3**).
   - **

## Domande test per verificare la compresione finale
### **Domande di Verifica sulle Formule Utilizzate nelle Esercitazioni**

#### **Domande per l'Esercitazione di Conversione da Base 2 a Base 10:**

1. **Somma dei Prodotti**
   - **Domanda:** Spiega come la formula `=SOMMA(B4:E4)` contribuisce al calcolo del numero decimale. Cosa succede se una delle celle nella gamma **B4:E4** contiene un errore?
   - **Risposta Attesa:** La formula `=SOMMA(B4:E4)` calcola la somma totale dei prodotti ottenuti moltiplicando le cifre binarie per le loro rispettive potenze di 2. Se una cella contiene un errore, la somma totale sarà errata, influenzando il risultato finale del numero decimale.

#### **Domande per l'Esercitazione di Conversione da Base 10 a Base 2:**

1. **Operatore Modulo `%`**
   - **Domanda:** Cosa rappresenta il risultato della formula `=B3%2` e come viene utilizzato nel processo di conversione da base 10 a base 2?
   - **Risposta Attesa:** La formula `=B3%2` restituisce il resto della divisione del quoziente per 2, che è 0 o 1. Questo resto rappresenta una cifra binaria e viene utilizzato per costruire il numero binario.

2. **Divisione Intera con `INT`**
   - **Domanda:** Qual è il ruolo della formula `=INT(B3/2)` nel processo di conversione e cosa rappresenta il valore calcolato?
   - **Risposta Attesa:** La formula `=INT(B3/2)` calcola il quoziente intero della divisione del numero decimale per 2. Questo valore rappresenta il nuovo quoziente da cui calcolare il resto nel passo successivo della conversione.

3. **Concatenazione con `CONCATENA`**
   - **Domanda:** Descrivi come la funzione `=CONCATENA(C7;C6;C5;C4;C3)` aiuta a ottenere il risultato finale della conversione. Cosa succede se una delle celle specificate contiene un valore errato o vuoto?
   - **Risposta Attesa:** La funzione `=CONCATENA(C7;C6;C5;C4;C3)` unisce i resti ottenuti durante la conversione per formare il numero binario finale. Se una delle celle contiene un valore errato o vuoto, il risultato concatenato sarà incompleto o errato, influenzando il numero binario visualizzato.

---

### **Domande Aggiuntive per Testare la Comprensione Generale:**

1. **Calcolo e Verifica:**
   - **Domanda:** Se converti il numero decimale 27 utilizzando il foglio di calcolo, quale dovrebbe essere il risultato binario? Usa le formule e la procedura descritta per confermare la risposta.
   - **Risposta Attesa:** La conversione di 27 in base 2 è **11011**. Gli studenti dovrebbero eseguire i passaggi della conversione utilizzando le formule per confermare questo risultato.

2. **Errori e Correzioni:**
   - **Domanda:** Quali tipi di errori potrebbero verificarsi durante l'uso delle formule per la conversione e come possono essere corretti? Fornisci un esempio di errore comune e la sua soluzione.
   - **Risposta Attesa:** Errori comuni possono includere errori di sintassi nelle formule, divisioni per 0, o celle vuote che influenzano i calcoli. Per correggere, è necessario verificare le formule, assicurarsi che tutte le celle contengano i valori corretti e controllare che le formule siano applicate correttamente.

## **Esercitazione: Correzione di Errori Evidenti nelle Formule e nei Dati**

 **Obiettivo:**
Identificare e correggere errori evidenti nelle formule e nei dati, come formule scritte male e valori non ammessi.

---

### **Scenario:**

Immagina di lavorare con un foglio di calcolo che contiene errori evidenti sia nelle formule che nei dati. Il tuo compito è identificare e correggere questi errori per assicurarti che il foglio di calcolo funzioni correttamente.

### **Parte 1: Analisi e Correzione degli Errori**

#### **Tabella 1: Conversione da Base 10 a Base 2**

| **A**               | **B**                      | **C**       | **D**                |
|---------------------|----------------------------|-------------|----------------------|
| Numero Decimale     | Quoziente                  | Resto       | Numero Binario       |
| 18                  | `=A2/2`                     | `=A2%2`     | `=CONCATENA(C2;C3;C4)` |
| 15                  | `=QUOZIENTE(A2,2)`          | `=A3%2`     | `=CONCATENA(C2;C3;C4)` |
| 25                  | `=INT(A4/3)`                | `=A4%2`     | `=C4`                |
|                     | *(Errore: divisione non intera)* | *(Errore: mancanza di resti successivi)* | *(Errore: concatenazione errata)* |

**Compiti:**
1. **Correggi la formula nella cella **B2** per calcolare correttamente il quoziente per la conversione da base 10 a base 2.**
2. **Correggi la formula nella cella **B3** per usare la funzione corretta di divisione intera.**
3. **Modifica la formula nella cella **D2** per concatenare correttamente tutti i resti.**
4. **Correggi la formula nella cella **B4** per calcolare il quoziente con la divisione intera corretta.**

#### **Tabella 2: Calcolo della Percentuale**

| **E**               | **F**       | **G**              |
|---------------------|-------------|--------------------|
| Nome                | Punteggio    | Percentuale        |
| Paolo               | 92          | `=F2/100`          |
| Maria               | "85"         | `=F3/100`          |
| Luca                | 78.5        | `=F4*0.01`         |
|                     | *(Errore: valore testuale invece di numerico)* | *(Errore: valore non numerico)* |

**Compiti:**
1. **Correggi la cella **F3** per contenere un valore numerico valido e non un testo.**
2. **Modifica la formula nella cella **G4** per calcolare la percentuale correttamente.**

#### **Tabella 3: Dati delle Vendite**

| **H**      | **I**                       |
|------------|-----------------------------|
| Data       | Vendite                     |
| 2024-12-31 | 1200.75                     |
| 2024-13-01 | 1350,50                     |
| 2024-01-15 | "1500"                      |
|            | *(Errore: data non valida)* | *(Errore: virgola nel numero)* |

**Compiti:**
1. **Correggi la data nella cella **H2** per un formato valido.**
2. **Modifica il valore nella cella **I3** per utilizzare il punto decimale invece della virgola.**
3. **Correggi il valore nella cella **I4** per contenere un valore numerico valido.**

---

### **Istruzioni di Correzione**

#### **Tabella 1: Conversione da Base 10 a Base 2**

1. **Correzione della Formula del Quoziente:**
   - **Cell:** **B2**
   - **Errore:** La formula `=A2/2` deve essere modificata in `=INT(A2/2)` per calcolare il quoziente intero.

2. **Correzione della Formula con Funzione Corretta:**
   - **Cell:** **B3**
   - **Errore:** La funzione `=QUOZIENTE(A2,2)` è errata. Modificala in `=INT(A3/2)` per ottenere il quoziente corretto.

3. **Correzione della Concatenazione del Numero Binario:**
   - **Cell:** **D2**
   - **Errore:** La formula `=CONCATENA(C2;C3;C4)` è errata se non si calcolano tutti i resti. Modifica la formula per concatenare tutti i resti correttamente.

4. **Correzione della Formula del Quoziente con Divisione Intera:**
   - **Cell:** **B4**
   - **Errore:** La formula `=INT(A4/3)` deve essere `=INT(A4/2)` per la conversione binaria corretta.

#### **Tabella 2: Calcolo della Percentuale**

1. **Correzione del Valore Testuale:**
   - **Cell:** **F3**
   - **Errore:** La cella contiene un testo ("85") invece di un numero. Modifica il valore a **85**.

2. **Correzione della Formula della Percentuale:**
   - **Cell:** **G4**
   - **Errore:** La formula `=F4*0.01` deve essere `=F4/100` per calcolare correttamente la percentuale.

#### **Tabella 3: Dati delle Vendite**

1. **Correzione della Data:**
   - **Cell:** **H2**
   - **Errore:** La data **2024-12-31** è corretta. La data **2024-13-01** deve essere corretta in **2024-01-01**.

2. **Correzione del Numero con Virgola:**
   - **Cell:** **I3**
   - **Errore:** Modifica il valore **1350,50** in **1350.50** per utilizzare il punto decimale.

3. **Correzione del Valore Non Numerico:**
   - **Cell:** **I4**
   - **Errore:** La cella contiene il testo **"1500"**. Modifica il valore a **1500**.

---

### **Conclusione:**

Dopo aver completato l'esercitazione, il foglio di calcolo dovrebbe essere corretto e funzionante. Questo esercizio ti aiuterà a migliorare la tua capacità di identificare e risolvere errori evidenti nelle formule e nei dati nei fogli di calcolo.
