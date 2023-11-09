package recur_interview.SortRecursion;

public class dup {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,10,10};
        int result=duplicate(arr);
        System.out.println(result);
    }
    static int duplicate(int arr[]){
            for(int i=0;i<arr.length-1;i++){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[j]<arr[i]){
                        int temp=arr[j];
                        arr[j]=arr[i];
                        arr[i]=temp;
                    }
                }
            }
            for(int i=0;i<arr.length;i++){
                if(arr[i]==arr[i+1]){
                    return arr[i];
                }
            }
            return -1;
 
   
    }
}
