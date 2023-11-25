package recur_interview.Array.Pattern;

public class pata10 {
    public static void main(String[] args) {
        for(int i=1;i<=9;i++){
            for(int j=1;j<=9;j++){
                if(6-i==j || 4+i==j ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
