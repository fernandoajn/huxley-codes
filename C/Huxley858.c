#include<stdio.h>


int main()
{
    float x, y, s;
    printf("Digite um numero:\n");
    scanf("%f", &x);
    printf("Digite outro numero:\n");
    scanf("%f", &y);
    s = x +y;
    printf("Soma: %.1f\n", s);
    return 0;
}