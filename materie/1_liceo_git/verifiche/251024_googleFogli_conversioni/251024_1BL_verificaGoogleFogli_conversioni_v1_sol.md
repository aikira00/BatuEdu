Ecco il testo riformattato in Markdown, con le soluzioni evidenziate in rosso sotto ogni domanda:

  

# Verifica di Informatica

  

****DATA:****  

****COGNOME Nome:****  

****CLASSE:****  

  

La seguente verifica deve essere svolta entro la scadenza indicata dal docente e le risposte. La verifica sarà valutata sulla base della correttezza delle formule e dei risultati. Verrà considerata anche la capacità di applicare correttamente le funzioni e i concetti visti in classe.  

L'intervallo dei voti è [2-10] calcolati su:

- Esercizio/Domande teoria: voto scritto calcolato su 9 punti + 1 punto elaborato ordinato

- Esercizio foglio di calcolo: voto pratico calcolato su 9 punti + 1 punto elaborato ordinato

  

Per l’assegnazione dei punti saranno considerati i seguenti criteri: 

- ****Aderenze alla traccia:**** Verifica che le risposte siano pertinenti alla richiesta e rispettino la traccia.

- ****Correttezza logica e completezza della soluzione/risposta:**** La risposta deve essere completa, precisa e correttamente motivata.

  

Per l’assegnazione del punto relativo all’elaborato ordinato, saranno presi in considerazione i seguenti aspetti:

- Il foglio della verifica e il foglio protocollo devono essere ****correttamente intestati****.

- L’elaborato deve essere ****leggibile**** e ****ben organizzato****.

  

****Rispondere a tutte le domande su foglio protocollo, riportando la domanda in modo ordinato. Esempio: Parte I - Domanda 1 - Risposta:****

  

## PARTE I: Esercizio Google Fogli

  

Sei incaricato di aiutare la direzione del club sportivo “FitLife” a gestire le iscrizioni ai vari corsi e a monitorare le entrate economiche generate dai soci iscritti ai corsi settimanali. Di seguito è riportata una tabella che mostra le iscrizioni della scorsa settimana per vari corsi offerti dal club.

  

![[esercizioGoogleFogli__v1.png]]_

  

_Guarda i dati riportati nel foglio di calcolo per le colonne_ ****Corso****_,_ ****Costo per Iscritto**** _e_ ****Numero di iscritti****_. Rispondi alle seguenti domande:_

  

_1._ ****(1 pt) Domanda 1:**** _Quale formula devi inserire nella cella D2 per calcolare le entrate totali per ogni corso?_  

   ****Soluzione:****  

   _`La formula da inserire è: =C2*D2.`_

  

_2._ ****(0.5 pt) Domanda 2:**** _Vuoi trascinare la formula dalla cella D2 alla cella D8, usi un riferimento assoluto o relativo nella formula della cella D2? Motiva la risposta._  

   ****Soluzione:****  

   _`Si utilizza un riferimento relativo, perché si desidera che la formula si adatti automaticamente quando la si trascina verso il basso.`_

  

_3._ ****(0.5 pt) Domanda 3:**** _Quale formula devi inserire nella cella B10 per calcolare il totale delle entrate generate da tutti i corsi?_  

   ****Soluzione:****  

   _`La formula da inserire è: =SOMMA(D2:D8).`_

  

_4._ ****(0.5 pt) Domanda 4:**** _Quale formula devi inserire nella cella B11 per calcolare il totale di iscritti in tutti i corsi?_  

   ****Soluzione:****  

   _`La formula da inserire è: =SOMMA(C2:C8).`_

  

_5._ ****(0.5 pt) Domanda 5:**** _Quale formula devi inserire nella cella B12 per calcolare il minimo di iscritti ad un corso?_  

   ****Soluzione:****  

   _`La formula da inserire è: =MIN(C2:C8).`_

  

_6._ ****(0.5 pt) Domanda 6:**** _Quale formula devi inserire nella cella B13 per calcolare il massimo di iscritti ad un corso?_  

   ****Soluzione:****  

   _`La formula da inserire è: =MAX(C2:C8).`_

  

