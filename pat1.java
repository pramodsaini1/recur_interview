package recur_interview;

public class pat1 {
    int n;
    public void jseries(int j){
        if(j<=n){
             System.out.print(j+" ");
             jseries(j+1);
        }
    }
    public void iseries(int i){
        if(i<=5){
            n=i;
            jseries(1);
            System.out.println();
            iseries(i+1);
        }
    }
    public static void main(String []arr){
        int i=1;
        pat1 obj = new pat1();
        obj.iseries(1);
    }
}
