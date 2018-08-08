#include<stdio.h>


int main()
{
    int n,k,fat;
    n=0;

    while(n!=-1){
        scanf("%d",&n);
            if (n==-1)
            {
                break;
            }
         for (fat=1; n>1; n=n-1)
            {
                fat = fat*n;
            }
        printf("%d\n",fat);
        
    }
    

    
    
    return 0;
}

