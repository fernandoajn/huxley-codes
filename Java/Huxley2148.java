import java.util.*;
import java.text.*;

public class HuxleyCode{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    String[] pre = new String[n];

    int k = n;
    String[] disciplinas = new String[k];

    for (int i = 0; i<n ; i++ ) {
      pre[i] = sc.nextLine();
    }

    for (int i = 0; i<k ; i++ ) {
      disciplinas[i] = sc.nextLine();
    }

  }
}
