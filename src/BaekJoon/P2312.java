package BaekJoon;

import java.util.Scanner;

public class P2312 {

	public static void main(String[] args) {
		boolean[] arr=new boolean[100000];
		for(int i=2;i<arr.length;i++) if(!arr[i]) for(int j=i+i;j<arr.length;j+=i) arr[j]=true;
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++) {
			int t=s.nextInt();
			for(int j=2;j<arr.length;j++) {
				if(!arr[j]) {
					int c=0;
					while(t%j==0) {
						t/=j;
						c++;
					}
					if(c!=0) System.out.println(j+" "+c);
				}
				if(t==1) break;
			}
		}
	}
}