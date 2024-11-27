//#include <stdio.h>
//
////variabile globale non inizializzata
//
//int global; /* area mem non inizializzata */
//int globalValued = 100;
//int main(void)
//{
//    static int i; /* rea mem non inizializzata */
//    static int j = 90; /*stored in data read-write*/
//    const double d = 3.14;
//    const int* p_i = &j;
//    printf("%d", *p_i);
//    return 0;
//}
#include <stdio.h>
#include <malloc/_malloc.h>

int variabile_globale = 10;
int variabile_globale_due = 10;
int variabile_globale_tre = 10;
int variabile_globale_quattro = 10;
static int variabile_statica_globale = 10;
char s[] = "hello world";
int i;
int y;


int main(){
    int a = 10;
    int b = 5;
    return 0;
}

