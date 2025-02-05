public class flippedHalfPyramid_11{
    public static void main(String args[]){
        int n=5;
        for(int row=1;row<=n;row++){         //this is for the row number
       
            for(int col=1;col<=n-row;col++){ //this is for the spaces       
                System.out.print(" ");         
            }
            for(int star=1;star<=row;star++){   // this is for the stars 
                System.out.print("*");
            }
        System.out.println("");             // this is for line change
        }
    }
}