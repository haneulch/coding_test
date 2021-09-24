import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    
	private static int min = -1;
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		
		int[][] data = new int[x][y];
		
		for(int i = 0; i < x; i++) {
			String s = br.readLine();
			String[] line = s.split("");
			
			for(int j = 0; j < line.length; j ++) {
				data[i][j] = line[j].equals("B") ? 1 : 0;
			}
		}
		
		getResult(data, 0, 0);
		
		System.out.println(min);
	}
	
	private static void getResult(int[][] data, int x, int y) {
		
		if(x + 7 >= data.length) {
			getResult(data, 0, y + 1);
			return;
		}
		
		if(y + 7 >= data[0].length) {
			return;
		}
		
		if(x + 7 < data.length) {
			getResult(data, x + 1, y);
		}
		
		int cnt1 = 0;
		int cnt2 = 0;
		
		for(int i = x; i < x + 8; i ++) {
			for(int j = y; j < y + 8; j ++) {
				
				if((i + j) % 2 == data[i][j]) {
					cnt1 ++;
				}
				
				if((i + j + 1) % 2 == data[i][j]) {
					cnt2 ++;
				}
			}
		}
		
		int result = cnt1 > cnt2 ? 64 - cnt1 : 64 - cnt2;
		if(min == -1
				|| result < min) { 
			min = result;
		}
	}
}
