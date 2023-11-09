package recur_interview.SortRecursion;

import java.lang.reflect.Array;
import java.util.Arrays;

public class duplicate {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,2};
        int result= duplicate(arr);
        System.out.println( result);

    }
    static int duplicate(int arr[]){
        int i=0;
        while(i<arr.length){
             if(arr[i]!=i+1){
                int correct=arr[i]-1;
                    if(arr[i]!=arr[correct]){
                        int temp=arr[i];
                        arr[i]=arr[correct];
                        arr[correct]=temp;
                    }
                    else{
                        return  arr[i];
                    }
             }
             else{
                     i++;
             }
        }
        return -1;
    }

}
