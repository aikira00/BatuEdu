# Esercizio: Spazio di indirizzamento, pagine e frame

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

## Soluzione
La memoria totale è di **64 KB**. Convertendo in byte:
$$
64 \, \text{KB} = 64 \times 2^{10} \, \text{byte} = 2^{16} \, \text{byte}.
$$

Lo spazio di indirizzamento è determinato dal numero totale di byte indirizzabili, quindi servono **16 bit** per identificare ogni indirizzo, dato che:
$$
2^{16} = 64 \, \text{KB}.
$$


### Numero di pagine con **4 bit dedicati alla dimensione delle pagine**
#### Calcolo della dimensione di una pagina
$$
\text{Dimensione pagina} = 2^4 = 16 \, \text{byte}.
$$

#### Calcolo del numero totale di pagine
Dividendo la memoria totale per la dimensione di una pagina:
$$
\text{Numero di pagine} = \frac{2^{16} \, \text{byte}}{2^4 \, \text{byte per pagina}} = 2^{12} = 4096 \, \text{pagine}.
$$

Ragionando sullo spazio di indirizzamento m = 16 n = 4, si hanno $2^{(16 - 4)}$ pagine, ogni pagina ha dimensione $2ˆ4$. Quindi 4096 pagine, ogni pagina ha dimensione di 16 byte. (16 byte * 4096 pagine = 65.536 quindi 16 Kbyte di memoria)

#### Dimensione frame fisici:
La dimensione dei frame fisici = dimensione delle pagine, quindi 16 byte

### Numero di pagine con **8 bit dedicati alla dimensione delle pagine**
#### Calcolo della dimensione di una pagina
$$
\text{Dimensione pagina} = 2^8 = 256 \, \text{byte}.
$$

#### Calcolo del numero totale di pagine
Dividendo la memoria totale per la dimensione di una pagina:
$$
\text{Numero di pagine} = \frac{2^{16} \, \text{byte}}{2^8 \, \text{byte per pagina}} = 2^{8} = 256 \, \text{pagine}.
$$

Ragionando sullo spazio di indirizzamento m = 16 n = 8, si hanno $2^{(16 - 8)}$ pagine, ogni pagina ha dimensione $2ˆ8$. Quindi 256 pagine, ogni pagina ha dimensione di 256 byte. (256 byte * 256 pagine = 65.536 quindi 16 Kbyte di memoria)

#### Dimensione frame fisici:
La dimensione dei frame fisici = dimensione delle pagine, quindi 256 byte

# Esercizio 2
Si ha uno **spazio di indirizzamento** di **24 bit** e **pagine** di **1024 byte**.

**Domande**:

1. Calcolare il **numero di pagine**.

2. Determinare la **dimensione totale della memoria**.
## Soluzione

Per risolvere questo esercizio, seguiamo i passaggi che ci permettono di determinare il **numero di pagine** e la **dimensione della memoria** partendo dallo spazio di indirizzamento e dalla dimensione di ciascuna pagina.

  

**Dati dell’esercizio:**

  

• **Spazio di indirizzamento** = 24 bit

• **Dimensione di ciascuna pagina** = 1024 byte (o byte)

  

**1. Calcolare il numero di pagine**

  

Il numero di pagine può essere calcolato dividendo lo spazio di indirizzamento per la dimensione di una pagina.

• Lo spazio di indirizzamento è dato in **bit**, quindi il numero totale di byte indirizzabili è byte (dato che lo spazio di indirizzamento è di 24 bit).

• La dimensione di ciascuna pagina è byte, ovvero byte.

  

Il numero di pagine è quindi:

  

Quindi, il numero di pagine è:

  

**2. Calcolare la dimensione della memoria**

  

La dimensione totale della memoria è data dal numero di byte indirizzabili dallo spazio di indirizzamento. Poiché abbiamo uno spazio di indirizzamento di 24 bit, la memoria totale sarà:

  

  

Poiché byte è equivalente a 16 Megabyte (MB), la dimensione della memoria è:

  

  

**Risultato finale:**

  

• **Numero di pagine** = pagine

• **Dimensione della memoria** =

  

Quindi, la memoria totale è di **16 MB** e il numero di pagine è **16384**.
