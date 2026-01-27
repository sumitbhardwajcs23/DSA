package Arr;

public class reverseArr {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8};
		reverseArr(arr);
		printArr(arr);

	}
	
	
	static void printArr(int [] arr) {
		System.out.print("[");
		for(int a:arr) {
			System.out.print(" "+a+",");
		}
		System.out.print("]");
	}
	private static void reverseArr(int [] arr) {
		// TODO Auto-generated method stub
		int st=0;
		int end=arr.length-1;
		while(st<=end) {
			int temp=arr[st];
			arr[st]=arr[end];
			arr[end]=temp;
			st++;
			end--;
			
		}
		
	}


}
