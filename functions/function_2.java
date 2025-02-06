public class function_2{
    public static void fac(int a){
        if(a<0){
            System.out.println("Enter greater than zero value");
            return;
        }
        int factorial=1;
        for(int i=1;i<=a;i++){
            factorial=i*factorial;
        }
        System.out.println(factorial);
    }
    public static void main(String args[]){
        //Qs. Write a function to calculate the factorial of a number.
        int a=25;
        fac(a);
    }
}