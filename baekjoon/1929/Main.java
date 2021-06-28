import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(getNumbers(m, n));
		bw.flush();
		bw.close();
	}

	private static String getNumbers(int m, int n) {
		StringBuilder sb = new StringBuilder();
		
		boolean[] temp = new boolean[n + 1];
		
		for(int i = 2; i <= n; i++) {
			for(int j = 2; i * j <= n; j++) {
				temp[i * j] = true;
			}
		}
		
		for(int i = m; i <= n; i ++) {
			if(!temp[i] && i > 1) {
				sb.append(i + "\n");
			}
		}
		
		return sb.toString();
	}
}
