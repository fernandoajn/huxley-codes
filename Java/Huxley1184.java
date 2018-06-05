import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int id = 0;
    int count = 0;
    ArrayList<Integer> buffer = new ArrayList<Integer>();
    ArrayList<Integer> memoaux = new ArrayList<Integer>();

    String x = sc.nextLine();
    String QP[] = x.split(" ");
    int Q = Integer.parseInt(QP[0]);
    int P = Integer.parseInt(QP[1]);

    if(Q>0 && Q<1000000000 && P>0 && P<1000000000){
        while(sc.hasNext()){
            for(int i=0; i<P; i++){
            if(sc.hasNext()){
                String cmd = sc.nextLine();
                String split[] = cmd.split(" ");
                int K = Integer.parseInt(split[1]);
                if(K>=0 && K<1000000000){
                    if(split[0].equals("RECV")){
                        for(int j=0; j<K; j++){
                            if(buffer.size()<Q){
                                buffer.add(id);
                            }else{
                                memoaux.add(id);
                            }
                            id++;
                        }
                    count++;

                    }else if(split[0].equals("SEND")){

                        if(K>0){
                            for(int z=0; z<K; z++){
                                if(buffer.size()>=1){
                                    if(z<K-1){
                                        System.out.print(buffer.get(0)+" ");
                                        buffer.remove(0);
                                    }else{
                                        System.out.println(buffer.get(0)+" ");
                                        buffer.remove(0);
                                    }
                                }else{
                                    System.out.println("");
                                    break;
                                }
                            }
                        }else{
                            System.out.println("");
                        }
                        count++;
                    }
                }

            }
            }

            if(count>=P){
                while(buffer.size()<Q){
                    if(memoaux.size()>0){
                        buffer.add(memoaux.get(memoaux.size()-1));
                        memoaux.remove(memoaux.get(memoaux.size()-1));

                    }else{
                        break;
                    }
                }
                count = 0;
            }

        }


        while(buffer.size()>0){
            if(buffer.size()>1){
                System.out.print(buffer.get(0)+" ");
                buffer.remove(buffer.get(0));
            }else{
                System.out.println(buffer.get(0)+" ");
                buffer.remove(buffer.get(0));
            }
        }
        while(memoaux.size()>0){
                System.out.print(memoaux.get(memoaux.size()-1)+" ");
                memoaux.remove(memoaux.get(memoaux.size()-1));
        }

    }
  }
}
