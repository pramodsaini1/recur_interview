package recur_interview.Array.Pattern;

public class pata8 {
   static  int i,j,k=0,l=1;
    public static void main(String[] args) {
        for(i=1;i<=5;i++){
            for( j=1;j<=i;j++,k++,l++){
                if(k%2==1){
                    System.out.print((char)(l+64)+" "); 
                }
                else{
                     System.out.print((char)(l+96)+" ");
                }
            }
            System.out.println();
        }
    }
}
/*
 * a
B c
D e F
g H i J
k L m N o
 */
