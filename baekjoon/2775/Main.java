import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i = 0; i < t; i++) {
			int k = sc.nextInt();
			int n = sc.nextInt();
			
			System.out.println(getCount(k, n));
		}
	}
	
	public static int getCount(int k, int n) {
		if(n == 1) {
			return n;
		}
		
		int[][] temp = new int[k + 1][14];
		
		for(int i = 0; i < temp.length; i ++) {
			for(int j = 1; j <= temp[i].length; j ++) {
				if(i == 0) {
					temp[i][j - 1] = j;
				} else {
					if( j == 1) {
						temp[i][j - 1] = 1;
					} else if( j > 1) {
						temp[i][j - 1] = temp[i-1][j - 1] + temp[i][j - 2];
					}
				}
			}
		}
		
		return temp[k][n - 1];
	}
}
