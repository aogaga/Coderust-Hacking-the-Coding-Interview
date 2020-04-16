class ModifiedBinarySearch{
	
	public static void main(String [] args){
		int[] v1 = {6, 7, 1, 2, 3, 4, 5};
		int[] v2 = {4, 5, 6, 1, 2, 3};



		int result1 = binarySearchRotated(v1, 3);
		int result2 = binarySearchRotated(v1, 6);

		int result3 = binarySearchRotated(v2, 3);
		int result4 = binarySearchRotated(v2, 6);



	
		
		if(result1 >=0){
			System.out.println(v1[result1]);
		}else{
			System.out.println(result1);
		}


		if(result2 >=0){
			System.out.println(v1[result2]);
		}else{
			System.out.println(result2);
		}



		if(result3 >=0){
			System.out.println(v2[result3]);
		}else{
			System.out.println(result3);
		}


		if(result4 >=0){
			System.out.println(v2[result4]);
		}else{
			System.out.println(result4);
		}
	}


	public static int binarySearchRotated(int[] arr,int key) {
		int high = arr.length -1;	
		int mid = high / 2;	 
		return BinarySearch(arr, key, mid, 0, high);	
	 }
	public static int BinarySearch(int [] arr, int key, int mid, int low, int high){
	
		if(low > high){
			return -1;
		}
		if(key == arr[low]){
			return low;
		}

		if(key == arr[high]){
			return high;
		}

		 
		if(arr[mid] == key){
			return mid;
			
		}	else if(key > arr[mid] && key < arr[high] ){
			
			low = mid;
			mid = (mid + high) /2;

		return BinarySearch(arr, key,mid, low, high  );

		}else if (key > arr[low] && key < arr[mid]){
			high = mid;
			mid = high /2;
			    return BinarySearch(arr, key,mid, low, high );
		}else{
			return -1;
		}
	

	}

}
