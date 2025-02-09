
import java.util.Scanner;

public class string_3{
    public static void main(String args[]){
        //Input an email from the user. 
        //You have to create a username from the email by deleting the part that
        // comes after ‘@’. Display that username to the user.
        Scanner sc= new Scanner(System.in);
        String a=sc.nextLine();
        int b=a.indexOf('@');
        String result=a.substring(0,b);
        System.out.println(result);                  

    }
}