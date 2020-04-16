public class BinarySearchIterative{

    public static void main(String [] args){
        int[] v1 = {6, 7, 1, 2, 3, 4, 5};
		int[] v2 = {4, 5, 6, 1, 2, 3};
    }

    public static int binartSearch(int [] arr, int key){
        
        int low = 0;
        int high = arr.length -1;
        int mid = high /2;

      if(low > high ){ 
          return -1;
        }   

        while(low < high){
            mid = low + (high -low) /2;

            if(arr[mid] == key){
                return mid;
            }

            if(arr[start] <= arr[mid] )
        }


    }



}