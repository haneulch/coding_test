import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = "";
		while(!(s = br.readLine()).equals("0")) {
			int n = Integer.parseInt(s);
			bw.write(String.format("%d\n", getNumbers(n)));
		}
		
		bw.flush();
		bw.close();
	}

	private static int getNumbers(int n) {
		int m = 2 * n;

		int[] temp = new int[n + 1];
		
		for(int i = 2; i <= m; i++) {
			for(int j = 2; i * j <= m; j++) {
				if( i * j <= m && i * j > n) {
					temp[(i * j) - n] = 1;
				}
			}
		}
		
		return (int)Arrays.stream(temp).filter(v -> v == 0).count() - 1;
	}
}
