package recur_interview;

public class dectobin {
      public int find(int decimal){
        if(decimal==0){
            return 0;
        }
        else{
            return (decimal %2+10*find(decimal/2));
        }
      }
      public static void main(String []arr){
        int dec=10;
        dectobin obj = new dectobin();
        System.out.println(obj.find(dec));
      }
}
