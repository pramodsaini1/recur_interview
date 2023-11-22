package recur_interview.Array.Pattern;

public class pata5 {
    static int m;
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
            m=1;
            for(int j=1;j<=i;j++){
                System.out.print(m++ +" ");
            }
             for(int k=8-2*i;k>=0;k--){
                System.out.print(" ");
             }
             m=m-1;
             for(int l=1;l<=i;l++){
                System.out.print(m--+" ");
             }
             System.out.println();
        }
    }
}
