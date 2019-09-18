package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P11724 {

	static int arr[][];
	static boolean c[];

	static void sol(int t) {
		for(int i=0;i<arr[t].length;i++) {
			if(arr[t][i]!=0) {
				c[t]=true;
				if(c[i]) continue;
				else sol(i);
				c[i]=true;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt(),r=0;
		arr=new int[n][n];
		c=new boolean[n];
		for(int i=0;i<m;i++) {
			arr[s.nextInt()-1][s.nextInt()-1]++;
		}
		for(int i=0;i<n;i++) {
			if(c[i]) continue;
			else {
				r++;
				sol(i);
			}
		}
		System.out.println(Arrays.toString(c));
		System.out.println(r);
	}

}
