package recur_interview.Array.Pattern;
import java.util.*;
public class pata6 {
    static int m,n=69;
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            m=n;
            for(int j=6-i;j>=1;j--){
                System.out.print((char)m+" ");
                m=m-1;
            }
            System.out.println();
            n=n-1;
            
        }
    }
}
/*
 * E D C B A
D C B A
C B A
B A
A
 */
