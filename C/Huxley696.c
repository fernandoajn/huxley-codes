#include <stdio.h>

int main(){
	int num[10], x, v, i;

	for (i = 0; i < 10; i++){
		scanf("%d", &num[i]);
	}

	scanf("%d", &x);

	for (i = 0; i < 10; i++)
	{
		if (num[i]==x)
		{
			v++;
		}
	}

	printf("%d\n",v);

	return 0;
}