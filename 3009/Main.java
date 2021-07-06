import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Map<String, Integer> m = new HashMap<String, Integer>();
		
		for(int i = 0; i < 3; i ++) {
			String s = br.readLine();
			String[] xy = s.split(" ");
			
			m.compute(xy[0] + "_x", (k, v) -> v == null ? 1 : v + 1);
			m.compute(xy[1] + "_y", (k, v) -> v == null ? 1 : v + 1);
		}
		
		String x = "";
		String y = "";
		
		for(String s : m.keySet()) {
			if(m.get(s) == 1) {
				if(s.contains("x")) {
					x = s.split("_")[0];
				}
				
				if(s.contains("y")) {
					y = s.split("_")[0];
				}
			}
		}
		
		bw.write(String.format("%s %s", x, y));
		bw.flush();
		bw.close();
	}
}
