
import java.util.Scanner;
public class transpose2d_5{
    public static void main(String[] args) {
        //For a given matrix of N x M, print its transpose.
        int a,b;
        Scanner sc= new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        int arr[][]=new int [a][b];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
            arr[i][j]=sc.nextInt();
        }
   }
   int trow=b;
   int tcol=a;
   int tarr[][]=new int[trow][tcol];
        for(int i=0;i<trow;i++){
            for(int j=0;j<tcol;j++){
                tarr[i][j]=arr[j][i];
                System.out.print(tarr[i][j]+" ");
            }System.out.println();
        }

}}