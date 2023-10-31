package recur_interview;

public class concept {
    public static void main(String []arr){
        fun(5);
    }
    static void fun(int n){
        if(n==0){
            return ;
        }
        System.out.println(n);
        fun(n--);
    }
}
