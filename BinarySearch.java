class BinarySearch{
	
	public static void main(String [] args){
	int[] arr = {1, 10, 20, 47, 59, 63, 75, 88, 99, 107, 120, 133, 155, 162, 176, 188, 199, 200, 210, 222  };

	int high =  (arr.length -1);
	int mid = high /2;
	int result = doBinarySearch(arr, 63, 0, high , mid);
		System.out.println(result);
	}
	public static int doBinarySearch(int [] a, int num, int low, int high, int mid){
	

		if(low > high){ 
						
			return -1;
		}
		
	 if(a[mid] == num){
			return mid;				
		}else if(num > a[mid]){
				low = mid;
				mid = (low + high )/2;
	return			doBinarySearch(a, num, low, high, mid);
		}else {
				high = mid;
				mid = (low + high) /2;
				return doBinarySearch(a, num, low, high, mid);
				//

			}
		
	}
}
