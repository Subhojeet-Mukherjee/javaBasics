public class fibonacci{
    public static void main(String args[]){
/*Write a program to print Fibonacci series of n terms where n is input by user :
0 1 1 2 3 5 8 13 21 ..... 
In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.*/
        int n=10;
        int a=1;
        int res;
        for(int i=-1;i<n-1;i++){
            res=a+i;
            System.out.println(res);
        }

    }
}