package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P2156 {
	
	static int[] arr,history;
	
	static int sol(int index,int sum,int count) {
		if(index==arr.length-1) {
			history[index]=sum;
			return history[index];
		}
//		if(index==arr.length-2) {
//			history[index]=count==2?sum:sum+arr[index+1];
//		}
		if(count==2) {
			if(history[index+1]==0) history[index]=sol(index+1,sum,0);
			else history[index]=history[index+1]+arr[index];
		}
		else {
			int a=history[index+1]==0?sol(index+1,sum+arr[index],count+1):history[index+1]+arr[index]
					,b=history[index+1]==0?sol(index+1,sum+arr[index],count+1):history[index+1];
			history[index]=Math.max(a, b);
		}
		return history[index];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),max=0;
		arr=new int[n];
		history=new int[n];
		for(int i=0;i<n;i++) arr[i]=s.nextInt();
		sol(0,0,0);
		System.out.println(Arrays.toString(history));
		for(int i:history) max=max>i?max:i;
		System.out.println(max);
	}
}
