package recur_interview;

public class pat {
        void display(int i){
            if(i<=5){
                System.out.print(i+" ");
                display(i+1);
            }
        }
        public static void main(String []arr){
            int i=1;
            pat obj =new pat();
            obj.display(i);
        }
}
