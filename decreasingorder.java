// package coding blocks(Recursion);

public class decreasingorder {
    public static void main(String[] args) {
        int n=5;
        order(n);
    }
    public static void order(int n){
    if(n==0){
     return;
    }
    System.out.println(n);
    order(n-1);
    }
}
