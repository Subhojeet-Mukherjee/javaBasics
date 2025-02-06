public class tableFunction_7{
    public static void table(int a){
        for(int i=1;i<=10;i++){
            System.out.printf("%d x %d =%d",a,i,i*a);
            System.out.println("");
        }
    }
    public static void main(String args[]){
        //Make a function to print the table of a given number n.
        int a=5;
        table(a);
    }
}