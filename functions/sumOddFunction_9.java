public class sumOddFunction_9{
    public static void sum(int a){
     //Write a function to print the sum of all odd numbers from 1 to n.
/*int res=1;
        for(int i=3;i<=a;i+=2){
            res+=i;
            } System.out.println(res);
        }*/
       int res=1;
       for(int i=3;i<=a;i++){
        if(i%2!=0){
            res+=i;
        }

       } System.out.println(res);
}
    public static void main(String args[]){
     int n=9;
     sum(n);

    }
}