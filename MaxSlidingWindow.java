import java.util.*;
class MaxSlidingWindow{

	public static void main(String [] args){
			ArrayList<Integer> result = new ArrayList<Integer>();
			   int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
			 result = getMaxSlidingWindow(arr, 2);
			 System.out.println(result.toString());
	}
	public static ArrayDeque<Integer> findMaxSlidingWindow(int[] arr, int WindowSize){

		ArrayDeque<Integer> result = new ArrayDeque<Integer>();
		Deque<Integer> list = new LinkedList<Integer>();

		if(arr.length > 0){

			if(arr.length < WindowSize){
				return result;
			}


			for(int i = 0; i < WindowSize; i++){
				while(!list.isEmpty() && arr[i] >=arr[list.peekLast()]){
					list.removeLast();
				}

				list.addLast(i);
			}


			for(int i = WindowSize; i < arr.length; ++i){
				result.add(arr[list.peek()]);

				while((!list.isEmpty()) && list.peek() <= i - WindowSize)
					list.removeFirst();

				while((!list.isEmpty()) && arr[i] >= arr[list.peekLast()])
					list.removeLast();

				list.addLast(i);
			}

			result.add(arr[list.peek()]);
			return result;
		}
		 else
		 	return result;

	}
	

	public static ArrayList<Integer> getMaxSlidingWindow(int [] arr, int WindowSize){

		ArrayList<Integer> result = new ArrayList<Integer>();

		for(int i = 0; i < (arr.length - WindowSize); i++){

			int tempResult = getMax(arr, i, WindowSize);
			System.out.println(tempResult);
			result.add(tempResult);

		}

		return result;

	}


	public static int getMax(int arr[], int startIndex, int WindowSize){

		int result = arr[startIndex];

		for(int i = 1; i <= 3; i++){
				
				if(arr[startIndex] > result){
					result = arr[startIndex];
				}
			startIndex++;
		}

		return result;
	}
}