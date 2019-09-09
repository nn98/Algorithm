package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P1911_4 {

	public static void main(String[] args) {
		//Fuck
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),l=s.nextInt(),arr[]=new int[n*2],r=0,in=0;
		for(int i=0;i<n*2;i+=2) {
			arr[i]=s.nextInt();
			arr[i+1]=s.nextInt();
		}
		Arrays.sort(arr);
		for(int i=0;i<n*2;i+=2) {
			if(i+2<n*2)
				in=Math.max(in, arr[i+2]);
			int t=0;
			while(t<arr[i+1]-arr[i]) t+=l;
			r=r+t/l;
			in+=t;
		}
		System.out.println(r);
	}
}