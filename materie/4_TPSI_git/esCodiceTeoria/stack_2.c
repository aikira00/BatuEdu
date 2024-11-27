//
// Created by Cristina Battaglino on 10/01/24.
//
#include <stdio.h>
#include <stdlib.h>

int main() {
    int *ptr = (int*)malloc(sizeof(int)); // Allocazione nell'heap
    if (ptr == NULL) {
        printf("Allocazione di memoria fallita.\n");
        return 1;
    }

    *ptr = 5; // Assegnazione di un valore

    printf("Valore dell'intero nell'heap: %d\n", *ptr);

    free(ptr); // Rilascio della memoria

    int *array;
    int n = 10; // Dimensione dell'array

    // Allocazione di memoria per 10 interi
    array = (int*)malloc(n * sizeof(int));

    // Verifica se l'allocazione di memoria è riuscita
    if (array == NULL) {
        printf("Allocazione di memoria fallita.\n");
        return 1; // o exit(EXIT_FAILURE);
    }

    // Inizializzazione dell'array
    for (int i = 0; i < n; i++) {
        array[i] = i; // Assegna alcuni valori (es. 0, 1, 2, ..., 9)
    }

    // Stampa dell'array
    for (int i = 0; i < n; i++) {
        printf("%d ", array[i]);
    }
    printf("\n");

    // Rilascio della memoria allocata
    free(array);

    return 0;
}
