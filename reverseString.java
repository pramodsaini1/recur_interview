package recur_interview;

public class reverseString {
    public void reverse(String str){
          if(str==null || str.length()<=1){
            System.out.println(str);
          }
          else{
              System.out.println(str.length()-1);
              reverse(str.substring(0,str.length()-1));
          }
    }
    public static void main(String []arr){
        String s ="pramod";
        reverseString obj = new reverseString();
        obj.reverse(s);
    }
}
