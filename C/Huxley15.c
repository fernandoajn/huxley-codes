#include<stdio.h>

#define MAX 120

int main()
{
    char nome[MAX];
    gets(nome);
    printf("Seja muito bem-vindo %s\n",nome );
}