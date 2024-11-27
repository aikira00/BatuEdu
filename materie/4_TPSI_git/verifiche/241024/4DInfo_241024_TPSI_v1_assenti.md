# Verifica di TPSI - Recupero assenti

La seguente verifica deve essere svolta entro la scadenza indicata dal docente. La verifica sarà valutata sulla base della correttezza delle formule e dei risultati, e sulla capacità di applicare correttamente  i concetti visti in classe. L'intervallo dei voti è [2-10] calcolati su 10 punti; così organizzati: voto scritto calcolato su 9 punti + 1 punto elaborato ordinato

Per l’assegnazione dei punti saranno considerati i seguenti criteri:  **Aderenze alla traccia** (la risposta è pertinente e rispetta la traccia), **Correttezza logica e completezza della soluzione/risposta** (la risposta è completa, precisa e correttamente motivata). Per l’assegnazione del punto relativo all’elaborato ordinato, saranno presi in considerazione i seguenti aspetti: il foglio della verifica e il foglio protocollo devono essere **correttamente intestati**, l’elaborato deve essere **leggibile** e **ben organizzato**.

**Rispondere a tutte le domande su foglio protocollo, riportando la domanda in modo ordinato.**
Esempio: Domanda 1 - Risposta:

MISURE DISPENSANTIVE/COMPENSATIVE APPLICATE:
__________
** (3 pt) Domanda 1 - Struttura della memoria di un processo**
Considerando la struttura dell'area di memoria di un processo come mostrata nell'immagine, spiega il ruolo delle varie sezioni di memoria in un processo. Descrivi le differenze tra le sezioni Text, Data, BSS, Stack e Heap. Perché le prime tre sono considerate statiche mentre le ultime due sono considerate dinamiche?

![[img2.png | class=media-item-align-right | 150]]

Scrivi un programma in C che contenga un esempio di:
- variabile globale inizializzata
- variabile globale non inizializzata
- variabile locale
- variabile allocata dinamicamente

** (2 pt) Domanda 2 - Simulazione Stack Java**
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
Descrivi in modo dettagliato come un algoritmo di CPU scheduling può influenzare l’efficienza del sistema operativo in termini di **throughput** e **tempi di risposta**. Confronta i vantaggi e gli svantaggi di uno scheduler a coda singola rispetto a uno a code multiple, specificando come ciascuna di queste strutture incide sulla gestione delle priorità dei processi e sulla prevenzione della **starvation**.

** (2 pt) Domanda 4 - Scheduling processi**

Disegna il diagramma degli stati di un processo e spiega cosa avviene quando un processo passa: 
A. dallo stato Running allo stato Ready tramite la transizione di Interruzione;
B. dallo stato Running allo stato Waiting tramite la transizione di Sospensione.
