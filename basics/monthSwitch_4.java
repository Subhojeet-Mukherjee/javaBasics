
import java.util.*;
class monthSwitch_4{
    //Ask the user to enter the number of the month & print the name of the month.
    //For eg - For ‘1’ print ‘January’, ‘2’ print ‘February’ & so on.

    public static void main(String args[]){
    Scanner sc1= new Scanner(System.in); 
    System.out.println("Enter the number of the month (1-12):");
    int answer;
    answer= sc1.nextInt();
    switch(answer){
        case 1: System.out.println("JANUARY");
        break;
        case 2: System.out.println("FEBRUARY");
        break;
        case 3: System.out.println("March");
        break;
        case 4: System.out.println("April");
        break;
        case 5: System.out.println("May");
        break;
        case 6: System.out.println("JUNE");
        break;
        case 7: System.out.println("July");
        break;
        case 8: System.out.println("August");
        break;
        case 9: System.out.println("September");
        break;
        case 10: System.out.println("October");
        break;
        case 11: System.out.println("November");
        break;
        case 12: System.out.println("DECEMBER");
        break;
        default:System.out.println("You have entered a invalid Input");

    } 
    sc1.close();
    }
}