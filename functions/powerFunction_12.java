
import java.util.Scanner;

public class powerFunction_12{
    public static void main(String args[]){
//Two numbers are entered by the user, x and n. Write a function to
// find the value of one number raised to the power of another i.e. x^n.
        Scanner scan =new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int init=a;
        if(b<0){System.out.println("enter positive number");return;}
            if(b==0){
                System.out.println("1");}else{
        for(int i=1;i<b;i++){
            a*=init;
        }  System.out.println(a);}
    }}
