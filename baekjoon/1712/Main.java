import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println(getBEP(a, b, c));
	}
	
	private static int getBEP(int a, int b, int c) {
		if(b >= c) {
			return -1;
		}
		
		return (a / (c - b)) + 1;
	}
}
