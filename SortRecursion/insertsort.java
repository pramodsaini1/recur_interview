package recur_interview.SortRecursion;

public class insertsort {
    public static void main(String[] args) {
        int arr[]={9,7,2,5,3};
        System.out.println("Before insertion sort:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<arr.length-1;i++){
            for(int j=arr.length-1;j>=1;j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
         System.out.println("After insertion sort:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
