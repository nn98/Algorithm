package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;
//개노가다
public class P1911_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(),L=s.nextInt(),arr[]=new int[N*2],t=0,c=0,r=0;
		for(int i=0;i<N;i++) {
			int a=s.nextInt(),b=s.nextInt();
			arr[i*2]=a;
			arr[i*2+1]=b;
		}
		Arrays.sort(arr);
		for(int i=0;i<arr.length-1;i++) {
			if(i%2==0) {
				int a=arr[i+1]-arr[i];
//				System.out.println("c: "+c+" a: "+a);
				if(c!=0) {
					if(a-c<=0) {
						c=Math.abs(a-c);
						a=0;
					}
					a-=c;
				}
				if(a<=0) continue;
				int b=a/L;
				if(a%L==0)
					t+=b;
				else 
					t+=++b;
//				System.out.println("t+"+b);
				c=b*L-a;
			}
			else {
				if(arr[i+1]-arr[i]<(L-1)) c-=arr[i+1]-arr[i];
				else c=0;
			}
		}
		System.out.println(t);
	}
}
