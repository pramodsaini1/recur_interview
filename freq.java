package recur_interview;

public class freq {
      public static void main(String []arr){
                int ar[]={1,1,1,2,2,3};
            int count[]=new int[10];
            for(int i=0;i<ar.length;i++){
                count[ar[i]]++;
            }
            for(int i=0;i<10;i++){
                if(count[i]>0){
                    System.out.println(i+"frequency is"+count[i]);
                }
            }
      }
}
