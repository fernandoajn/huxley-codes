#include<stdio.h>

int main()
{
    int n = 0;
    int i,aux;
    while(n!=-1){
         scanf("%d", &n);
            if (n==-1)
            {
                break;
            }
        aux = 0;
        
        for (i = 1; i <=n; ++i)
        {
            if (n%i==0)
            {
                aux++;
            }
        }

        if (aux==2)
        {
            printf("1\n");
        }else{
            printf("0\n");
        }
    }

}