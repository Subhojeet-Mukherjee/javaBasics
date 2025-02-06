public class array_4{
    public static void main(String[] args) {
    //Take an array of numbers as input and check if it is an array sorted in ascending order.
    int arr[]={1,2,3,10,5,6};
    if (arr.length == 0) {
    System.out.println("Array is empty.");
    return;  // Exit the method if the array is empty
    }

    boolean sasc=true; // assuming boolean is true 
    for(int i=1;i<arr.length;i++){// running the loop till its length
        
        if(arr[i]<=arr[i-1]){  // checking every element to its before element
            sasc=false; // if becomes true the boolean becomes false and exits loop
            break;      // if boolean became false that means array is not in assending order and need not check more
        }            
    }    boolean asc= sasc; // if boolean false then not ascending
        if(asc){            // if boolean true by deafult when does not enter to if statement and then its ascending
            System.out.println("ascending");
        }else{
            System.out.println("not ascending");
         }
    }
    }
