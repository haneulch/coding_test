import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int result = getResult(n);
		
		System.out.println(result == n ? 0 : result);
	}
	
	private static int getResult(int n) {
		
		int len = (n + "").length();
		
		int min = n - (9 * len);
		
		while(min < n) {
			int sum = min;
			int temp = min;
			
			while(temp > 10) {
				sum += temp % 10;
				temp /= 10;
			}
			
			if(sum + temp == n) {
				break;
			}

			min ++;
		}
		
		return min;
	}
}
