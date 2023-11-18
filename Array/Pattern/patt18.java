package recur_interview.Array.Pattern;

public class patt18 {
    public static void main(String[] args) {
        for(int i=1;i<=9;i++){
            if(i<=5){
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                for(int k=10-2*i;k>=0;k--){
                    System.out.print(" ");
                }
                 for(int l=1;l<=i;l++){
                    System.out.print("*");
                }
                System.out.println();
            }
            else{
                  for(int j=1;j<=10-i;j++){
                       System.out.print("*");
                  }
                  for(int k=10-2*i;k>=0;k--){
                     
                  }
                  for(int l=1;l<=10-i;l++){
                     System.out.print("*");
                  }

            }
        }
    }
}
