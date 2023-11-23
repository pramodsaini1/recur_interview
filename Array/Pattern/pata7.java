package recur_interview.Array.Pattern;
import java.util.*;
public class pata7 {
    static int  m,n=69;
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            m=n;
            for(int j=1;j<=i;j++){
                 System.out.print((char)m+" ");
                 m=m+1;
            }
            System.out.println();
            n=n-1;
            
        }
    }
}
/*
E
D E
C D E
B C D E
A B C D E
 */
