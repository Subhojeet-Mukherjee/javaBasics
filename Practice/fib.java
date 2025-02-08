class fib{
    public static void main(String[] args) {
     //   0 1 1 2 3 5 8 13 21 ..... 

         int first=0,second=1,third;
         int n=15;
         for(int i=1;i<=n;i++){
          System.out.println(first);
        third=first+second;
        first=second;
        second=third;         
         }

    }
}