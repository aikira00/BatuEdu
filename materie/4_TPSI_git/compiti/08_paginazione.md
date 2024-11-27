# Esercizio 1: Spazio di indirizzamento, pagine e frame

Data una memoria di **64 KByte**:

1. Determinare lo **spazio di indirizzamento** in bit.
2. Supponendo che $4$ bit siano dedicati all'offset nella pagina:
    - Calcolare la **dimensione di ciascuna pagina**.
    - Calcolare il **numero di pagine** nel sistema.
 3. Supponendo che $8$ bit siano dedicati all'offset nella pagina:
    - Calcolare la **dimensione di ciascuna pagina**.
    - Calcolare il **numero di pagine** nel sistema.
4. Determinare, in ciascun caso, la **dimensione dei frame fisici** corrispondenti.

---

## Suggerimenti per la risoluzione

### Passaggi per svolgere l'esercizio:
1. **Spazio di indirizzamento**: calcolato come il numero totale di byte indirizzabili:
   $$
   \text{Spazio di indirizzamento (in bit)} = \log_2(\text{Memoria totale in byte})
   $$
   Per una memoria di $64 \, \text{KB}$, calcolare il numero di bit necessari.

2. **Dimensione di una pagina**: ogni pagina contiene $2^n \, \text{byte}$, dove $n$ è il numero di bit dedicati all'offset:
   $$
   \text{Dimensione pagina} = 2^n \, \text{byte}.
   $$

3. **Numero di pagine**: si calcola dividendo la memoria totale per la dimensione di ciascuna pagina:
   $$
   \text{Numero di pagine} = \frac{\text{Memoria totale}}{\text{Dimensione pagina}}.
   $$

 **Oppure**, si calcola ragionando sullo spazio di indirizzamento. Il numero delle pagine è dato da: $$2^{(m - n)}$$ dove $m$ è lo spazio di indirizzamento e $2^n$ è la dimensione della pagina.

4. **Dimensione dei frame fisici**: i frame fisici corrispondono alla dimensione delle pagine:
   $$
   \text{Dimensione frame fisico} = \text{Dimensione pagina}.
   $$

---
# Esercizio 2: 
Si ha uno **spazio di indirizzamento** di **24 bit** e **pagine** di **1024 byte**.

**Domande**:

1. Calcolare il **numero di pagine**.

2. Determinare la **dimensione totale della memoria**.

# Esercizio 3
Data la seguente figura,

![[paginazione.png]]

determinare, per gli elementi d, m e f
1.il frame in cui sono memorizzati nella memoria principale
2. l'indirizzo fisico 
3. supponendo che il frame 5 inizi all'indirizzo 81.920, il frame 6 all'indirizzo 98.304, il frame 1 all'indirizzo 0 e il frame 2 all'indirizzo 16.384, determinare i nuovi  indirizzi fisici per gli elementi d, m e f