class ABinarySearch{


	public static void main(String [] args){
		int[] arr = {1, 10, 20, 47, 59, 63, 75, 88, 99, 107, 120, 133, 155, 162, 176, 188, 199, 200, 210, 222};
		
		int low = 0;
		int high = arr.length - 1;
		int mid = (high - low) / 2;

		int result =  doBinSearch(arr, 88, mid, high, low);
		System.out.println(result);
	}


	public static int doBinSearch(int [] a, int key, int mid, int high, int low){
	
		if(low > high){return -1;}

		if(a[mid] == key){
			return mid;
		}else if ( key > a[mid]){
			// go right
			
			low = mid;
			mid = low + ( ( high - low ) / 2);
			return doBinSearch(a, key, mid, high, low);
		}else{
			
			high = mid;
			mid = low + (( high -low) / 2);
			
			 return doBinSearch(a, key, mid, high, low);
			//go left
		}

	}

}
