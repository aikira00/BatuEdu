
# Esercitazione: Distinzione tra SE, SE Annidato e Uso delle Funzioni CONTA.SE, SOMMA.SE, CONTA.PIÙ.SE

**Obiettivi dell’esercitazione**
1. Comprendere quando utilizzare la funzione SE e quando optare per SE annidato.
2. Riconoscere l’utilità delle funzioni CONTA.SE, SOMMA.SE e CONTA.PIÙ.SE per il calcolo di dati specifici.
3. Saper combinare le funzioni per creare report utili per l’analisi dei dati.

**Prerequisiti**
• Comprendere le basi delle funzioni SE e SE annidato.
• Avere familiarità con CONTA.SE, SOMMA.SE, e CONTA.PIÙ.SE.
• Aver compreso l'uso della formula [AND](https://support.google.com/docs/answer/3093301?hl=it) e della formula [OR](https://support.google.com/docs/answer/3093306?hl=it&ref_topic=3105413&sjid=6207029266095075438-EU)

## Torneo di Videogiochi della Classe
Immagina che nella tua scuola si sia tenuto un torneo di videogiochi, e tu sei incaricato di preparare un report con i risultati e alcune statistiche interessanti. Hai i dati delle partite in un foglio di Google Sheets con le informazioni su ogni giocatore, il loro punteggio finale e alcuni dettagli aggiuntivi.

1. CREARE UN NUOVO FILE **GOOGLE FOGLI**, rinominarlo con **vostroCognome_01-09_SE-SEAnnidato-CONTASE-SOMMASE-CONTAPiuSE**.

2. Spostarlo nella cartella che avete creato su GDrive: **home -> informatica -> primoAnno -> googleFogli**. Ricopia i dati mostrati in figura per le celle **A1:C31 (Nome, Punteggio, Gioco)**
![Foglio di calcolo da riprodurre](01-09_torneoVideogiochi.png)

4. Per la colonna **"Giudizio partita" ** inserisci la formula per calcolare la partita:
	1. Super partita” per chi ha più di 4000 punti
	2. “Ottima partita” per chi ha  più di 3000 punti
	3. “Buona partita” per chi ha  più di 2000 punti
	4. “Poteva andare meglio” per chi ha meno di 2000 punti
Che formula usi per mostrare i giudizi in base ai punti?

4. Calcola le statistiche per la tabella **"CLASSIFICA GIOCATORI"** 
	1. la colonna **Somma punteggi** deve mostrare la somma di tutti i punteggi fatti da un particolare giocatore. Usa i riferimenti assoluti in modo corretto in modo da trascinare la formula dalla cella H8 alla cella H14 (attenzione, per il nome fare riferimento alla colonna Giocatori celle F8, F9 etc.)
	2. la colonna **Totale partite giocate** deve mostrare quante partita ha giocato un particolare giocatore.  Usa i riferimenti assoluti in modo corretto in modo da trascinare la formula dalla cella I8 alla cella I14 
	3. la colonna **Punteggio Medio** deve contenere la media dei punti ottenuti tra tutte le partite da un particolare giocatore. 
	4. la colonna **Livello Esperienza** deve mostrare il livello di esperienza del particolare giocatore secondo i seguenti criteri:
		1. "Avanzato" se punteggio medio maggiore di 4000 punti
		2. "Intermedio" se punteggio medio maggiore di 3000 punti 
		3. "Principiante" se punteggio medio inferiore o uguale a 3000 punti
	5. la colonna "Giudizio Avanzato" deve mostrare una classificazione avanzata per ogni giocatore basata non solo sul **Punteggio**, ma anche sul **Livello di Esperienza**. Il sistema di classificazione è il seguente:
		1. **Campione Esperto**: Punteggio superiore a 4000 e Livello di Esperienza “Avanzato”.
		2. **Esperto in Crescita**: Punteggio tra 3000 e 4000 e Livello di Esperienza “Intermedio” o “Avanzato”.
		3. **Giocatore Promettente**: Punteggio tra 2000 e 2999 indipendentemente dal livello di esperienza.
		4. **Principiante**: Punteggio inferiore a 2000.

		Suggerimento: Questa formula verifica le condizioni in modo sequenziale:
		• **Prima condizione**: Se il punteggio è superiore a 4000 e il livello di esperienza è “Avanzato”, il giocatore è un “Campione Esperto”.
		• **Seconda condizione**: Se il punteggio è tra 3000 e 4000 e il livello è “Intermedio” o “Avanzato”, il giocatore è un “Esperto in Crescita”.
		• **Terza condizione**: Se il punteggio è tra 2000 e 2999, il giocatore è un “Giocatore Promettente”.
		• **Condizione finale**: Se nessuna delle condizioni è soddisfatta (ovvero il punteggio è inferiore a 2000), il giocatore è classificato come “Principiante”.
 
5. Calcola le statistiche per la tabella **Tabella Statistiche GIocatori** 
	1. Per ciascun livello di esperienza (Principiante, Intermedio, Avanzato), conta quanti giocatori ci sono. Questo aiuterà a capire la distribuzione dei livelli di abilità. 
		1. Inserisci la formula necessaria nella cella G3. 
		2. Trascinala in G4 e G5. Usi un riferimento assoluto o relativo? 
	2. Conta quanti giocatori maschi e quante giocatrici femmine ci sono per ciascun livello di esperienza (“Principiante”, “Intermedio”, “Avanzato”).  
		1. Per esempio, nella cella H3 devi calcolare il numero di giocatori maschi  che hanno livello di esperienza principiante. 
		2. Scrivi le formule in H3 e I3 in modo da poterle trascinare in H4,H5 e I4,I5 mantenendo i riferimenti agli intervalli delle celle corretti (Dovrai solo modificare le condizioni)
6. Calcola le statistiche per la tabella **Punteggi medi per livello e genere**

Formatta il foglio di calcolo in modo simile a come mostrato in figura usando Formato => colori alternati.

