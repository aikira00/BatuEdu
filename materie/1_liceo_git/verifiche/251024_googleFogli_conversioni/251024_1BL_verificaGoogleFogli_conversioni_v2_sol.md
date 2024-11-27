# Verifica di Informatica

La seguente verifica deve essere svolta entro la scadenza indicata dal docente e le risposte. La verifica sarà valutata sulla base della correttezza delle formule e dei risultati. Verrà considerata anche la capacità di applicare correttamente le funzioni e i concetti visti in classe. L'intervallo dei voti è [2-10] calcolati su:
1. Esercizio/Domande teoria: voto scritto calcolato su 9 punti + 1 punto elaborato ordinato
2. Esercizio foglio di calcolo: voto pratico calcolato su  9 punti + 1 punto elaborato ordinato

Per l’assegnazione dei punti saranno considerati i seguenti criteri: 
- **Aderenze alla traccia:** Verifica che le risposte siano pertinenti alla richiesta e rispettino la traccia.
- **Correttezza logica e completezza della soluzione/risposta:** La risposta deve essere completa, precisa e correttamente motivata.

Per l’assegnazione del punto relativo all’elaborato ordinato, saranno presi in considerazione i seguenti aspetti:
- Il foglio della verifica e il foglio protocollo devono essere **correttamente intestati**.
- L’elaborato deve essere **leggibile** e **ben organizzato**.

**Rispondere a tutte le domande su foglio protocollo, riportando la domanda in modo ordinato. Esempio: Parte I - Domanda 1 - Risposta:**

__________
### PARTE I - Esercizio Google Fogli

Sei stato incaricato di aiutare nella gestione di una piccola libreria chiamata “BookWorld”. La libreria ha venduto vari libri nell’ultima settimana, e ora vuole analizzare le vendite per comprendere meglio l’andamento del negozio e pianificare il futuro.

![[esercizioGoogleFogli_v2.png]]
Guarda i dati riportati nel foglio di calcolo per le colonne **Libro**, **Prezzo Unitario** e **Copie vendute**. Rispondi alle seguenti domande:

1. **(1 pt) Domanda 1** Quale formula devi inserire nella cella E2 per calcolare le vendite totali per ogni categoria?     _`La formula da inserire è: =C2*D2.`_
2. **(0.5 pt) Domanda 2** Vuoi trascinare la formula dalla cella E2 alla cella E8, usi un riferimento assoluto o relativo nella formula della cella D2? Motiva la risposta
3. **(0.5 pt) Domanda 3** Quale formula devi inserire nella cella B10 per calcolare il totale delle entrate generate da tutte le vendite? _`La formula da inserire è: =SOMMA(E2:E8)`_
4. **(0.5 pt) Domanda 4** Quale formula devi inserire nella cella B11 per calcolare il totale di libri venduti? _`La formula da inserire è: =SOMMA(D2:D8)`_
5. **(0.5 pt) Domanda 5** Quale formula devi inserire nella cella B12 per calcolare il minimo di copie vendute tra i diversi libri? _`La formula da inserire è: =MIN(E2:E8)`_
6. **(0.5  pt) Domanda 6** Quale formula devi inserire nella cella B13 per calcolare il massimo di copie vendute tra i diversi libri? _`La formula da inserire è: =MAX(E2:E8)`_
7. **(0.5  pt) Domanda 7** Quale formula devi inserire nella cella B14 per calcolare la media delle copie vendute per ogni libro?_`La formula da inserire è: =MEDIA(E2:E8)`_ 
8. **(1 pt) Domanda 8** Quale formula devi inserire nella cella B15 per calcolare quanti libri hanno una vendita totale superiore a 400 euro? _`La formula da inserire è: =CONTA.SE(E2:E8; ">400")`_
9. **(1 pt) Domanda 9** Quale formula devi inserire nella cella B16 per calcolare la somma delle entrate dei libri che hanno un prezzo unitario inferiore a 20 euro? _`La formula da inserire è: =Somma.SE(C2:C8; "<20"; E2:E8)`_
10. **(1 pt) Domanda 10** Quale formula devi inserire nella cella B17 per calcolare quanti libri hanno un numero di copie vendute maggiore di 20 e un prezzo unitario superiore a 18 euro? _`La formula da inserire è: =CONTA.Più.SE(D2:D8; ">20"; C2:C8; ">18"`_
11. **(1 pt) Domanda 11** Quale formula devi inserire nella cella E2 per calcolare la percentuale delle vendite di ogni libro rispetto al totale delle vendite della settimana? _`La formula da inserire è: =E2/B10`_
12. **(1 pt) Domanda 12** Vuoi trascinare la formula dalla cella E2 alla cella E8, usi un riferimento assoluto o relativo nella formula della cella E2? Motiva la risposta. _`Lsi per B10, in questo caso diventa =E2/$B$10`_


**Formulario formule avanzate**
```
=CONTA.SE(intervallo; criterio)`
=CONTA.PIÙ.SE(intervallo_criteri1; criterio1; [intervallo_criteri2; criterio2]; [...])`
=SOMMA.SE(intervallo; criterio; [intervallo_somma])
```
### PARTE II - Domande ed esercizi Teoria - sistemi di numerazione, rappresentazione informazioni

1. **(3 pt) Esercizio - conversioni da base diversa da 10 a base 10**: converti i seguenti numeri dalla base indicata alla base 10, indicando tutti i passaggi intermedi visti a lezione:
	1. $111010_2$       
	2. $153_8$ 
	3. $1AF_{16}$
2. **(1 pt) Domanda 1** - Dato il numero $6845_b$, motiva quale può essere la base minima **b** in cui è espresso il numero.
3. **(1 pt) Domanda 2** - Quali sono le cifre del sistema esadecimale (base 16)? Perché dobbiamo usare le lettere? Motiva con un esempio.
4. **(1 pt) Domanda 3** - Quanti bit occorrono per codificare 67 informazioni distinte? Motiva la risposta.
5. **(3 pt) Domanda 4** - Rispondi alle seguenti domande:
	1. Dati 4 bit, quante informazioni distinte si possono rappresentare? In caso di numeri positivi, qual è l'intervallo che si può rappresentare?
	2. Dati 8 bit, quante cose distinte posso rappresentare? In caso di numeri positivi, qual è l'intervallo che si può rappresentare?
	3. Per l'intervallo di numeri positivi rappresentabili, qual è la formula generale per determinare l’intervallo di numeri rappresentabili?
