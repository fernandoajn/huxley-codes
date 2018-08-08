#include<stdio.h>
#include<math.h>

int main()
{
    int tempo=0, n,i;
    scanf("%d",&n);
    int t[n];

        for (i = 0; i < n; ++i)
        {
            scanf("%d",&t[i]);

            if (i==0)
            {
                tempo += 10;
            }
            else if((t[i-1]+10)>t[i]){
                tempo += t[i] - (t[i-1]);
            }else{
                tempo += 10;
            }
        }

        printf("%d\n",tempo);
    return 0;
}

