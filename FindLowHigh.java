
public class FindLowHigh {

    public static void main(String [] args){
        System.out.println("Program Starts");
        int [] a = new int [] {1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 4, 4, 4,4, 5, 5, 5, 6, 6, 6, 6, 6, 6};
        int low = findlow(a, 5);
        int high = findHigh(a, 5);

        System.out.println( low);

        System.out.println(high);

        System.out.println("Program ends");
    }


    public static int findlow(int [] a, int key){

        int low = 0;
        int high = a.length -1;
        int mid = low + (high - low) /2;

        while(low <= high){
            if(a[low] == key){
                return mid;
            }    
            if(key > a[mid]){
                // go right 
                low = mid;
      
            }else{
                //go left
                high = mid;
            }
            mid = low + (high -low) /2;
        }
        return -1;
    }


    public static int findHigh(int [] a, int key){

        int low  = 0;
        int high = a.length -1;
        int mid = low + (high  - low) / 2;

        while(low <= high){
            if(a[high] == key){
                return high;
            }else if(key > a[mid]){
                // go riight
                low = mid;
                mid = low + (high -  low) /2;
            }else if(key < a[mid]){
                high = mid;
                mid = low + (high - low) /2;
            }
        }
        return -1;
    }

}