package recur_interview;

public class dem {
     
        void display(){
            System.out.println("display");
            display();
        }
        public static void main(String []arr){
            dem d = new dem();
            d.display();
        }
    
}
