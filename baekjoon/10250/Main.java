import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i = 0; i < t; i ++) {
			
			int floor = sc.nextInt();
			int rooms = sc.nextInt();
			int n = sc.nextInt();
			
			System.out.println(getRoomNo(floor, rooms, n));
		}
	}
	
	private static int getRoomNo(int floor, int rooms, int n) {
		
		int i = n % floor;
		int j = n / floor;
		
		if(i == 0) {
			return (floor * 100) + j;
		}
		return (i * 100) + (j + 1);
	}
}
