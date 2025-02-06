
import java.util.Scanner;

public class indexSearchInArray_2{
    public static void main(String args[]){
        //index number search of a given number from user.
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=sc.nextInt();
        int arr[]= new int [size];
        System.out.println("enter your numbers in array:");

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("search number:");
        int x=sc.nextInt();
        for(int j=0;j<arr.length;j++){
            if(arr[j]==x){
                System.out.println("your number is in the index of "+j);
            }
        }


    }
}