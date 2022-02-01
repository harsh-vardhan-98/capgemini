class BubbleSort{
	public int[] bubbleSort(int arr[]) {
		int temp =0;
		for (int i=0;i<(arr.length-1);i++) {
			for (int j=1;j<arr.length;j++) {
				if(arr[j-1]>arr[j]) {
					temp = arr[j-1];
					arr[j-1]=arr[j];
					arr[j] = temp;
				}else {
					continue;
				}
			}
		}
		
		return arr;
	} 
}
public class Assignment1Q8 {
	public static void main(String[] args) {
		int arr[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		BubbleSort b = new BubbleSort();
		int [] ob= b.bubbleSort(arr);
		for (int x = 0; x<ob.length;x++) {
			System.out.print(ob[x]+" ");
		}
	}

}
