public class power {
    public static int power(int x,int n){
      if(n==0){
       return 1;
      }
      int ans=power(x,n-1);
      return ans*x;
    }
  public static void main(String[] args) {
    int x=4;
    int n=2;
    System.out.println(power(x, n));
  }    
}
