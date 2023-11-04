package recur_interview.Array.Pattern;

public class patt {
    static void display(int i){
        if(i<=5){
            System.out.print(i+" ");
            display(i+1);
        }
    }
    public static void main(String[] args) {
        int i=1;
        display(i);
    }
}
