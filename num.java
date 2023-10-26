package recur_interview;

public class num {
      static void display(int n){
           if(n>0){
              display(n-1);
              System.out.print(n+" ");
           }
      }
      public static void main(String []arr){
         int N=10;
         display(N);
      }
}
