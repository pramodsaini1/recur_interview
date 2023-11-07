package recur_interview.SortRecursion;

public class buublewlorecursion {
    public static void main(String[] args) {
        int arr[]={9,7,2,5,3};
        int n=arr.length;
         System.out.println("Before Bubble sort:");
         for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
         }
            for(int i=0;i<n-1;i++){
               for(int j=0;j<n-i-1;j++){
                  if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                  }
               }
            }
            System.out.println("After bubble sort:");
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }
        
    }
}
