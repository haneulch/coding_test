import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		List<Integer> numbers = new ArrayList<Integer>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < t; i++) {
			numbers.add(Integer.parseInt(st.nextToken()));
		}
		
		System.out.println(getCount(numbers));
	}
	
	public static int getCount(List<Integer> numbers) {
		int count = 0;
		
		for(int i : numbers) {
			
			if(i == 1) {
				continue;
			}
			
			int z = (int) Math.sqrt(i);
			
			count ++;
			
			if( z != 1) {
				for(int j = 2; j <= z; j ++) {
					if(i != j) {
						if(i % j == 0) {
							count --;
							break;
						}
					}
				}
			}
		}
		return count;
	}
}
