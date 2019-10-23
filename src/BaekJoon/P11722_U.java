package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P11722_U {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = Arrays.stream(new int[N]).map(i->sc.nextInt()).toArray(), dp = new int[N];

		for(int i=0; i<N; i++)
			for(int j=i-1; j>=0; j--)
				if(a[i]<a[j] && dp[j]+1>dp[i])
					dp[i]=dp[j]+1;

		System.out.println(Arrays.stream(dp).max().getAsInt()+1);
	}
}