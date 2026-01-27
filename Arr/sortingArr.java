package Arr;

public class sortingArr {

	public static void main(String[] args) {
		int arr[]= {1,6,33,444,32,53,22,11,2,3,4,1,3,234,42,3};
		//bubbelsort(arr);
		seclectonSort(arr);

	}

	private static void seclectonSort(int[] arr) {
		for(int j=0;j<arr.length;j++) {
			int smallest=Integer.MAX_VALUE;
			
		for(int i=j;i<arr.length;i++) {
			
			if(smallest>arr[i]) {
				smallest=arr[i];
				arr[i]=arr[j];
				arr[j]=smallest;}
			
		
		}
		}
		printArr(arr);
		
	}

	private static void bubbelsort(int[] arr) {
		for(int j=0;j<arr.length;j++) {
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<arr[i-1]) {
				int temp=arr[i-1];
				arr[i-1]=arr[i];
				arr[i]=temp;}}}
		printArr(arr);
		
	}

	private static void printArr(int[] arr) {
		for(int a:arr) {
			System.out.print("  "+a);
		}
		
	}

}
