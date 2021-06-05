import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		for(int i = 0; i < n; i++) {
			StringBuilder sb = new StringBuilder();
			int r = sc.nextInt();
			String s = sc.next();
			
			Arrays.stream(s.split("")).forEach(v -> sb.append(v.repeat(r)));
			
			System.out.println(sb.toString());
		}
	}
}
