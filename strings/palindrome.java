package strings;
import java.util.*;
public class palindrome {

	public static void main(String[] args) {
		
		String s="racecar";
System.out.println("   "+		
   pali(s));

	}

	private static boolean pali(String s) {
		for(int a=0; a<(s.length()/2);a++) {
			if(s.charAt(a)!=s.charAt(s.length()-a-1)) {
				return false;
			}
		}
		return true;
		// TODO Auto-generated method stub
		
	}
}
