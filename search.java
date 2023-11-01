package recur_interview;

public class search {
    public static void main(String[] args) {
        int a[]={3,2,1,18,9};
        System.out.println(search(a,18,0));
    }
    static boolean search(int arr[],int target,int index){
         if(index==arr.length){
            return false;
         }
         return arr[index]==target || search(arr,target,index+1);
    }
}
