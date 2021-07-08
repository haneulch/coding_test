import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		int[][] result = new int[n][n];
		
		getResult(result, 0, 0, n);
		
		for(int[] temp : result) {
			for(int i : temp) {
				bw.write(i == 1 ? "*" : " ");
			}
			bw.write("\n");
		}
		
		bw.flush();
		bw.close();
	}
	
	private static boolean getResult(int[][] result, int i, int j, int n) {
		if(n == 1) {
			result[i][j] = 1;
			return false; 
		}
		
		for(int x = 0; x < 3; x ++) {
			for(int y = 0; y < 3; y++) {
				if(!(x == 1 && y == 1)) {
					getResult(result, i + x * (n / 3), j + y * (n / 3), n / 3);
				}
			}
		}
		
		return true;
	}
}
