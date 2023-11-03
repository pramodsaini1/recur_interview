package recur_interview.Array;

import java.util.ArrayList;

public class list {
     public static void main(String[] args) {
        int a[]={1,2,3,4,4,8};
        ArrayList<Integer> ans = findAllIndex(a, 4, 0, new ArrayList<>());
        System.out.println(ans);
     }
    static ArrayList<Integer>findAllIndex(int arr[],int target,int index,ArrayList<Integer>list){
        if(index==arr.length-1){
            return list;
        }
        if(arr[index]==target){
             list.add(index);
        }
        return findAllIndex(arr, target, index+1, list);
    }
}
