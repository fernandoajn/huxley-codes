#include<stdio.h>


int main()
{
    int x,y,z,m;
    scanf("%d%d%d",&x,&y,&z);

    m = x;
    if (y<=m)
    {
        m=y;
    }
    if(z<=m){
        m=z;
    }


    printf("%d\n",m);
}