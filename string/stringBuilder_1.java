import java.util.*;
public class stringBuilder_1{
    public static void main(String args[]){
        //Take an array of Strings input from the user & 
        //find the cumulative (combined) length of all those strings.
        //using StringBuilder
        Scanner sc= new Scanner(System.in);  
        int num=sc.nextInt();
        sc.nextLine();
        String s;
        StringBuilder arr=new StringBuilder();
        for(int i=0;i<num;i++){
            s=sc.nextLine();
            arr.append(s);
        }
        int total=arr.length();        
        System.out.println(total);
          }
}