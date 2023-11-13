package recur_interview.Array;

public class patt10 {
     public static void main(String[] args) {
          for(int i=1;i<=5;i++){
                for(int j=i-1;j<=4;j++){
                    System.out.print(" ");
                }
                for(int k=6-i;k>=1;k--){
                    System.out.print("*");
                }
                System.out.println();
           }
     }
}
/*
 
 *****
      ****
       ***
        **
         *
        
 */
