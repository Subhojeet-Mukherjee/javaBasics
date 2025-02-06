
import java.util.Scanner;
//Write a function that takes in age as input and returns if that person is 
//eligible to vote or not. A person of age > 18 is eligible to vote.
public class adultFunction_12{
    public static String  vote(){
        Scanner sc=new Scanner(System.in);
         int a=sc.nextInt();
         if(a>18){
            return "eligible";
         }else{
          return "not eligible";
         }
    }
    public static void main(String args[]){
    System.out.println(vote());
    }
}