package recur_interview.Array.Pattern;

public class patt23 {
    public static void main(String[] args) {
        for(int i=1;i<=3;i++){
           for(int j=1;j<=9;j++){
              if(4-i==j || 3+i==j || 8-i==j || 6+i==j){
                  System.out.print("*");
              }
              else{
                  System.out.print(" ");
              }
           }
           System.out.println();
        }
    }
}
/*

**  *  
 *  ** * 
*   **  *


 */
