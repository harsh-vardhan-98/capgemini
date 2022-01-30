class SearchArray{
	public boolean searchArray(int[] arr, int value) {
		boolean result = true;
		for (int i=0;i<arr.length; i++) {
			if(arr[i]==value) {
				result = true;
				break;
			}else {
				result = false;
			}
		}
		return result;
	
	}


}



public class Assignment1Q7 {
	public static void main(String[] args) {
		int arr[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		int valueCheck = 14;
		SearchArray s = new SearchArray();
		System.out.println(s.searchArray(arr, valueCheck));
		
		
	}

}
