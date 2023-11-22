package recur_interview.Array.Pattern;

public class pata4 {
    static int m,n=1;
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
             for(int j=5-i;j>=0;j--){
                  System.out.print(" ");
             }
             m=n;
             for(int k=1;k<=i;k++){
                System.out.print(m);
                m=m-1;
             }
             m=m+2;
             for(int l=0;l<i-1;l++){
                System.out.print(m);
                m=m+1;
             }
             System.out.println();
             n=n+1;
        }
    }
}
/*
 1
    212
   32123
  4321234
 543212345
 */
