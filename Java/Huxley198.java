import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
   
       Scanner sc = new Scanner(System.in);
        int tempo = 0;
        int n = sc.nextInt();
        int[] t = new int[n];
        
            for (int i = 0; i < n; i++) {
                t[i] = sc.nextInt();

                if (i == 0) {
                    tempo += 10;
                }
                else if((t[i-1]+10)> t[i]){
                    tempo += t[i] - (t[i-1]);
                }else{
                    tempo += 10;
                }

            }
                System.out.println(tempo);
  }
}