import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] data = new int[n][2];
		
		for(int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			data[i] = new int[] {x, y};
		}
		
		for(int i = 0; i < n; i++) {
			int rank = 1;
			for(int j = 0; j < n; j ++) {
				if(data[j][0] > data[i][0]
						&& data[j][1] > data[i][1]) {
					rank ++;
				}
			}
			
			System.out.println(rank);
		}
	}
}
