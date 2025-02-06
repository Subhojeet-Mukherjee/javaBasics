public class primeNumberFunction_4{
            //Make a function to check if a number is prime or not.
    public static void prime(int a){
            if(a<1){
                System.out.println("Invaild Input");
            return;
            } else if(a==1){
                System.out.println("not prime");
                return;
            } else if(a==2){
                System.out.println("prime");
                return;
            }
        for(int i=2;i*i<=a;i++){
            if(a%i==0){
                System.out.println("not prime");
                return;   
    } 

    } System.out.println("prime");}
    public static void main (String args[]){
        int a=5;
        prime(a);

    }}
