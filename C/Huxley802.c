#include<stdio.h>

int triangulo(int x){
    int i,j;
    for ( i = 1; i <= x; ++i)
    {
        for (j = 0; j < i; ++j)
        {
            printf("%d",i);
        }
        printf("\n");
    }
}


int main()
{
    int n;
    scanf("%d",&n);
    triangulo(n);
}