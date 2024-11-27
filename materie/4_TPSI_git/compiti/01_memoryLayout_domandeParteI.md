# Domande Memory Layout

**Consegna**: Rispondi alle domande in modo chiaro e dettagliato.

**Domanda 1**

Nel contesto della memoria di un processo, le sezioni **text**, **data**, **BSS**, **heap** e **stack** svolgono ruoli specifici. Per ciascuna di queste sezioni:

1\. **Descrivi** il ruolo e la funzione della sezione all’interno del processo.

2\. Indica il **posizionamento** tipico nello spazio di indirizzamento di un processo (dove si trova rispetto alle altre sezioni).

3\. Spiega in che modo la sezione può **crescere** o modificarsi durante l’esecuzione del programma.

4\. Descrivi come la memoria associata a quella sezione viene **gestita** o **protetta** (ad esempio, permessi di lettura, scrittura, esecuzione).

**Domanda 2**

Qual è la differenza tra la sezione **Data** e la sezione **BSS**? Fornisci un esempio di variabile che potrebbe essere memorizzata in ciascuna di queste due sezioni.

**Domanda 3**

Considera il seguente programma C semplificato:

```c

#include <stdio.h>

#include <stdlib.h>

int global_var = 10;

int uninitialized_global;

void func() {

    int local_var = 5;

    printf("Local var: %d\n", local_var);

}

int main() {

    int *var = (int*)malloc(sizeof(int));

    *var = 20;

    int x = 10;

    func();

    printf("var: %d\n", *var);

    free(var);

    printf("x: %d\n", x);

    return 0;

}
```

Indica in quale sezione di memoria vengono allocate le seguenti variabili:

1. global\_var

2. uninitialized\_global

3. local\_var all’interno della funzione func()

4. var (il puntatore dinamico nella funzione main())

5. x (variabile locale nella funzione main())




