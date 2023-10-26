package recur_interview;

public class pat2 {
    int m;
    public void jseries(int j){
          if(j<m){
            System.out.println(j+m+" ");
            jseries(j+1);
          }
    }
    public void iseries(int i){
          if(i<=5){
               m=i;
               jseries(0);
               System.out.println();
               iseries(i+1);
          }
    }
    public static void main(String []arr){
        int i=1;
        pat2 obj = new pat2();
        obj.iseries(i);
    }
}
