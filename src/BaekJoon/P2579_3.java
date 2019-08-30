package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P2579_3 {

	static int max=0,arr[],history[];

	static int sol(int i,int c) {
//		if(i>=arr.length) return 0;
		int r=0,a=0,b=0;
//		System.out.println(i+" "+c+" "+arr[i]);
//		if(c==2) {
//			if(i+2<arr.length)
//				if(history[i+2]==0)
//					r=sol(i+2,0);
//				else
//					r=history[i+2];
//		}
		if(i==arr.length-1) r=0;
		else if(c==1) {
			if(i+2<arr.length)
				if(history[i+2]==0)
					r=sol(i+2,0);
				else
					r=history[i+2];
		}
		else {
			if(i+1<arr.length)
				if(history[i+1]==0)
					a=sol(i+1,c+1);
				else
					a=history[i+1];
			if(i+2<arr.length)
				if(history[i+2]==0)
					b=sol(i+2,0);
				else
					b=history[i+2];
			r=a>b?a:b;
		}
		history[i]=r+arr[i];
		max=max>history[i]?max:history[i];
		System.out.println(history[i]+" "+arr[i]+" "+c);
		return history[i];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		arr=new int[n];
		history=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		for(int i=n-1;i>=0;i--) 
			sol(i,0);
		System.out.println(max);
		System.out.println(Arrays.toString(history));
	}
}
