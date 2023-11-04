package recur_interview.Array.Pattern;

public class patt2 {
   static int n;
   static void jseries(int j){
      if(j<n){
          System.out.print(j+n+" ");
          jseries(j+1);
      }
   }
   static void iseries(int i){
        if(i<=5){
            n=i;
            jseries(0);
            System.out.println();
            iseries(i+1);
        }
   }
   public static void main(String[] args) {
     int i=1;
     iseries(i);
   }
    
}
/*
 * 1
 * 2 3
 * 3 4 5
 * 4 5 6 7
 * 5 6 7 8 9
 */
