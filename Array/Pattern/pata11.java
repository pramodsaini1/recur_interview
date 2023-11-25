package recur_interview.Array.Pattern;

public class pata11 {
    static int m=4;
    public static void main(String[] args) {
        for(int i=1;i<=7;i++){
            if(i<=4){
                for(int j=1;j<=i-1;j++){
                    System.out.print(m--+" ");
                }
                for(int k=1;k<=9-2*i;k++){
                    System.out.print(m+" ");
                }
                for(int l=1;l<=i-1;l++){
                    System.out.print(++m+" ");
                }
                System.out.println();
            }
            
            
        }
    }
}
/*
 * 4 4 4 4 4 4 4
4 3 3 3 3 3 4
4 3 2 2 2 3 4
4 3 2 1 2 3 4
 */
