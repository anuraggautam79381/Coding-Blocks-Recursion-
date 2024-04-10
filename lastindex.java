public class lastindex {
    public static void main(String[] args) {
        int arr[]={3,2,5,7,5,6,5,15,5};
        int target=5;
        System.out.println(lastindex(arr,5,arr.length-1));
    }
    public static int lastindex(int arr[],int target,int i){
        if(i==arr.length){
          return -1;
        }
    for(i=arr.length-1;i>=0;i--){
     if(arr[i]==target){
     return i;
     }
    }
    return lastindex(arr, target, i--);
    }
}
