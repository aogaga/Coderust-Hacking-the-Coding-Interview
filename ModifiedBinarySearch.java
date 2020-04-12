class ModifiedBinarySearch{
	
	public static void main(String [] args){
					  int[] v1 = {6, 7, 1, 2, 3, 4, 5};
		int result = binarySearchRotated(v1, 3);
		System.out.println(result);	
	}


	 static int binarySearchRotated(int[] arr,int key) {
				int mid = arr.length / 2;
				int high arr.length -1;
				 
					 return BinarySearch(arr, key, mid, 0, high );	
	 }
	public static int BinarySearch(int [] arr, int key, int mid, int low, int high){
	
		if(arr[mid] == key){
			return mid;
		}	else if(key >= arr[mid] && key <= arr[high] ){
			
			low = mid;
			mid = (mid + high) /2;

		return BinarySearch(arr, key,mid, low, high  );
		}	else if (arr[low] <= key && arr[mid] >= key){
			high = mid;
			mid = high /2;
			    return BinarySearch(arr, key,mid, low, high );
		}else{
			return -1;
		}
	

	}

}
