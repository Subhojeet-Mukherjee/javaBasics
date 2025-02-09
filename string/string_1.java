import java.util.*;
public class string_1{
    public static void main(String args[]){
//Take an array of Strings input from the user & 
//find the cumulative (combined) length of all those strings.
        int n;      
        int ftotal=0;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        sc.nextLine();
        String arr[]=new String[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextLine();
        }  
        for(int i=0;i<arr.length;i++){
            int total=arr[i].length();
            ftotal+=total;
        } System.out.println(ftotal);

    }
}