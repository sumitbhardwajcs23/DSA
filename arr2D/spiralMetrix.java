package arr2D;

public class spiralMetrix {

	public static void main(String[] args) {
		int arr[][] = new int[5][5];
		int num = 1;

		for(int i=0;i<arr.length;i++) {
          //  int num =1;
			for(int j=0;j<arr[0].length;j++) {
				if(num<=9) {
					arr[i][j]=num;
					num++;}
					else {
						num=1;
				}
			}
		}
		printArr(arr);
		printspiral(arr);
		


	}
	private static void printspiral(int[][] arr) {
		// TODO Auto-generated method stub
		int str = 0,stc=0, endr=arr.length-1 ,endc=arr[0].length-1;
	while(str<=endr && stc<= endc) {
		// top
		for(int i=stc;i<=endc;i++) {
			System.out.print(arr[str][i]+", ");
		}
		//right
		for(int j=str+1;j<=endr;j++) {
		System.out.print(arr[j][endc]+", ");}
		
		//bottomn
		for(int i=endc-1;i>=stc;i--) {
		System.out.print(arr[endr][i]+", ");}
		//left
		for(int j=endr-1;j>str;j--) {
			System.out.print(arr[j][stc]+", ");}
		
		


        
        
		stc++ ; endc--;
		str++ ; endr--;
		}

		
	}
	private static void printArr(int [][]arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
				}
			System.out.println();
		}
		
		
	}
}
