package Arr;

public class SecLarInArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int[] arr = {5, 5, 5, 5};





		System.out.println("largrst num is  "+ findLarNum(arr));
	}
	
	public static int  findLarNum( int [] arr) {
		
		int lar=Integer.MIN_VALUE;
		int secLar=Integer.MIN_VALUE;
		for(int a:arr) {
			if(a>lar) {
				secLar=lar;
				lar=a;}	
				
				else if(a>secLar && a!=lar) {
					secLar=a;
				}
			
		}
		
		
		
		
		return secLar;
		
	}

}
