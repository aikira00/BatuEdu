# Verifica di TPSI 

La seguente verifica deve essere svolta entro la scadenza indicata dal docente. La verifica sarà valutata sulla base della correttezza delle formule e dei risultati, e sulla capacità di applicare correttamente  i concetti visti in classe. L'intervallo dei voti è [2-10] calcolati su 10 punti; così organizzati: voto scritto calcolato su 9 punti + 1 punto elaborato ordinato

Per l’assegnazione dei punti saranno considerati i seguenti criteri:  **Aderenze alla traccia** (la risposta è pertinente e rispetta la traccia), **Correttezza logica e completezza della soluzione/risposta** (la risposta è completa, precisa e correttamente motivata). Per l’assegnazione del punto relativo all’elaborato ordinato, saranno presi in considerazione i seguenti aspetti: il foglio della verifica e il foglio protocollo devono essere **correttamente intestati**, l’elaborato deve essere **leggibile** e **ben organizzato**.

**Rispondere a tutte le domande su foglio protocollo, riportando la domanda in modo ordinato.**
Esempio: Domanda 1 - Risposta:

MISURE DISPENSANTIVE/COMPENSATIVE APPLICATE:
__________
** (4 pt) Domanda 1 - Struttura della memoria di un processo**
Considerando la struttura dell'area di memoria di un processo come mostrata nell'immagine, spiega il ruolo delle varie sezioni di memoria in un processo. Descrivi le differenze tra le sezioni Text, Data, BSS, Stack e Heap. Perché le prime tre sono considerate statiche mentre le ultime due sono considerate dinamiche?

![[img2.png | class=media-item-align-right | 150]]

Ora, considera il seguente codice in C:

```
#include <stdio.h>
#include <stdlib.h>
int y;
int x = 7;
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

** (3 pt) Domanda 2 - Simulazione Stack Java**
Dato il seguente codice Java:
```
class GameCharacter {
    String characterName;
    int level;
    int energy;
    public GameCharacter(String characterName, int level, int energy) {
        this.characterName = characterName;
        this.level = level;
        this.energy = energy;
    }
    public void updateLevel(int newLevel) {
        this.level = newLevel; 
    }
    public void useEnergy(int energyUsed) {
        this.energy -= energyUsed; 
    }
    public void showCharacterInfo() {
        System.out.println("Character: " + characterName + ", Level: " + level + ", Energy: " + energy);
    }
}
public class StackHeapSimulation {
    public static void main(String[] args) {
        int initialLevel = 1;
        int initialEnergy = 100;
        GameCharacter character = new GameCharacter("Mario", initialLevel, initialEnergy);

        // Using energy to fight
        int energyUsed = 20;
        character.useEnergy(energyUsed); // rappresentare stato stack/heap qui, prima del ritorno.
		// rappresentare stato stack/heap qui, prima della chiamata showCharacterInfo
        character.showCharacterInfo();
    }
}
```
rappresenta lo stato dello stack e dell'heap in due momenti 
- quando viene chiamato il metodo `_useEnergy_` nel main
- quando il metodo `_useEnergy_` ha finito la sua esecuzione, subito prima che venga chiamato il metodo `_showCharacterInfo_` nel main
Specifica in modo preciso le informazioni contenute in uno stack frame di attivazione come visto a lezione. 

** (2 pt) Domanda 3 - Scheduling processi**
Spiegare qual è la differenza tra un algoritmo Multiple Level Queue Scheduling  e un algoritmo Multiple Level Feedback Queue Scheduling e spiegare la problematica che viene risolta.
