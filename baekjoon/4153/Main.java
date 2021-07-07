import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = "";
		
		while(!(s = br.readLine()).equals("0 0 0")) {
			StringTokenizer st = new StringTokenizer(s);
			List<Integer> numbers = new ArrayList<Integer>();
			
			while(st.hasMoreTokens()) {
				numbers.add(Integer.parseInt(st.nextToken()));
			}
			
			bw.write(getResult(numbers));
		}
		
		bw.flush();
		bw.close();
	}

	private static String getResult(List<Integer> numbers) {

		numbers.sort(null);
		
		double t = Math.sqrt(Math.pow(numbers.get(0), 2) + Math.pow(numbers.get(1), 2));
		
		if( t == numbers.get(2)) {
			return "right\n";
		}
		return "wrong\n";
	}
}
