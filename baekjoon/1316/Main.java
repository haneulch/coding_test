import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int count = 0;
		for(int i = 0; i < n; i++) {
			String s = sc.next();
			
			Set<Character> alphas = new HashSet<Character>();
			
			count ++;
			for(int j = 0; j < s.length(); j++) {
				if(j > 0 && s.charAt(j) != s.charAt(j-1)) {
					if(alphas.contains(s.charAt(j))) {
						count --;
						break;
					}
				}
				alphas.add(s.charAt(j));
			}
		}
		System.out.println(count);
	}
}
