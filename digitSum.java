public class digitSum {
    static int sum(int n){
          if(n==0){
            return 0;
          }
          else{
              return(n%10+sum(n/10));
          }
    }
    public static void main(String []arr){
        int num=12345;
        
        System.out.println(sum(num));
    }
}
