package recur_interview.Array.Pattern;

public class pata9 {
    static int m=5;
    public static void main(String[] args) {
        for(int i=1;i<=9;i++){
            if(i<=5){
                for(int j=1;j<=i-1;j++){
                     System.out.print(m--+" ");
                 }
                for(int k=1;k<=11-2*i;k++){
                    System.out.print(m);
                }
                 for(int l=1;l<=i-1;l++){
                    System.out.print(++m);
                 }
             }
            else{
                for(int j=1;j<=i-1;j++){
                     System.out.print(m--+" ");
                 }
                for(int k=1;k<=11-2*i;k++){
                    System.out.print(m);
                }
                 for(int l=1;l<=i-1;l++){
                    System.out.print(++m);
                    m=m+1;
                }
                System.out.println();
            }
        }
    }
}
