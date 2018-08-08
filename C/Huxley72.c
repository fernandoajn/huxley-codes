#include <stdio.h>
int main(){
    int tamanho, i, x;
    scanf("%d", &tamanho);		
    int colecao[tamanho];
    
    for(i = 0; i <= (tamanho-1); i++){
    	scanf("%d", &colecao[i]);
    }
    
    for(x = (tamanho-1); x >= 0; x--){
    	if(x > 0){
    	    printf("%d ", colecao[x]);
        }else{
            printf("%d\n", colecao[x]);
        }
	}
}