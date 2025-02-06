
import java.util.Scanner;

public class array_1{
    public static void main(String args[]){
        // Take an array of names as input from the user and print them on the screen.
    System.out.println("enter number of names:");
    Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        sc.nextLine(); // THIS LINE IS FOR CONSUMING THE NEW LINE CHARACTER (\n) generated after the enter key press by user after int input 
String name[]= new String[number];    // if the previous line is missed then the (\n) will be caputered by the i=0 sc.nextLine();
    for(int i=0;i<number;i++){         // thus 1st element of the string will be empty
        name[i]=sc.nextLine();

    }
     for (int j=0;j<number;j++) {
         System.out.println(name[j]);       
        
     }  
    }
}