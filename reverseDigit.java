package recur_interview;

public class reverseDigit {
     
    static int sum=0;
    static void reverse(int n){
        if(n==0){
            return ;

        }
        
            int rem=n%10;
                sum = sum*10+rem;
               reverse(n/10);
        
         
    }
    public static void main(String []arr){
        reverse(1824);
        System.out.println(sum);
    }
}
