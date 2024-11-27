# Esercizio: Analisi del Binding degli Indirizzi con Istruzioni Assembly

Immagina che la seguente istruzione in C

```
int a = 10;
```

venga tradotta nel seguente codice assembly semplificato:
```
mov rax, 10        ; Carica il valore 10 nel registro rax
mov [a], rax       ; Memorizza il valore di rax (10) nella variabile 'a'
```

dove l'istruzione assembly MOV

**`[a]`** è un riferimento all'indirizzo di memoria di `a`. L'indirizzo di `a` può variare a seconda del tipo di _binding_ utilizzato dal sistema operativo o dal compilatore. 

Come cambia l'indirizzo di `[a]` in base al tipo di **binding**? Ovvero, come cambia l'istruzione caricata in memoria RAM `mov [a], rax` nella sezione `.text` del programma in base al tipo di **binding**? Specifica quando si tratta di binding statico o dinamico.

### **Soluzione**

#### **Binding Statico a Tempo di Compilazione**:
   - Con il **binding statico a tempo di compilazione**, l'indirizzo di `a` viene determinato **durante la compilazione** e **non cambia mai** durante l'esecuzione del programma. Questo significa che l'indirizzo di `a` è fisso e predefinito, conosciuto già al momento in cui il programma è scritto e compilato.
   - L'istruzione in assembly sarebbe:
     ```assembly
     mov rax, 10        ; Carica il valore 10 nel registro rax
     mov [0x1000], rax  ; Memorizza il valore 10 nell'indirizzo 0x1000
     ```
   - **Sezione `.text` e indirizzi risolti**: La sezione `.text` contiene il codice eseguibile del programma. Durante la compilazione, gli indirizzi utilizzati nel codice (come `0x1000`) sono già risolti a **indirizzi fisici** definitivi, che non dipendono dalla posizione in cui il programma sarà caricato in memoria, poiché sono fissi al momento della compilazione. In questo caso, l'indirizzo di `a` (0x1000) è noto in anticipo e non cambia. L'istruzione mov caricata in RAM, e presente nella sezione TExt del programma, sarà sempre mov [0x1000], rax  ; Memorizza il valore 10 nell'indirizzo 0x1000

#### **Binding Dinamico a Tempo di Caricamento**:
   -Con il **binding dinamico a tempo di caricamento**, l'indirizzo di `a` è determinato dal **sistema operativo** al momento in cui il programma è caricato in memoria. Questo significa che l'indirizzo effettivo di `a` può variare ad ogni esecuzione, in base alla posizione di caricamento del programma.
   - L'istruzione in assembly potrebbe essere:
     ```assembly
     mov rax, 10        ; Carica il valore 10 nel registro rax
     mov [0x2030], rax  ; Memorizza il valore 10 nell'indirizzo 0x2030
     ```
   - In questo caso, l'indirizzo di `a` è determinato al momento del **caricamento del programma**. Se il programma viene caricato a partire da un indirizzo base di `0x2000`, l'indirizzo effettivo di `a` sarà `0x2000 + 0x30 = 0x2030` (poiché `a` si trova all'offset 0x30 rispetto all'inizio del programma).
   - **Sezione `.text` e indirizzi risolti**: Quando il programma viene compilato, l'istruzione `mov [0x2030], rax` è scritta nella sezione `.text`, ma l'indirizzo `0x2030` è relativo alla posizione di memoria in cui il programma sarà caricato. Quando il programma viene effettivamente caricato in memoria, il sistema operativo risolve e modifica l'indirizzo in un valore fisico specifico, ad esempio, se il programma è caricato a partire da `0x2000`, l'indirizzo fisico risolto sarà `0x2030`. Per esempio, se il programma viene caricato a partire dall'indirizzo 2000, l'istruzione caricata in RAM diventa mov [0x2030], rax


#### **Binding Dinamico a Tempo di Esecuzione**:
   - Con il **binding dinamico a tempo di esecuzione**, l'indirizzo di `a` può essere determinato **durante l'esecuzione del programma**,. In questo caso, l'indirizzo di `a` non è statico né determinato dal sistema operativo al momento del caricamento, ma viene **calcolato o assegnato durante l'esecuzione** del programma. Per esempio, potrebbe derivare da un'allocazione dinamica della memoria.
   - L'istruzione in assembly potrebbe essere:
     ```assembly
     mov rax, 10        ; Carica il valore 10 nel registro rax
     mov [0x30], rax  ; Memorizza il valore 10 nell'indirizzo 0x4030
     ```
   - L'indirizzo di `a` è dinamico e dipende da come la memoria viene allocata o gestita durante l'esecuzione. 
   - **Sezione `.text` e indirizzi risolti**: Nella sezione `.text`, l'istruzione `mov [0x30], rax` è scritta con un indirizzo logico. Questo indirizzo logico (ad esempio `0x30`) viene risolto solo a **tempo di esecuzione** dalla **Memory Management Unit (MMU)** del sistema, che si occupa di tradurre gli indirizzi logici (virtuali) in indirizzi fisici. Se il programma è caricato a partire dall'indirizzo fisico `0x4000` e `a` è all'offset `0x30`, l'indirizzo fisico effettivo sarà `0x4030`. Supponiamo che il programma sia caricato a partire dall'indirizzo 4000. Solo a tempo di esecuzione, grazie alla componente hardware MMU, indirizzo oX30 diventerà 0X4030. L'istruzione caricata nella memoria RAM continua ad avere l'indirizzo logico, che viene risolto (tradotto in indirizzo fisico) soltanto a tempo di esecuzione.