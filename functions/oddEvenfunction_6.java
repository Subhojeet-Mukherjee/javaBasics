public class oddEvenfunction_6{
            //Make a function to check if a given number n is even or not.
    public static void even(int a){
        if(a<=0){
            System.out.println("invalid");
            return;
        }
        if(a%2==0){
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
     }
    public static void main(String args[]){
        int a=1;
        even(a);
    }
}