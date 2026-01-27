package Arr;

public class binarySearchWithoutWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,7,8,9};
		int key = 4;
		System.out.println("the index num is  "+ binarySearch(arr , key));

	}
	static int binarySearch(int arr[] ,int key) {
		int st=0;
		int end=arr.length-1;
		while(st<=end) {
			int mid=(st+end)/2;
			if(arr[mid]==key) {
				return mid;
			}
			else if(arr[mid]<key) {
				st=mid+1;
			}
			else {
				end=mid-1;
			}
		}
		
		return -1;
		
	}

}
