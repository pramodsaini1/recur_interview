package recur_interview.Array.Pattern;

public class spat {
    public static void main(String[] args) {
        for(int i=1;i<=9;i++){
            for(int j=1;j<=9;j++){
                if(i==5 && j==5){
                    System.out.print(i);
                }
                else if(i==j ||10-i==j){
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


*       *
 *     * 
  *   *  
   * *   
    5    
   * *   
  *   *
 *     *
*       *
 */
