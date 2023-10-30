package recur_interview;

public class Palindrome {
        public static boolean isCheck(String st,int s,int e){
            if(s==e){
                return true;
            }
            if(st.charAt(s)!=st.charAt(e)){
                return false;
            }
            if(s<e+1){
                return isCheck(st, s+1, e-1);
            }
            return true;
        }
        public static boolean isPalindrme(String str){
           int n=str.length();
           if(n==0){
            return true;
           }
           else{
              return isCheck(str,0,n-1);
           }
 
        }
 
    public static void main(String []arr){
        String s="pramod";
        if(isPalindrme(s)){
            System.out.println("String are Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
