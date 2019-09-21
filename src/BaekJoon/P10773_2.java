package BaekJoon;

import java.util.Scanner;

public class P10773_2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),index=0,sum=0,arr[]=new int[n+1];
		for(int i=0;i<n;i++) {
			int in=s.nextInt();
			if(in==0) arr[index--]=0;
			else arr[++index]=in;
		}
		for(int i:arr) sum+=i;
		System.out.print(sum);
	}
}