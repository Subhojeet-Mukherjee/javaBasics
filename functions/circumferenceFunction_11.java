
import java.util.Scanner;

public class circumferenceFunction_11{
 //Write a function that takes in the radius as input and returns the circumference of a circle.
    public static float cir(int a){
     float res=2*3.14f*a;
    return res;
    }
    public static void main (String args[]){
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      if(a>0){
      System.out.println(cir(a)); } else{
      System.out.println("enter positive radius");
      }      
    }
}