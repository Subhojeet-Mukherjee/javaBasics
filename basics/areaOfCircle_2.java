
import java.util.Scanner;

class areaOfCircle_2{
    public static void main(String[] args) {
/*Make a program that takes the radius of a circle as input, 
calculates its radius and area and prints it as output to the user.*/

System.out.println("Enter the radius of the circle:");
Scanner sc=new Scanner(System.in);
float R= sc.nextFloat();

System.out.printf("The area of the circle is %f", 3.142*R*R);
    }
}