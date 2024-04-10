import java.util.HashSet;

public class uniquesubsequences {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<>();
        String str="aaa";
        subsequences(str, "", 0,set);
    }
    public static void subsequences(String str,String newstr,int i, HashSet<String> set){
       if(i==str.length()){
          if(set.contains(newstr)){
            return;
          }
          else{
            System.out.println(newstr+" ");
            set.add(newstr);
            return;
          }
        }
        char ch=str.charAt(i);
        subsequences(str, newstr, i+1,set);//nahi aana chahta
        subsequences(str, newstr+ch, i+1,set);//aana chahta h
    }
}
