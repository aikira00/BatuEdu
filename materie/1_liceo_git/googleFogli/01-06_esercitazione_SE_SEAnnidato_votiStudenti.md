
# PARTE I - Funzione SE di base

**Situazione**

Immagina di voler creare un registro dei voti per la tua classe, e di voler assegnare un giudizio per ogni voto:
• Se il voto è uguale o superiore a 6, lo studente è “Promosso”.
• Se il voto è inferiore a 6, lo studente è “Non Promosso”.

**Passaggi**

1. CREARE UN NUOVO FILE **GOOGLE FOGLI**, rinominarlo con **vostroCognome_01-06_SE_votiStudenti**.
2.  Spostarlo nella cartella che avete creato su GDrive: **home -> informatica -> primoAnno -> googleFogli**.
3. Scrivi nella cella A1 "Nome", nella cella B1 "Voto", nella cella C1 "Giudizio Base"
4. Scrivi nella colonna A i nomi di dieci studenti (da A2 in giù).
5. Nella colonna B scrivi i voti corrispondenti per ogni studente (es. 8, 5, 6, ecc.).
6. Nella cella C2, scrivi la formula SE per assegnare il giudizio basato sul voto: se il voto è maggiore di 6 "Promosso", altrimenti "Non promosso"
7. Premi Invio: la cella mostrerà “Promosso” se il voto è maggiore o uguale a 6, altrimenti “Non Promosso”.
8. Copia la formula verso il basso per applicarla a tutti gli studenti.

Esempio risultato finale:


| Nome  | Voto | Giudizio Base                                                             |
|-------|------|---------------|
| Anna  | 8    | Promosso |
| Marco | 5    | Non Promosso|
| etc. | etc. | etc|

# PARTE II - Funzione SE annidato

Ora vogliamo aggiungere più giudizi per i voti:
• “Eccellente” per voti da 9 a 10.
• “Buono” per voti da 7 a 8.
• “Sufficiente” per voti pari a 6.
• “Insufficiente” per voti inferiori a 6.

1. Nella colonna D, aggiungeremo una nuova formula con SE annidati.
2. Nella cella D1 scrivi "Giudizio Avanzato"
3. Nella cella D2, scrivi la formula con il se annidato per mostrare "Eccellente", "Buono", "Sufficiente", "Insufficiente"
4. Premi Invio: la cella mostrerà il giudizio corretto in base al voto. 
5. Trascina verso il basso per applicarla a tutti i voti degli studenti.

**Spiegazione della formula SE Annidato**
Questa formula verifica diverse condizioni:

• Prima controlla se il voto è maggiore o uguale a 9: in questo caso assegna “Eccellente”.
• Se la condizione precedente non è soddisfatta, verifica se il voto è maggiore o uguale a 7: in questo caso assegna “Buono”.
• Se la condizione non è ancora soddisfatta, controlla se il voto è esattamente 6 e assegna “Sufficiente”.

• Infine, se nessuna delle condizioni è vera, assegna “Insufficiente”.

Esempio risultato finale:

| Nome  | Voto | Giudizio Base | Giudizio Avanzato |                                                            |
|-------|------|---------------|-------------------------------------|
| Anna  | 8    | Promosso | Buono |
| Marco | 5    | Non Promosso| Insufficiente |
| etc. | etc. | etc| etc.

**Domande di verifica**
1. Che cosa succede se cambi un voto nella colonna B? Osserva come cambiano automaticamente i giudizi nelle colonne C e D.
2. Prova ad aggiungere altre categorie: ad esempio, un giudizio “Mediocre” per i voti tra 4 e 5. Come cambierebbe la formula?
3. Spiega in parole tue come funziona un SE annidato e in quali situazioni potresti usarlo nella vita reale.