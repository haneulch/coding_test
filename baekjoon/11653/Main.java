import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		List<Integer> numbers = getNumbers(n);
		
		numbers.forEach(System.out::println);
	}

	private static List<Integer> getNumbers(int n) {
		List<Integer> numbers = new ArrayList<Integer>();
		
		for(int i = 2; i <= Math.sqrt(n); i ++) {
			while(n % i == 0) {
				n /= i;
				numbers.add(i);
			}
		}
		
		if(n != 1) {
			numbers.add(n);
		}
		
		return numbers;
	}
}
