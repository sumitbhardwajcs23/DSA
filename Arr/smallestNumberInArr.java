package Arr;
public class smallestNumberInArr {
	public  static void main (String [] args) {
		int arr[]= { 12,23,45,56,67,665,98,87 ,-99};
		System.out.println("the smallest number in arr"+ findSmallestNumber(arr));	
	}
	static int findSmallestNumber(int []arr) {
		int sm=Integer.MAX_VALUE;
		for(int num:arr) {
			if(num<sm) {
				sm=num;	
			}
		}
		return sm;	
	}
}
