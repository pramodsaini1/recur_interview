package recur_interview;

public class factorial {
    public static int factorial(int n){
        if(n==0 ||n==1){
            return n;
        }
        else{
            return n*factorial(n-1);
        }
    }
    public static void main(String []arr){
        int n=5;
        System.out.println(factorial(n));
    }
}
