# Compito: Esercizio Partizioni Fisse e Variabili

**Obiettivo**: Comprendere i concetti di gestione della memoria a partizioni fisse e variabili attraverso l’analisi e la riflessione.

---

### 1. Domanda

Scrivi una breve definizione (100-150 parole) di **gestione della memoria** e spiega la differenza tra **partizioni fisse** e **partizioni variabili**. Includi almeno un esempio per ciascuno.

---

### 2. Esercizio Pratico (Partizioni Fisse)

Immagina di avere una memoria con le seguenti partizioni fisse:
- Partizione 1: 10MB
- Partizione 2: 20MB
- Partizione 3: 30MB

I seguenti processi devono essere allocati in memoria, nel seguente ordine:
- **Processo A**: 5MB
- **Processo B**: 15MB
- **Processo C**: 10MB
- **Processo D**: 25MB

Mostra come i processi possono essere allocati nelle partizioni fisse. Indica eventuali frammentazioni che si verificano, calcola i byte "sprecati" e spiega brevemente il motivo di eventuali fallimenti nell’allocazione.

---

### 3. Esercizio Pratico (Partizioni Variabili)

Immagina un sistema operativo che utilizza partizioni variabili. Disegna una rappresentazione della memoria con le seguenti allocazioni iniziali (puoi farlo su carta o usare un software di disegno):
- **Processo A**: 12MB
- **Processo B**: 8MB
- **Processo C**: 20MB

Ora, A e B finiscono la loro esecuzione e la memoria viene liberata.
- Arriva un **Processo D** di 10MB: che succede?
- Arriva un **Processo E** di 10MB: che succede?

Discuti se ci sono frammentazioni o problemi di allocazione.

---

### 4. Domanda

Scrivi un breve paragrafo (150-200 parole) riflettendo sui vantaggi e svantaggi delle partizioni fisse rispetto a quelle variabili. Quale metodo ritieni sia più efficace nella gestione della memoria e perché?

---

### 5. Esercizio Allocazione con Partizioni Variabili: First Fit, Best Fit, Worst Fit

Immagina una memoria con 8 partizioni, una delle quali è occupata dal **sistema operativo** e altre tre sono occupate dai **programmi**. La memoria ha le seguenti quattro partizioni libere:
- 8MB
- 20MB
- 18MB
- 30MB

Arriva un processo di 16MB. Discuti come verrebbe allocato in base alle strategie **First Fit**, **Best Fit** e **Worst Fit**. Quali sono i pro e contro di ciascuna strategia per questo scenario?

  

---
