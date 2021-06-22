import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String b = sc.next();
		
		List<Integer> result = new ArrayList<Integer>();
		
		for(int i = a.length() - 1; i >= 0; i--) {
			result.add(a.charAt(i) - '0');
		}
		
		int d = 0;
		for(int i = b.length() - 1; i >= 0; i--) {
			getSum(result, b.charAt(i) - '0', d);
			d ++;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = result.size() - 1; i >= 0; i --) {
			sb.append(result.get(i));
		}
		System.out.println(sb.toString());
	}
	
	public static void getSum(List<Integer> result, int b, int d) {
		if(d < result.size()) {
			int temp = result.get(d) + b;
			result.set(d, temp%10);
			
			if( temp >= 10) {
				setNumber(result, d);
			}
		} else {
			result.add(b);
		}
	}
	
	public static void setNumber(List<Integer> result, int d) {
		if(d + 1 == result.size()) {
			result.add(0);
		}
		int n = result.get(d + 1) + 1;
		if(n >= 10) {
			result.set(d + 1, n % 10);
			setNumber(result, d + 1);
		} else {
			result.set(d + 1, n);
		}
	}
}
