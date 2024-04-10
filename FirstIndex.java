public class FirstIndex{
public static void main(String[] args) {
     int arr[]={3,2,5,7,5,6,5,15,5};
     int target=5;
     System.out.println(index(arr, 5, 0));
   }
   public static int index(int arr[],int target,int i){
    if(i==arr.length){
        return -1;
    }
    for(i=0;i<arr.length;i++){
    if(arr[i]==target){
     return i;
      }
    }
    return index(arr, target, i+1);
  }
}
