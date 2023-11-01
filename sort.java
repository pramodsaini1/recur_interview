package recur_interview;

public class sort {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9};
        System.out.println(sorted(a,0));
    }
    static boolean sorted(int arr[],int index){
        if(index==arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && sorted(arr,index+1);
    }
}
