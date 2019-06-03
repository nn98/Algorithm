package BaekJoon;

import java.util.Scanner;

public class P2851 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int[] arr=new int[10];
		for(int i=0;i<10;i++) {
			arr[i]=s.nextInt();
		}
		int b=arr[0],a=arr[0]+arr[1];
		for(int i=2;i<10;i++) {
			if(a>=100) break;
			b=a;
			a+=arr[i];
		}
		int r1=Math.abs(100-b),r2=Math.abs(100-a);
		int r;
		if(r1==r2) r=a;
		else
			r=r1<r2?b:a;
		System.out.println(r);
	}
}