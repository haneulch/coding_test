import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i = 0; i < t; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			System.out.println(getCount(x, y));
		}
	}
	
	public static int getCount(int x, int y) {
		
		int z = y - x;
		
		double temp = Math.sqrt(z);
		int step = (int) temp;
		
		if( temp == step) {
			return (step * 2) - 1; 
		} else if( (step * step) + step  >= z) {
			return step * 2;
		}
		
		return (step * 2) + 1;
	}
}
