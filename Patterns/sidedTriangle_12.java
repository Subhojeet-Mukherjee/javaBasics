public class sidedTriangle_12{
    public static void main(String args[]){
        int n=7;
        // consider to do the pattern in two parts
        //1st part starts from here
        // atfirst we will do half part of the pattern
        //so do the pattern till (n+1)/2 th row
        for(int row=1;row<=(n+1)/2;row++){  // this is for (n+1)/2 th row
            for(int col=1;col<=row;col++){  // till (n+1)/2 th row the number of stars are equal to it's row number//
                System.out.print("*");
            }
            System.out.println("");    }
            // second part stars from here
            // now we will do the remaining part i.e, whole number less than n/2
    int m=n/2;
    for(int row1=1;row1<=m;row1++){   // this is for the remaining rows (n-m)
        for(int col1=1;col1<=m+1-row1;col1++){  //this for  the decreasing stars in each row by increaing in row number//
    System.out.print("*");
        }   
    System.out.println("");
    }
    }
}
        
    
