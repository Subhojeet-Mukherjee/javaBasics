
import java.util.Scanner;

public class fibonacci{
    public static void main(String args[]){
/*Write a program to print Fibonacci series of n terms where n is input by user :
0 1 1 2 3 5 8 13 21 ..... 
In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.*/
        int n; 
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt(); // taking input of the terms
        int first=0,second=1,third;// initializing first and second term of the series
        System.out.print(first+" ");// printing first term
        System.out.print(second+" ");//printing second term

        for(int i=3;i<=n;i++){
            third=first+second;//third term is always first+second term
            System.out.print(third+" ");//printing third term
            first=second;//after that previous second term becomes new first term
            second=third;//the previous third term becomes new second term
        }

    }
}   // include if statement if want to cover 0 & 1 terms