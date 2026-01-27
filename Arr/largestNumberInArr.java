/**
 * 
 */
package Arr;
public class largestNumberInArr {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr= {1,8,7,344,565,4556};
		System.out.println("largrst num is  "+ findLarNum(arr));
	}
	
	public static int  findLarNum( int [] arr) {
		
		int lar=Integer.MIN_VALUE;
		for(int a:arr) {
			if(a>lar) {
				lar=a;
				
			}
		}
		return lar;
		
	}

}
