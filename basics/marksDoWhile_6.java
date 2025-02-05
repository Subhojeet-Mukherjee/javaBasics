import java.util.*;
class marksDoWhile_6{
    public static void main(String args[]){
//          Make a menu driven program. The user can enter 2 numbers, either 1 or 0. 
// If the user enters 1 then keep taking input from the user for a student’s marks(out of 100). 
// If they enter 0 then stop.
// If he/ she scores :
// Marks >=90 -> print “This is Good”
// 89 >= Marks >= 60 -> print “This is also Good”
// 59 >= Marks >= 0 -> print “This is Good as well”
int answer;
do{
System.out.println("Enter 1 or 0 :");
Scanner sc1= new Scanner(System.in);
answer=sc1.nextInt();
if(answer==1){
    System.out.println("Enter the marks:");
    int marks;
    marks=sc1.nextInt();
    if(marks>=90 && marks<=100){
        System.out.println("Good");
    }else if (marks>=60 && marks<=89){
        System.out.println("ok");
    }else if(marks>=0 && marks<=59){
        System.out.println("not good");
    }else System.out.println("invalid");
    }
    }
    while(answer==1);
}}