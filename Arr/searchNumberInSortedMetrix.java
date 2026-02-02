package Arr;

public class searchNumberInSortedMetrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=5, y=5;
int arr[][]=new int[x][y];
int a=1;
for(int i=0;i<arr.length;i++) {
	for(int j=0;j<arr[i].length;j++) {
		if(a<=x*y) {
			arr[i][j]=a;
		}
		a++;
		
	}
}

printArr(arr);

findNum(arr);
	}

	private static void findNum(int[][] arr) {
		// TODO Auto-generated method stub
		int a=13;
		int i=0;
		int j=arr[i].length-1;
		while (i<arr.length && j>=0) {
			
			if(arr[i][j]==a) {
				System.out.println("the num is i= "+i+", j= " + j);
				return;
				
			}
			//bottom
			else if(arr[i+1][j]>a) {
				j--;
			}
			else {
				i++;
			}
			
		
			
		}
		System.out.println("not found ");
	
		
	}

	private static void printArr(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+", ");
				}
			System.out.println();	
			}
	}

}
