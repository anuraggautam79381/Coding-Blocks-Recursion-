public class subsequences {
    public static void main(String[] args) {
        String str="abc";
        System.out.println("\n"+subsequences(str, "", 0));
    }
    public static int subsequences(String str,String newstr,int i){
       if(i==str.length()){
          System.out.print(newstr+" ");
          return 1;
        }
        char ch=str.charAt(i);
        int a=subsequences(str, newstr, i+1);//nahi aana chahta
        int b=subsequences(str, newstr+ch, i+1);//aana chahta h
        return a+b;
    }
}
