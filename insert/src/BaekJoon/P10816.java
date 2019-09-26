package BaekJoon;

import java.util.Scanner;

public class P10816 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),arr[]=new int[20000001];
		for(int i=0;i<n;i++) arr[s.nextInt()+10000000]++;
		int m=s.nextInt();
		for(int i=0;i<m;i++) {
			System.out.print(arr[s.nextInt()+10000000]+" ");
		}
	}

}
