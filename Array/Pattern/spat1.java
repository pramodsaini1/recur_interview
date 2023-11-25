package recur_interview.Array.Pattern;

public class spat1 {
    public static void main(String[] args) {
        for(int i=1;i<=9;i++){
            for(int j=1;j<=9;j++){
                 if(i==j ||10-i==j){
                    if(i%2==1){
                        System.out.print(i);
                    }
                    else{
                         System.out.print("*");
                    }
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
 * 1       1
 *     *
  3   3
   * *
    5
   * *
  7   7
 *     *
9       9
 */
