#include<stdio.h>


int main()
{
    int n,h;
    float s;
    scanf("%d%d%f", &n,&h,&s);
    s = s*h;
    printf("NUMBER = %d\nSALARY = R$ %.2f",n,s);

    return 0;
}