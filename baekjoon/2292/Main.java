import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		System.out.println(getRoomCount(a));
	}
	
	private static int getRoomCount(int a) {
		if(a == 1) {
			return 1;
		}
		
		int i = 0;
		int sum = 1;
		
		while(a > sum) {
			sum = (3 * i * (i + 1)) + 1;
			i ++;
		}
		return i;
	}
}
