/*se l'argomento è "genera", scriverà 10.000 numeri casuali su un file; 
in caso contrario, leggerà numeri da numbers.txt, 
calcolerà la loro somma e scriverà il risultato in somma.txt. */

/*Per far "dormire" un programma in C per un determinato periodo di tempo, 
si utilizzala funzione `sleep` della libreria `unistd.h` 
(su sistemi basati su UNIX/Linux) o la funzione `_sleep` in `windows.h` 
(su sistemi Windows).
Entrambe le funzioni sospendono l'esecuzione del programma per un 
numero specificato di secondi.*/

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>
#ifdef _WIN32
#include <windows.h>
#else
#include <unistd.h>
#endif

void generate_numbers() {
    FILE *file = fopen("numbers.txt", "w");
    if (!file) {
        fprintf(stderr, "Impossibile aprire il file per la scrittura.\n");
        exit(1);
    }
    srand((unsigned int)time(NULL));
    for (int i = 0; i < 10000; i++) {
        fprintf(file, "%d\n", rand());
    }
    fclose(file);
    printf("10.000 numeri casuali sono stati scritti su numbers.txt\n");
}

void sum_numbers() {
    FILE *file = fopen("numbers.txt", "r");
    if (!file) {
        fprintf(stderr, "Impossibile aprire numbers.txt per la lettura.\n");
        exit(1);
    }
    int sum = 0, num;
    while (fscanf(file, "%d\n", &num) == 1) {
        sum += num;
    }
    fclose(file);
    
    file = fopen("somma.txt", "w");
    if (!file) {
        fprintf(stderr, "Impossibile aprire somma.txt per la scrittura.\n");
        exit(1);
    }
    fprintf(file, "%d\n", sum);
    fclose(file);
    printf("La somma è stata scritta su somma.txt\n");
}

int main(int argc, char *argv[]) {
    if (argc < 2) {
        fprintf(stderr, "Usa: %s [genera|somma]\n", argv[0]);
        return 1;
    }
    
    printf("Il programma dormirà per 60 secondi...\n");
#ifdef _WIN32
    Sleep(60000);  // per Windows, il tempo è in millisecondi
#else
    sleep(60);  // per Unix/Linux, il tempo è in secondi
#endif

    if (strcmp(argv[1], "genera") == 0) {
        generate_numbers();
    } else {
        sum_numbers();
    }
    return 0;
}

