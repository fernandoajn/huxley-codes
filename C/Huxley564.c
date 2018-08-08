#include<stdio.h>


int main()
{
    float vm,vv,m,dif;
    int p;
    scanf("%f%f",&vm, &vv);

        dif = vv/vm;

    if (dif<1)
    {
        m = 0;
        p = 0;
    }else{
        if (dif <= 1.2)
        {
            m =85.13;
            p =4;
        }else if(dif <= 1.5){
            m = 127.69;
            p = 5;
        }else{
            m = 574.62;
            p = 7;
        }
    }

    printf("%.2f\n%d",m,p);
}