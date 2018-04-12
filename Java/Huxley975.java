import java.util.*;

public class HuxleyCode {

	public static char converter(char c){
		char d = Character.toUpperCase(c);
		return d;
	}

	public static void main(String args[]) {
	    Scanner sc = new Scanner(System.in);
	    String texto = sc.nextLine();
	    String textoF = texto.replace("4","a").replace("5","e").replace("1","i").replace("0","o").replace("2","u");

	    for (int i=0;i<textoF.length();i++) {
	    	 // Character.toUpperCase(textoF.charAt(0));
	    	int k = 1;
	    	if (textoF.charAt(i) == ' ') {
	    		System.out.print(converter(textoF.charAt(k)));
	    	}else{
				System.out.print(textoF.charAt(i));	    		
	    	}
	    	k++;

	    }
	    
	}
}

