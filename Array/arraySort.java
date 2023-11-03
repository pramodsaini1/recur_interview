package recur_interview.Array;

public class arraySort {
    static boolean sort(int arr[],int index){
        if(index==arr.length-1){
            return true;
        }
        else{
            return arr[index]<arr[index+1] && sort(arr,index+1);
        }
    }
    public static void main(String[] args) {
        int a[]={1,2,4,8,9,12};
        System.out.println(sort(a,0));
    }
}
