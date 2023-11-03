package recur_interview.Array;

public class linearSearch {
    static boolean search(int arr[],int index,int target){
        if(index==arr.length-1){
            return false;
        }
        else{
            return arr[index]==target || search(arr, index+1, target);
        }
    }
    public static void main(String[] args) {
        int a[]={3,2,1,18,9};
        System.out.println(search(a,0,18));
    }
}
