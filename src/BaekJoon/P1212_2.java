package BaekJoon;

import java.util.Scanner;

public class P1212_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		long n=s.nextLong();
		if(n==0) {
			System.out.println(n);
			return;
		}
		String in="",r="";
		for(long i=1;i<=n;i*=10) {
			in+=n%(i*10)/i;
		}
		String[] arr=in.split("");
		for(int i=arr.length-1;i>=0;i--) {
			int m=Integer.parseInt(arr[i]);
			int[] brr=new int[3];
 			brr[0]=m/4;
			brr[1]=m%4/2;
			brr[2]=m%2/1;
			for(int j=0;j<brr.length;j++) {
				if(r.length()==0) 
					if(brr[j]==0)
						continue;
				r+=brr[j];
			}
		}
		System.out.println(r);
	}
}