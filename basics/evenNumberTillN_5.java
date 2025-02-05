
import java.util.Scanner;

class evenNumberTillN_5{
    public static void main(String args[]){
//Print all even numbers till n.
int n;
System.out.println("Enter The 'n':");
Scanner sc1= new Scanner(System.in);
n =sc1.nextInt();
for(int i=2;i<=n;i+=2)
{ System.out.println(i);

}
    }
}