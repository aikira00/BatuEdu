//
// Created by Cristina Battaglino on 10/01/24.
//
#include <stdio.h>
int R(int A) {
    return A + 1;
}

int Q(int x) {
    return R(x);
}

int P(void) {
    int a = 10;
    return Q(a);
}

int main(int argc, char *argv[]) {
    int x = P();
   // printf("%d", x);
    //int x = 10;

    int pippo = P();
    int y = 5;
    int *ptr_y = &y;
    printf("%d \n", x);
    printf("%d \n", y);
    printf("%d \n", ptr_y);
    printf("%d \n", &ptr_y);
    printf("%d \n", *ptr_y);

    /* malloc
     *  int *ptr = (int*)malloc(sizeof(int)); // Allocazione nell'heap
    if (ptr == NULL) {
        printf("Allocazione di memoria fallita.\n");
        return 1;
    }

    *ptr = 5; // Assegnazione di un valore

    printf("Valore dell'intero nell'heap: %d\n", *ptr);

    free(ptr); // Rilascio della memoria*/
}