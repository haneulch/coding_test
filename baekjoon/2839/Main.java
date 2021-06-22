import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println(getKilos(n));
	}
	
	public static int getKilos(int n) {
		
		int t = n/5;
		if( n % 5 == 0) {
			return t;
		}
		
		if(t == 0) {
			if(n % 3 == 0) {
				return n / 3;
			} else {
				return -1;
			}
		}
		
		for(int i = t; i >= 0; i--) {
			int temp = (n - (5 * i));
			if( temp % 3 == 0) {
				return i + (temp / 3);
			}
		}
		
		return -1;
	}
}
