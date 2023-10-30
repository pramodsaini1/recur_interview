package recur_interview;
import java.util.*;
public class reFibo {
    public static void fibo(int n,int a,int b){
        if(n>0){
            fibo(n-1,b,a+b);
            System.out.println(a+" ");
        }
    }
    public static void  main(String []arr){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter value of n:");
        n=sc.nextInt();
        fibo(n,0,1);
    }    
}
