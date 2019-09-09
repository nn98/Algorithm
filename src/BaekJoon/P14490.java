package BaekJoon;

import java.util.Scanner;

public class P14490 {
	
	static int GCF(int a,int b) {
		while(b!=0) {
			int t=a%b;
			a=b;
			b=t;
		}
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String[] arr=s.next().split(":");
		int a=Integer.parseInt(arr[0]),b=Integer.parseInt(arr[1]),c=GCF(a,b);
		System.out.println(a/c+":"+b/c);
	}

}
