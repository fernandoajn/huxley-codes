#include<stdio.h>


int main()
{
    int n,m,i=0;
    scanf("%d%d",&m,&n);

    while(n>m){
        if (n%m==0)
        {
            i=1;
            break;
        }

        n--;
    }


    if (!i)
    {
        printf("sem multiplos menores que %d\n",n);
    }else{
        printf("%d\n",n);
    }
    
    return 0;
}

