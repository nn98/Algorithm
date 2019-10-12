package BaekJoon;

import java.util.*;
class P11051 {
	public static void main(String[]Z) {
		Scanner S = new Scanner(System.in);
		int N = S.nextInt(), K = S.nextInt(), a = 1, b = 1, i = 0;
		for(; i < K;b *= i)a *= N-i++;
		System.out.print(a/b);
	}
}