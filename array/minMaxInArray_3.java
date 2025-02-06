public class minMaxInArray_3{
    public static void main(String args[]){
        //Find the maximum & minimum number in an array of integers. 
        int arr[]={200,22,5,6,3,84,2,32};
    int max=Integer.MIN_VALUE;   //assuming min value of integer is MAXIMUM  
    int min=Integer.MAX_VALUE;   // assumming max value of integer is MINIMUM
    for(int i=0;i<arr.length;i++){ // CHECKING EVERY ELEMENT OF THE ARRAY
        if(arr[i]<min){             // IF ANY ELEMENT BECOMES SMALLER THAN max value of integer
            min=arr[i];             // IT WILL BECOME NEW SMALL VALUE THUS LOOP CONTINUES AND CHECK EVERY ELEMENT ON ARRAY WITH THE NEWEST SMALL
        }           //AT LAST WE GET THE SMALLEST VALUE
    } System.out.println("the minimum value is "+ min);

    for(int j=0;j<arr.length;j++){ //CHECKING EVERY ELEMENT OF THE ARRAY
        if(arr[j]>max){            //IF ANY ELEMENT BECOMES GREATER THAN min VALUE OF INTEGER
            max=arr[j];            //IT WILL BECOME NEW MAX NUMBER AND IT CONTINUES CHECK EVERY ELEMENT
        }                           // AT LAST WE GET THE HIGHEST NUMBER
    }System.out.println("the maximum value is "+ max);
    }
}