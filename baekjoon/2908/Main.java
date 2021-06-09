import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		
		StringBuilder sb = new StringBuilder(a);
		int numA = Integer.parseInt(sb.reverse().toString());
		
		sb = new StringBuilder(b);
		int numB = Integer.parseInt(sb.reverse().toString());
		
		System.out.println(numA > numB ? numA : numB);
	}
}
