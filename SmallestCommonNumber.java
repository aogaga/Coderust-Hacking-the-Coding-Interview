
public class SmallestCommonNumber {

    public static void main(String [] args){
        int[] v1 = new int[]{6, 7, 10, 25, 30, 63, 64 , 4};
        int[] v2 = new int[]{1, 4, 5, 6, 7, 8, 50};
        int[] v3 = new int[]{1, 6, 4, 10, 14};

        int result = findSmallestComonNumber(v1, v2, v3);
        System.out.println(result);
    }
    public static int findSmallestComonNumber(int [] arr1, int [] arr2, int [] arr3){
        int i = 0, j = 0, k  = 0;
        while(i < arr1.length && j < arr2.length && k < arr3.length ){
            if(arr1[i] == arr2[j] && arr2[j] <= arr3[k]){
                return arr1[i];
            }

            if(arr1[i] <= arr2[j] && arr1[i] <= arr3[k] ){
                i++;
            }


            if(arr2[j] <= arr1[i] && arr2[j] <= arr3[k]){
                j++;
            }

            if(arr3[k] <= arr1[i] && arr3[k] <= arr2[j] ){
                k++;
            }
        }


        return -1;
    }
}