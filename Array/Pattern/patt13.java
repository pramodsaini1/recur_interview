package recur_interview.Array.Pattern;

public class patt13 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=5-i;j>=0;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                if(k%2==1){
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
 
 *
        * *
       * * *
      * * * *
     * * * * *
     

     
 */
