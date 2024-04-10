// package coding blocks(Recursion);

public class Increasingorder {
    public static void main(String[] args) {
        int n=1;
        order(n);
    }
    public static void order(int n){
     if(n==6){
      return;
     }
     System.out.println(n);
     order(n+1);
    }
}
