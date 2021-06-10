import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		
		int[] time = new int[]{3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,8,8,8,8,9,9,9,10,10,10,10};
		
		int result = 0;
		for(int i = 0; i < a.length(); i++) {
			result +=  time[a.charAt(i)-'A'];
		}
		
		System.out.println(result);
	}
}
