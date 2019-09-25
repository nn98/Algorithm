package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P2579_4 {

	static int max=0,arr[],history[];

	static void sol(int i,int c,int add) {
		if(i==arr.length-1);
		else {
			if(c==1) {
				if(i+1<arr.length) 
					if(history[i+1]<add)
						sol(i+1,0,add);
//				if(i+1<arr.length) sol(i+1,c+1,add+arr[i]);
				if(i+2<arr.length) 
					if(history[i+2]<add+arr[i])
						sol(i+2,0,add+arr[i]);
			}
			else {
				if(i+1<arr.length) 
					if(history[i+1]<add)
						sol(i+1,0,add);
				if(i+1<arr.length) 
					if(history[i+1]<add+arr[i])
						sol(i+1,c+1,add+arr[i]);
				if(i+2<arr.length) 
					if(history[i+2]<add+arr[i])
						sol(i+2,0,add+arr[i]);
			}
		}
		history[i]=add+arr[i];
		max=max>history[i]?max:history[i];
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
		for(int i=0;i<n;i++) 
			sol(i,0,0);
		System.out.println(max);
//		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(history));
	}
}