
import java.util.Scanner;

public class averageFunction_8{
    public static void average(int arr[]){
        int sum=0;
        for(int i=0;i<3;i++){
            sum+=arr[i];
        } 
        int av=sum/3;
        System.out.println(av);
    }
    public static void main(String args[]){
        //Enter 3 numbers from the user & make a function to print their average.
    int arr[]= new int[3];
    Scanner sc=new Scanner(System.in);
    System.out.println("enter 3 numbers:");
    for(int i=0;i<3;i++){
        arr[i]=sc.nextInt();
    }
    average(arr);// calling the function and pass the array variable
    

    }
}