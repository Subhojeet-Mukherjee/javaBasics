import java.util.Scanner;

class tablePrint_1{
    public static void main(String[] args){
        // Make a program that prints the table of a number that is input by the user. 
// (HINT - You will have to write 10 lines for this but as we proceed in the course 
// you will be studying about ‘LOOPS’ that will simplify your work A LOT!)
    Scanner sc= new Scanner(System.in);
    int num=sc.nextInt();
    System.out.println("1x"+num +"="+ num*1);
    System.out.printf("2x%d=%d\n",num,num*2);
    System.out.printf("3x%d=%d\n",num,num*3);
    System.out.printf("4x%d=%d\n",num,num*4);
    System.out.printf("5x%d=%d\n",num,num*5);
    System.out.printf("6x%d=%d\n",num,num*6);
    System.out.printf("7x%d=%d\n",num,num*7);
    System.out.printf("8x%d=%d\n",num,num*8);
    System.out.printf("9x%d=%d\n",num,num*9);
    System.out.printf("10x%d=%d\n",num,num*10);
   
    
    


    
    
    
    
    
    }
}