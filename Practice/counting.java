
import java.util.Scanner;

public class counting{
    public static void main(String args[]){
//Write a program to enter the numbers till the user wants and at the end 
//it should display the count of positive, negative and zeros entered. 
    String res="";
    int positive=0;
    int nega=0;
    int zero=0;
    Scanner sc=new Scanner(System.in);
    for (int i = 0; i <1;) {
        System.out.println("Enter number or"+"\"done\""+"to stop");
        res=sc.nextLine();
        if(res.equalsIgnoreCase("done")){
            break;
        }else{
            int num=Integer.parseInt(res);
            if(num>0){
                positive++;
            } if(num<0){
                nega++;
            }if(num==0){
                zero++;
            }
        }
    }  System.out.println(positive);
    System.out.println(nega);
    System.out.println(zero);
    }
    }
    
