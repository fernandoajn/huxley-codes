#include<stdio.h>

float dobro(float x, float y){
    float m;

    if (x>y){
        m = x;
    }else if(y>x){
        m = y;
    }else{
        m = x;
    }

    return m*2;
}


int main()
{
    float n1,n2;
    scanf("%f%f",&n1,&n2);
    printf("%.2f\n",dobro(n1,n2));
}