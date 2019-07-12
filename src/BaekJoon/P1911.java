package BaekJoon;

import java.util.Scanner;

public class P1911 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(),L=s.nextInt(),arr[]=new int[N*2],t=0;
		for(int i=0;i<N;i++) {
			int a=s.nextInt(),b=s.nextInt();
			arr[i*2]=a;
			arr[i*2+1]=b;
			t+=Math.abs(a-b);
			for(int j=0;j<i;j++) {
				if(Math.abs(arr[j*2]-a)<2) {
					System.out.println(a);
					t-=2-Math.abs(arr[j*2]-a);
				}
				if(Math.abs(arr[j*2+1]-a)<2) {
					System.out.println(a);
					t-=2-Math.abs(arr[j*2+1]-a);
				}
				if(Math.abs(arr[j*2]-b)<2) {
					System.out.println(b);
					System.out.println(t);
					t-=2-Math.abs(arr[j*2]-b);
					System.out.println(t);
				}
				if(Math.abs(arr[j*2+1]-b)<2) {
					System.out.println(b);
					t-=2-Math.abs(arr[j*2+1]-b);
				}
			}
		}
		int r=t/L+(t%L==0?0:1);
		System.out.println(r);
	}

}
