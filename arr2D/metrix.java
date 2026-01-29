package arr2D;
import java.util.*;

public class metrix {

	public static void main(String[] args) {
    int arr[][]=takeInputMetrix();
    printArr(arr);
    
	}

	private static void printArr(int [][]arr) {
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(arr[i][j]+" ");
				}
			System.out.println();
		}
		
		
	}

	private static int [][]
			takeInputMetrix() {
		int arr[][]=new int[2][2];
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				arr[i][j]=sc.nextInt();
			}
			
		}
		return arr;
		
	}

}
