import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine()); //quantidade de casos de teste

    for (int i=0;i<n;i++) {
      String chaves = sc.nextLine(); 
      ArrayList pilha = new ArrayList();

      for (int j=0;j<chaves.length();j++) {
        String caractere = chaves.substring(j,j+1);

        if (caractere.equals("[") || caractere.equals("(")) {
          push(caractere, pilha);
        }else if(caractere.equals("]") || caractere.equals(")")){
          pop(caractere, pilha);
        }

      }

      if (pilha.size() == 0) {
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }
    }
  }

    public static ArrayList push(String caractere, ArrayList pilha){
      pilha.add(caractere);
      return pilha;
    }

    public static ArrayList pop(String caractere, ArrayList pilha){
      int i = pilha.size()-1;

      if (pilha.size()>0) {
        if (caractere.equals(")") && pilha.get(i).equals("(")) {
          pilha.remove(pilha.get(i));
        }

      if(caractere.equals("]") && pilha.get(i).equals("[")){
          pilha.remove(pilha.get(i));
        }  
      }

      return pilha;
    }

  }



