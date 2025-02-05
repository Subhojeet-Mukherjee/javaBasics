
import java.util.Scanner;

class solidRectanglePattern_7{
    public static void main(String args[]){
        System.out.println("enter a number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
    for(int i=1;i<=n;i++){      //this is outer loop and this is for rows
        for(int j=1;j<=n;j++){      // this is for stars print one after another in same row
            System.out.print("*");}   //
System.out.println("");             // this is for line change
    }
}}