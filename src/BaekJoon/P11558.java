package BaekJoon;

import java.util.Scanner;

public class P11558 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++) {
			int N=s.nextInt(),arr[]=new int[N],count=1;
			for(int j=0;j<N;j++) arr[j]=s.nextInt();
			for(int j=0;!(arr[j]==N);j=arr[j]-1) {
//				System.out.println(j);
				if(count>N) {
					System.out.println(0);
					count=-1;
					break;
				}
				count++;
			}
			if(count>-1) System.out.println(count);
		}
	}
}
