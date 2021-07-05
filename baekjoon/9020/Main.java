import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] temp = new int[10001];
		
		for(int i = 2; i <= 5000; i++) {
			for(int j = 2; i * j <= 10000; j++) {
				temp[(i * j) - 2] = 1;
			}
		}
		
		for(int i = 0; i < n; i++) {
			int m = Integer.parseInt(br.readLine());
			
			bw.write(String.format("%s\n", getNumbers(m, temp)));
		}
		
		bw.flush();
		bw.close();
	}

	private static String getNumbers(int n, int[] temp) {
		
		for(int i = n/2; i > 1; i --) {
			for(int j = n-i; i + j <= n && j > 1; j --) {
				if(temp[i-2] == 0 && temp[j-2] == 0) {
					if(i + j == n) {
						return String.format("%d %d", i, j);
					}
				}
			}
		}
		
		return "";
	}
}