_7._ ****(0.5 pt) Domanda 7:**** _Quale formula devi inserire nella cella B14 per calcolare la media di iscritti ad un corso?_  

   ****Soluzione:****  

   _`La formula da inserire è: =MEDIA(C2:C8).`_

  

_8._ ****(1 pt) Domanda 8:**** _Quale formula devi inserire nella cella B15 per calcolare quanti corsi hanno un'entrata totale superiore a 500 euro?_  

   ****Soluzione:****  

   _`La formula da inserire è: =CONTA.SE(D2:D8;">500").`_

  

_9._ ****(1 pt) Domanda 9:**** _Quale formula devi inserire nella cella B16 per calcolare la somma delle entrate dei_ ****corsi economici**** _(i corsi che hanno un costo per iscritto inferiore a 50 euro)?_  

   ****Soluzione:****  

   _`La formula da inserire è: =SOMMA.SE(B2:B8;"<50";D2:D8).`_

  

_10._ ****(1 pt) Domanda 10:**** _Quale formula devi inserire nella cella B17 per calcolare quanti corsi hanno un numero di iscritti maggiore di 10 e un costo per iscritto superiore a 50 euro?_  

   ****Soluzione:****  

   _`La formula da inserire è: =CONTA.PIÙ.SE(B2:B8;">50";C2:C8;">10").`_

  

_11._ ****(1 pt) Domanda 11:**** _Quale formula devi inserire nella cella E2 per calcolare la percentuale di iscritti di ogni corso rispetto al totale di iscritti nel club?_  

   ****Soluzione:****  

   _`La formula da inserire è: =C2/SOMMA(C2:C8).`_

  

_12._ ****(1 pt) Domanda 12:**** _Vuoi trascinare la formula dalla cella E2 alla cella E8, usi un riferimento assoluto o relativo nella formula della cella E2? Motiva la risposta._  

   ****Soluzione:****  

   _`Si utilizza un riferimento relativo per permettere alla formula di adattarsi quando viene trascinata verso il basso.`_

  

_---_

  

_## PARTE II: Domande ed esercizi Teoria - sistemi di numerazione, rappresentazione informazioni_

  

_1._ ****(3 pt) Esercizio - conversioni da base diversa da 10 a base 10:**** _Converti i seguenti numeri dalla base indicata alla base 10, indicando tutti i passaggi intermedi visti a lezione:_

   _- $110101__2$  

     **Soluzione:**  

     `Per convertire da base 2 a base 10, sommiamo i valori di potenza di 2 per ogni cifra binaria non nulla:  

     $110101_2 = (1 \times 2^5) + (1 \times 2^4) + (0 \times 2^3) + (1 \times 2^2) + (0 \times 2^1) + (1 \times 2^0) = 32 + 16 + 4 + 1 = 53$.`

   - $573_8$  

     **Soluzione:**  

     `Per convertire da base 8 a base 10, moltiplichiamo ciascuna cifra per la potenza di 8 corrispondente:  

     $573_8 = (5 \times 8^2) + (7 \times 8^1) + (3 \times 8^0) = 5 \times 64 + 7 \times 8 + 3 = 320 + 56 + 3 = 379$.`

   - $3FA_{16}$  

     **Soluzione:**  

     `Per convertire da base 16 a base 10, moltiplichiamo ciascuna cifra per la potenza di 16 corrispondente:  

     $3FA_{16} = (3 \times 16^2) + (15 \times 16^1) + (10 \times 16^0) = 3 \times 256 + 15 \times 16 + 10 = 768 + 240 + 10 = 1018$.`

  

2. ****(1 pt) Domanda 1:**** Dato il numero $6745__b$, motiva quale può essere la base minima_ ****b**** _in cui è espresso il numero._  

   ****Soluzione:****  

   _`La base minima b deve essere maggiore della cifra più alta nel numero. In questo caso, la cifra più alta è 7, quindi la base minima deve essere 8.`_

  

_3._ ****(1 pt) Domanda 2:**** _Quali sono le cifre del sistema esadecimale (base 16)? Perché dobbiamo usare le lettere? Motiva con un esempio._  

   ****Soluzione:****  

   _`Le cifre del sistema esadecimale sono: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E, F. Le lettere vengono utilizzate per rappresentare i valori da 10 a 15, poiché nel sistema esadecimale abbiamo_