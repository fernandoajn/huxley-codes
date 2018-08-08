#include<stdio.h>
#include<math.h>

int main()
{
    int x,y,i,j,count,r;
    scanf("%d",&x);
    while(x<1 || x>9){
            printf("Insira um n�mero inicial entre 1 e 9\n");
            scanf("%d",&x);
    }    

    scanf("%d",&y);
    while(y>9 || y<1){
            printf("Insira um n�mero final entre 1 e 9\n");
            scanf("%d",&y);
    }    

    if (x>y)
    {
        printf("Nenhuma tabuada nesse intervalo\n");
    }else{

        for (i = x; i <= y; ++i)
        {
            for (count = 1; count <= 9; ++count)
            {
                r = i*count;
                printf("%d x %d = %d\n",i,count,r);
            }
            printf("\n");
        }

    }
    

    

    
    return 0;
}

