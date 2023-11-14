package recur_interview.Array.Pattern;

public class patt15 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=9;j++){
                if(i==1 || i==j ||10-i==j){
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
 *********
 *     * 
  *   *  
   * *   
    *   
 */
