package recur_interview;

public class num1 {
    static void display(int n){
        if(n>0){
            System.out.print(n+" ");
            display(n-1);
        }
    }
    public static void main(String []arr){
        int n=10;
        display(n);
    }
}
