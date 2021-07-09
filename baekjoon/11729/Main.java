import java.util.*;

public class Main {
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		sb.append(((int)(Math.pow(2, n) -1)) + "\n");
		hanoi(1, 2, 3, n);
		
		System.out.println(sb.toString());
	}
	
	private static void hanoi(int i, int j, int k, int n) {
		if(n > 0) {
			hanoi(i, k, j, n-1);
			sb.append(i + " " + k + "\n");
			hanoi(j, i, k, n-1);
		}
	}
}
