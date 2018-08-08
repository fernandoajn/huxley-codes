#include<stdio.h>
#include<string.h>

#define MAX 501

int main()
{
    char texto[MAX];
    int tamanho;
    gets(texto);
    tamanho = strlen(texto);
    printf("%d\n", tamanho);
    
}