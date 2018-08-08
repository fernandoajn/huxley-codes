#include<stdio.h>


int main()
{
    int x,y,i,u,k;
    scanf("%d%d",&x,&y);
    
    for (i = x; i <= y; ++i)
    {
        u = i%10;
        k = (i-u)/10;

        if (i%10!=0 && i%k==0)
        {
            printf("%d\n", i);       
        }
    }
    
    
    return 0;
}