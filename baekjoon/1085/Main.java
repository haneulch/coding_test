import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		List<Integer> xywz = new ArrayList<Integer>();
		
		while(st.hasMoreTokens()) {
			xywz.add(Integer.parseInt(st.nextToken()));
		}
		
		bw.write(String.format("%d\n", getResult(xywz.get(0), xywz.get(1), xywz.get(2), xywz.get(3))));
		
		bw.flush();
		bw.close();
	}

	private static int getResult(int x, int y, int w, int z) {
		int xLen = x > w - x ? w - x : x;
		int yLen = y > z - y ? z - y : y;
		return xLen > yLen ? yLen : xLen;
	}
}
