package recur_interview;

public class fibo {
    public static int fibo(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        else{
            return fibo(n-2)+fibo(n-1);
        }
    }
    public static void main(String []arr){
        int n=7;
        for(int i=0;i<7;i++){
            System.out.println(fibo(i)+" ");
        }
    }
}
