#include <stdio.h>

int main () {
    int x;
    long int prod = 1;

    while (scanf("%d", &x) == 1){
        prod *= x;
    }

    printf("Prod = %ld", prod);
    return 0;
}