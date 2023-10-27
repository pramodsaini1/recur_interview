package recur_interview;

public class StringLength {
    public int  SLength(String str){
          if(str.equals("")){
              return 0;
          }
          else{
              return SLength(str.substring(1))+1;
          }


    }
    public static void main(String []arr){
        String s="Pramod";
        StringLength obj = new StringLength();
        System.out.println(obj.SLength(s));
    }
}
