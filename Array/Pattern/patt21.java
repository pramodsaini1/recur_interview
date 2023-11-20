package recur_interview.Array.Pattern;

public class patt21 {
    static int m,n=1,d=1;
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            m=n;
            for(int j=1;j<=i;j++){
                System.out.print(m++ +" ");
            }
            System.out.println();
            n=n+d;
            d++;
        }
    }
}
/*
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15


 */
