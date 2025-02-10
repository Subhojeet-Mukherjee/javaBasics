
import java.util.Scanner;

public class stringBuilder_3{
    public static void main(String args[]){
                //Input an email from the user. 
        //You have to create a username from the email by deleting the part that
        // comes after ‘@’. Display that username to the user.
        //using StringBuilder
        Scanner sc= new Scanner(System.in);
        StringBuilder s=new StringBuilder(sc.nextLine());
        int num=s.toString().indexOf('@');
        String user=s.substring(0,num);
        System.out.println(user);
        
        }


    }
