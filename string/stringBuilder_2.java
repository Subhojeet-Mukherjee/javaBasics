
import java.util.Scanner;

public class stringBuilder_2{
    public static void main(String args[]){
        //Input a string from the user. Create a new string called ‘result’ 
        //in which you will replace the letter ‘e’ in the original string with letter ‘i’. 
        //using StringBuilder
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder sb= new StringBuilder(s);
        String result=sb.toString().replace('e', 'i');
        sb.replace(0,sb.length(),result);
        System.out.println(sb.toString());
    
    }
}