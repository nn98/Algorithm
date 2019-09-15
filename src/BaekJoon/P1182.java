package BaekJoon;

import java.util.Scanner;

public class P1182 {
	
	//ㅅㅂ 채점 중 50%대에서 틀렸습니다

	static int t,r=0,arr[];
	
	static void sol(int start) {
		int sum=arr[start];
		for(int i=start+1;i<arr.length;i++) {
			sum+=arr[i];
			if(sum==t) {
				r++;
				return;
			}
			if(sum>t) {
//				System.out.println(start+" "+sum);
				return;
			}
		}
//		System.out.println(start);
	}
	
	static void sol2(int start) {
		int sum=arr[start];
		for(int i=start+1;i<arr.length;i++) {
			sum+=arr[i];
			if(sum==t) {
				r++;
				return;
			}
			if(sum<t) {
//				System.out.println(start+" "+sum);
				return;
			}
		}
//		System.out.println(start+" "+sum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		t=s.nextInt();
		arr=new int[n];
		for(int i=0;i<n;i++) arr[i]=s.nextInt();
		if(t<0) {
			for(int i=0;i<arr.length;i++) sol2(i);
		}
		else {
			for(int i=0;i<arr.length;i++) sol(i);
		}
		System.out.println(r);
	}

}
