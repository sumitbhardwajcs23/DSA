package strings;

public class shortestPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="WNEENESENNN";
		System.out.println(" shortest path"+ path(s));

	}

	private static double path(String s) {
		// TODO Auto-generated method stub
		int x=0, y=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='N') y++;
			if(s.charAt(i)=='S') y--;
			if(s.charAt(i)=='E') x++;
			if(s.charAt(i)=='W') x--;
			
		}
		
		
		double result =Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
		
		
		return result;
		
	}

}
