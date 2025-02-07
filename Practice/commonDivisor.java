
import java.util.Scanner;

public class commonDivisor{
    public static void main(String args[]){
//Write a function that calculates the Greatest Common Divisor of 2 numbers.
    Scanner sc= new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int result=0;
    if(a==0 ||b==0){
        System.out.println("Invalid");
        return;
    }
    for(int i=1;i<=a;i++){
       if(a%i==0 && b%i==0){
        result=i; 
    }
   } System.out.println(result);
   } 
   }