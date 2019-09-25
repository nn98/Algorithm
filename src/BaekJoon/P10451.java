package BaekJoon;

import java.util.Scanner;

public class P10451 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int t=0,n=s.nextInt();
		for(int i=0;i<n;i++) {
			t=0;
			int m=s.nextInt(),a=0,arr[]=new int[m],brr[]=new int[m];
			for(int j=0;j<m;j++) arr[j]=s.nextInt()-1;
			for(int j=0;j<m;j++) {
				if(brr[j]==0) {
					for(int k=arr[j];;k=arr[k]) {
//						System.out.println(k);
						brr[k]=1;
						if(k==j) {
//							System.out.println("+ "+k);
							t++;
							break;
						}
						if(a==m) break;
						a++;
					}
				}
			}
			System.out.println(t);
		}
	}
}
