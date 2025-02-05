class reverseHalfPyramid_10{
    public static void main(String args[]){
        int n=5;
        for(int row=1;row<=n;row++){ // this is for the number of rows
            for(int col=1;col<=n-row+1;col++){ //this is for stars in each row & the number of star in a row is (n-row number+1)  
                System.out.print("*");         //the stars are decreaing with increasing row number
            }
            System.out.println("");
        }


    }
}