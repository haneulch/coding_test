import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		
		String[] cros = new String[] {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		int count = 0;
		for(String s : cros) {
			while(a.contains(s)) {
				a = a.replaceFirst(s, "^");
				count ++;
			}
		}
		
		count += a.replaceAll("\\^", "").length();
		System.out.println(count);
	}
}
