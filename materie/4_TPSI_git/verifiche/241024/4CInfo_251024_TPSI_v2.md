# Verifica di TPSI 

La seguente verifica deve essere svolta entro la scadenza indicata dal docente. La verifica sarà valutata sulla base della correttezza delle formule e dei risultati, e sulla capacità di applicare correttamente  i concetti visti in classe. L'intervallo dei voti è [2-10] calcolati su 10 punti; così organizzati: voto scritto calcolato su 9 punti + 1 punto elaborato ordinato

Per l’assegnazione dei punti saranno considerati i seguenti criteri:  **Aderenze alla traccia** (la risposta è pertinente e rispetta la traccia), **Correttezza logica e completezza della soluzione/risposta** (la risposta è completa, precisa e correttamente motivata). Per l’assegnazione del punto relativo all’elaborato ordinato, saranno presi in considerazione i seguenti aspetti: il foglio della verifica e il foglio protocollo devono essere **correttamente intestati**, l’elaborato deve essere **leggibile** e **ben organizzato**.

**Rispondere a tutte le domande su foglio protocollo, riportando la domanda in modo ordinato.**
Esempio: Domanda 1 - Risposta:

MISURE DISPENSANTIVE/COMPENSATIVE APPLICATE:
__________
** (3 pt) Domanda 1 - Struttura della memoria di un processo**
Considerando la struttura dell'area di memoria di un processo come mostrata nell'immagine, spiega il ruolo delle varie sezioni di memoria in un processo. Descrivi le differenze tra le sezioni Text, Data, BSS, Stack e Heap. Perché le prime tre sono considerate statiche mentre le ultime due sono considerate dinamiche?

![[img2.png | class=media-item-align-right | 150]]

Considera il seguente codice in C:

```
#include <stdio.h>
#include <stdlib.h>
int x = 7;
int y;
int moltiplica(int a, int b) {
    int prodotto = a * b;
    printf("Prodotto: %d\n", prodotto);
    return prodotto;
}
int main() {
    int *z = (int*)malloc(sizeof(int));
    *z = 15;
    int prodotto = moltiplica(x, *z);
    free(z);
    return 0;
}
```

spiega a quale area appartengono le variabili nel codice d'esempio  in C (Stack, Heap, Segmento Dati, Segmento BSS).

1. variabile x
2. variabile y
3. variabile prodotto all’interno della funzione moltiplica(int a, int b)
4. variabile prodotto all'interno della funzione main()
5. variabile z all'interno della funzione main()

** (2 pt) Domanda 2 - Simulazione Stack Java**
Dato il seguente codice Java:
```
class MusicAlbum {
    String albumName;
    int numTracks;
    public MusicAlbum(String albumName, int numTracks) {
        this.albumName = albumName;
        this.numTracks = numTracks;
    }
    public void updateTracks(int newTracks) {
        this.numTracks = newTracks; 
    }
    public void showAlbumInfo() {
        System.out.println("Album: " + albumName + ", Tracks: " + numTracks);
    }
}
public class StackHeapSimulation {
    public static void main(String[] args) {
        int tracks = 10;
        MusicAlbum album = new MusicAlbum("The Dark Side of the Moon", tracks);
        int newTracks = 12;
        album.updateTracks(newTracks);// rappresentare stato stack/heap qui, prima del ritorno.
		// rappresentare stato stack/heap qui, prima della chiamata showAlbumInfo
        album.showAlbumInfo();
    }
}
```

rappresenta lo stato dello stack e dell'heap in due momenti 
- quando viene chiamato il metodo `_updateTracks_` nel main
- quando il metodo `_updateTracks_` ha finito la sua esecuzione, subito prima che venga chiamato il metodo `_showAlbumInfo_` nel main
Specifica in modo preciso le informazioni contenute in uno stack frame di attivazione come visto a lezione. 

** (2 pt) Domanda 3 - Scheduling processi**
Si spieghi perché nella reale schedulazione dei processi risulta necessario usare un algoritmo come il MLFQ invece di usare un singolo algoritmo come uno tra FCFS, SJF, SRTF, a priorità o Round Robin.
	
** (2 pt) Domanda 4 - Scheduling processi**
![[scheduling.png| class=media-item-align-right | 250]]
Considera il diagramma degli stati di un processo mostrato nell’immagine e spiega cosa avviene quando un processo passa:

A. dallo stato Running allo stato Ready tramite la transizione di Interruzione;
B. dallo stato Running allo stato Waiting tramite la transizione di Sospensione.

# Griglia di valutazione verifica TPSI - Domanda 3

| **Domanda** | **0-0.5 punti** (Non sufficiente) | **0.5-1.0 punti** (Sufficiente) | **1.0-1.5 punti** (Buono) | **1.5-2.0 punti** (Ottimo) |
|-------------|------------------------------------|---------------------------------|----------------------------|-----------------------------|
| **Domanda 3** <br> Necessità dell’algoritmo Multiple Level Feedback Queue (MLFQ) rispetto ai singoli algoritmi | Risposta errata o molto incompleta. <br> Non viene spiegato perché un singolo algoritmo (FCFS, SJF, SRTF, a priorità, Round Robin) risulterebbe inadeguato nella schedulazione reale dei processi. Non viene identificato il valore dell’MLFQ. | Risposta parziale o confusa. <br> Alcuni limiti dei singoli algoritmi sono menzionati ma non chiariti. L’utilità dell’MLFQ è accennata ma con dettagli insufficienti. | Buona spiegazione dei limiti di uno o più algoritmi singoli (es. SJF, FCFS, Round Robin) rispetto alla schedulazione reale. <br> L’MLFQ è riconosciuto come soluzione, ma mancano alcuni dettagli specifici sui vantaggi che offre. | Descrizione completa e dettagliata dei limiti dei singoli algoritmi e dei motivi per cui l’MLFQ è più adatto alla schedulazione reale. <br> Vantaggi dell’MLFQ spiegati chiaramente e in relazione a situazioni pratiche. |

## Dettagli Aggiuntivi:

- **0-0.5 punti**: La risposta è errata, incompleta o non risponde alla traccia. Gravi lacune concettuali.
- **0.5-1.0 punti**: La risposta è parzialmente corretta, ma manca di completezza o chiarezza.
- **1.0-1.5 punti**: La risposta è buona, corretta ma con dettagli mancanti o spiegazioni che potrebbero essere più approfondite.
- **1.5-2.0 punti**: La risposta è eccellente, completa, dettagliata e dimostra piena comprensione dell'argomento.