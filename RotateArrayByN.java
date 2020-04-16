
public class RotateArrayByN {

    public static void main(String [] args){
        int [] arr = new int[] {1, 10, 20, 0, 59, 86, 32, 11, 9, 40};
        int [] result = rotateArray(arr, 2);
        for(int i = 0; i < result.length; i++){
           System.out.println(result[i]);
        }
    }

    public static int [] rotateArray(int [] arr, int n){

        if(n > 0){
            //rotate from right 
            for(int i = 1; i <= n ; i++){
                int temp = arr[arr.length - i];
                int temp2 = arr[i -1];

                // System.out.println(temp);
                // System.out.println(temp2);
                arr[arr.length - i] = temp2;
                arr[i-1] = temp;
            }
        
        }else{

            for(int i = n; i <=0 ; i++){
                int temp = arr[1 + i];
                int temp2 = arr[arr.length + i];

                // System.out.println(temp);
                // System.out.println(temp2);
                arr[1+i] = temp2;
                arr[arr.length + i] = temp;
              
            }
            // rotate from left 

         
        }

        return arr;
    }
}