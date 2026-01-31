package arr2D;

public class sumOfDignols2DArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5, b=5;
		int arr[][]=new int[a][b];
		
		
		for(int i=0;i<arr.length;i++) {
			int c=1;
			for(int j=0;j<arr[i].length;j++) {
				if(c<=a*b) {
					arr[i][j]=c;
					
				}
				c++;
			}
		}
		
		printArr(arr);
		
		sumOfDignol(arr);
		

	}
	private static void sumOfDignol(int[][] arr) {
		// TODO Auto-generated method stub
		int a=0;
		for(int i=0;i<arr.length;i++) {
			
				 a=arr[i][i]+a;
					
				
				
			}
		System.out.println("sum is "+ a);
		
		
		int b=0;
		for(int i=arr.length-1;i>=0;i--) {
			
				 b=arr[i][i]+b;
				
			}
		System.out.println("sum is "+ a);
		
	}
	public static void printArr(int [][]arr) {
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+", ");
					
				}
				System.out.println();
			}
		}
		
	

}
