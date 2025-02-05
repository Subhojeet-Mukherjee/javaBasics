class hollowRectangle_8{
public static void main(String args[]){
int n=6;
for(int i=1;i<=n;i++){    // this is for rows numebers
    for(int j=1;j<=n;j++){       
        if(i==1 || j==1 || i==n || j==n){ // this is for print star on border line only //
            System.out.print("*");          // beacuse to print by the border consider starting  
        }else{System.out.print(" ");}    //and ending rows or columns index//
    }
    System.out.println("");     // this is for next line//
}
}
}