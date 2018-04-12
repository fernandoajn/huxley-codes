import java.util.*;
import java.text.*;

public class HuxleyCode {

	public static void main(String args[]) {
	    Scanner sc = new Scanner(System.in);
	    double n = sc.nextDouble();
	    double k = 3;
	    double resultado = 0;

	    if (n==0) {
	    	System.out.println("0.0");
	    	System.exit(0);
	    }

	    for (int i=1; i<=n;i++ ) {

	    	System.out.printf(i+"/"+"%.0f",k);

	    	if (!(i==n)) {
	    		System.out.print(" + ");
	    	}else{
	    		System.out.print("\n");
	    	}
	    	resultado += i/k;
	    	k += 3;
	    }

	    System.out.println(resultado);
	}
}