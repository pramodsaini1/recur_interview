public class digitSum {
    static int sum_Of_digit(int n){
          if(n==0){
            return 0;
          }
          else{
              return(n%10+sum_Of_digit(n/10));
          }
    }
    public static void main(String []arr){
        int num=12345;
        digitSum obj = new digitSum();
        System.out.println(obj.sum_Of_digit(num));
    }
}
