package recur_interview.Array.Pattern;

public class patt22 {
    static int m,n=1;
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            m=n;
            for(int j=1;j<=i;j++){
               System.out.print(m+" ");
               m=m^1;
            }
            System.out.println();
            n=n^1;
        }
    }
}
/*
 1
0 1
1 0 1
0 1 0 1
1 0 1 0 1


 */
