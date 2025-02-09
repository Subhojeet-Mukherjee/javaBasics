
import java.util.Scanner;

public class string_2{
    public static void main(String args[]){
        //Input a string from the user. Create a new string called ‘result’ 
        //in which you will replace the letter ‘e’ in the original string with letter ‘i’. 
        Scanner sc= new Scanner(System.in);
        String result=sc.nextLine();
        System.out.println(result.replace('e', 'i'));

    }
}