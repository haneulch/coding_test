import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
        
		int x = ((v - a) / (a - b));
		int y = ((v - a) % (a - b));
        
		System.out.println(x + 1 + (y > 0 ? 1 : 0));
	}
}
