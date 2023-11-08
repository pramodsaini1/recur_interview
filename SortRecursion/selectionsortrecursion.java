package recur_interview.SortRecursion;

import java.util.Arrays;

public class selectionsortrecursion {
    public static void main(String[] args) {
        int a[]={9,7,2,5,3,6};
        selectionsort(a,a.length-1,0,0);
        System.out.println(Arrays.toString(a));
    }
    static void selectionsort(int arr[],int r,int c,int max){
        if(r==0){
            return ;
        }
        if(c<r){
            if(arr[c]>arr[max]){
                selectionsort(arr, r, c+1, c);
            }
            else{
                selectionsort(arr, r, c+1, max);
            }
        }
        else{
            int temp=arr[max];
            arr[max]=arr[r-1];
            arr[r-1]=temp;
            selectionsort(arr, r-1, 0, 0);
        }
    }
}
