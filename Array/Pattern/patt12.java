package recur_interview.Array.Pattern;

public class patt12 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=i-1;j<5;j++){
                System.out.print(" ");
            }
            for(int k=11-2*i ;k>=1;k-=2){
               System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*
 * 
 * 
*********
     *******
      *****
       ***
        *

        
 */
