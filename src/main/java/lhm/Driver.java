package lhm;
import java.lang.Math.*;

public class Driver{
  public static void main(String args[]){

      if(args.length != 1){
        System.out.println("Please enter a single integer");
        System.exit(1);
      }
      if(args.length !=0){
            boolean match = args[0].matches("[0-9]+");
            if(!match){
              System.out.println("Please enter a single integer");
              System.exit(1);
            }
      }
    int n = Integer.parseInt(args[0]);



    int tri = Tri(n);
    int lazy = Lazy(n);

    System.out.println("Tri("+n+") = "+tri);
    System.out.println("Lazy("+n+") = "+lazy);

  }

  public static int Tri(int n){
    int total=0;
    for(int i=1; i<=n; i++){
      total=total+i;
    }
    return total;
  }

  public static int Lazy(int n){
    int top = (int)Math.pow(n,2) + n + 2;
    int p=top/2;
    return p;
  }
}
