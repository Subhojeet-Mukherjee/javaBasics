public class greaterFunction_10{
    //Write a function which takes in 2 numbers and returns the greater of those two.
    public static int  great(int a,int b){
        int res=a;
     if(a>b){
        res=a;
        
     }else if(b>a){
        res=b;
     }     
    return res;}
    
    public static void main(String args[]){
        int a=11;
        int b=11;
        int res=great(a,b);
        System.out.println(res);

    }
}