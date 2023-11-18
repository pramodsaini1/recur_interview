package recur_interview.Array.Pattern;

public class patt17 {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            if(i<=5){
                 for(int j=6-i;j>=1;j--){
                    System.out.print("*");
                 }
                 for(int k=0;k<=2*i-2;k++){
                    System.out.print(" ");
                 }
                 for(int l=6-i;l>=1;l--){
                    System.out.print("*");
                 }
                 System.out.println();

            }
            else{
                 
                for(int j=1;j<=i-5;j++){
                    System.out.print("*");
                }
                for(int k=20-2*i;k>=0;k--){
                    System.out.print(" ");
                }
                for(int l=1;l<=i-5;l++){
                    System.out.print("*");
                }
                System.out.println();
                 
            }
            
        }
    }
}
/*


 ***** *****
****   ****
***     ***
**       **
*         *
*         *
**       **
***     ***
****   ****
***** *****


 */
