package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class P12015 {

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A, N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(Integer.parseInt(st.nextToken()));
		for (int n = 1; n < N; n++) {
			A = Integer.parseInt(st.nextToken());
			if (A <= ts.last()) {
				ts.remove(ts.ceiling(A));
			}
			ts.add(A);
		}
		System.out.print(N - ts.size());
	}

}
