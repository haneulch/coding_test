import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		s = s.trim();
		
		System.out.println(count(s));
	}
	
	private static int count(String s) {
		if(s.length() == 0) {
			return 0;
		}
		
		int count = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 32) {
				count ++;
			}
		}
		
		return count + 1;
	}
}
