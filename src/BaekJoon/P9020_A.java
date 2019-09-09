package BaekJoon;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P9020_A {
	//다른거에 제출한다고 헛짓중
	static List<Integer> primeNumbers = getPrimeNumbers(10000);
	static BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	static List<Integer> getPrimeNumbers(int n) {
		boolean[] prime = new boolean[n + 1];
		Arrays.fill(prime, true);
		prime[0] = false;
		prime[1] = false;
		for(int i = 2; (i * i) <= n; ++i)
			if (prime[i]) {
				for(int j = i * 2; j <= n; j += i)
					prime[j] = false;
			}
		ArrayList<Integer> result = new ArrayList<>();
		for (int i = 2; i <= n; ++i)
			if (prime[i]) result.add(i);
		return result;
	}
	static void sol(int i) throws IOException {
		int j=Collections.binarySearch(primeNumbers, i/2);
//				System.out.println(j);
		int a=j<0?-j-1:j;
//				System.out.println(a);
		for(int k=a;k>=0;k--) {
			int b=primeNumbers.get(k),c=i-b;
//			System.out.println("a: "+a+" b: "+b+" c: "+c);
			if(primeNumbers.contains(c)) {
				String r=b<c?b+" "+c+"\n":c+" "+b+"\n";
				bw.write(r);
				return;
			}
		}
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++) {
			sol(s.nextInt());
		}
		bw.flush();
	}
}