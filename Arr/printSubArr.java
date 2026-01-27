package Arr;

public class printSubArr {

	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5,6,7,8};
		printArr(arr);
		
	}

	private static void printArr(int[] arr) {
		int x=0;
		int y=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				int sum=0;
				for(int k=i;k<=j;k++) {
					System.out.print(arr[k]+", ");
					x++;
					sum=sum+arr[k];
					if(sum>y) {
						y=sum;
					}
				}
				System.out.println();
				System.out.println("total sub arr  "+y );
			}
		}
		
		System.out.println("total sub arr  "+ x);
		System.out.println("total sub arr  "+y );
		
	}

}
