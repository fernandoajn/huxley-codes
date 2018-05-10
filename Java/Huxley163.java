import java.util.*;
public class HuxleyCode {

	public static void main(String args[]) {
	    Scanner sc = new Scanner(System.in);
	   	int p = sc.nextInt(); //posicoes possiveis
	   	int n = sc.nextInt(); //pastas
	   	ArrayList<Integer> lista = new ArrayList();
	   	ArrayList<Integer> listaPerfeita = new ArrayList();
	   	int acumulador = 0;
	   	
	   	while(listaPerfeita.size() < n){
		   	for (int i=1;i<=p ;i++ ) {
		   		listaPerfeita.add(i);

		   			if (listaPerfeita.size() == n) {
		   				break;
		   			}
		   	}
	   	}

	   	for (int i=0;i<n;i++) {
	   		lista.add(sc.nextInt());
	   	}

	   	Collections.sort(lista);
	   	Collections.sort(listaPerfeita);

	   	for (int i =0;i<lista.size() ;i++ ) {
	   		if (lista.get(i) == listaPerfeita.get(i)) {
	   			acumulador += 1;
	   		}
	   	}

	   	if (acumulador == n) {
	   		System.out.println("S");
	   	}else{
	   		System.out.println("N");
	   	}
	}
}