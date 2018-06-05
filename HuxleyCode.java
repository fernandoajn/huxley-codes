import java.util.*;

public class HuxleyCode{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String auxRU = sc.nextLine();
    String espRU = auxRU.substring(3);
    String auxA2 = sc.nextLine();
    String espA2 = auxA2.substring(7);

    ArrayList<Object> alunos = new ArrayList();
    ArrayList filaRU = new ArrayList();
    ArrayList filaA2 = new ArrayList();
    boolean continuar = true;

     while(sc.hasNextLine()) {
      String[] token = sc.nextLine().split(":");

      if (token[0].equalsIgnoreCase("SAIU")) {
          String local = token[1];

            if (local.equals("RU") && filaRU.size()>0) {
              System.out.println(filaRU.get(0)+" almocou no RU e esta voltando pra aula");
              filaRU.remove(0);
            }
            else if(local.equals("AREA2") && filaA2.size()>0){
              System.out.println(filaA2.get(0)+" almocou na Area 2 e esta voltando pra aula");
              filaA2.remove(0);
            }else{
              System.out.println("Nao ha mais ninguem para comer aqui");
            }

      }else{
        Aluno a =  new Aluno();
        a.nome =  token[0];
        if (token.length>1) {
          a.prato = token[1];
        }
        alunos.add(a);

        int tamanho_filaru = filaRU.size();
        int tamanho_filaa2 = filaA2.size();

        if (token.length>1) {
          if (a.prato.equalsIgnoreCase(espA2)) {
            filaA2.add(a.nome);
          }else if(a.prato.equalsIgnoreCase(espRU)){
            filaRU.add(a.nome);
          }else{
            if (filaRU.size() < filaA2.size()) {
              filaRU.add(a.nome);
            }else{
              filaA2.add(a.nome);
            }
          }
        }else{
          filaA2.add(a.nome);
        }

        if (tamanho_filaru < filaRU.size()) {
          System.out.println(a.nome+" foi para a fila do RU");
        }
        if (tamanho_filaa2 < filaA2.size()) {
          System.out.println(a.nome+" foi para a fila da Area 2");
        }
      }

      }
      }

      static class Aluno{
        String nome;
        String prato;
      }

  }
