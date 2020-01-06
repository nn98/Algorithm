package BaekJoon;

import java.io.*;
import java.util.*;
public class P12015 {
	public static void main(String[]z)throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int A, N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		TreeSet<Integer>ts = new TreeSet<>();
		ts.add(Integer.parseInt(st.nextToken()));
		for (int n = 1; n < N; n++){
			A = Integer.parseInt(st.nextToken());
			if (A <= ts.last())ts.remove(ts.ceiling(A));
			ts.add(A);
		}
//		System.out.println(ts.toString());
		System.out.print(ts.size());
	}
}