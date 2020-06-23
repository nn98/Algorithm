package _Algorithm.Segment_Tree;
import java.util.*;
import java.io.*;
public class P3653_C {
	static int[] A;
	static int[] T;
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int X = in.nextInt();
		for (int t=1; t<=X; t++) {
			int N = in.nextInt();
			int M = in.nextInt();
			
			A = new int[N+1];
			T = new int[N+M+1];
			for (int i=1; i<=N; i++) {
				A[i] = N-i+1;
				update(i, 1);
			}
			for (int i=1; i<=M; i++) {
				int k = in.nextInt();
				System.out.print(N-sum(A[k]) + " ");
				update(A[k], -1);
				A[k] = N+i;
				update(A[k], 1);
			}
			System.out.println();
		}
	}
	
	static int sum(int p) {
		int res = 0;
		while (p > 0) {
			res += T[p];
			p &= p-1;
		}
		return res;
	}
	
	static void update(int p, int val) {
		while (p < T.length) {
			T[p] += val;
			p += p & (-p);
		}
	}
}