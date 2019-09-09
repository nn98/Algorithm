package BaekJoon;

import java.util.Scanner;

public class P1874_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String r="";
		int N=s.nextInt(),a=0,b=0,input=1;
		int[] arr=new int[N],brr=new int[N+1];
		for(int i=0;i<N;i++) {
			arr[i]=s.nextInt();
		}
		boolean f=true;
		for(;a<N;) {
//			System.out.printf("a : %d b : %d input : %d\n",a,b,input);
			if(input==1) {
				r+="+\n";
				brr[b]=input++;
			}
			else if(arr[a]==brr[b]) {
				r+="-\n";
				a++;
				if(b!=0)
					b--;
			}
			else {
				r+="+\n";
				if(b+1==N) {
					r="NO";
					break;
				}
				else 
					brr[++b]=input++;
			}
		}
		System.out.print(r);
	}
}