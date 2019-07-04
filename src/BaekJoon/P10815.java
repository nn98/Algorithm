package BaekJoon;

import java.util.Scanner;

public class P10815 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		boolean b=false;
		String r="";
		int n=s.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) arr[i]=s.nextInt();
		int m=s.nextInt();
		for(int i=0;i<m;i++) {
			b=false;
			int a=s.nextInt();
			for(int j=0;j<arr.length;j++) {
				if(arr[j]==a) {
					r+="1 ";
					b=true;
					break;
				}
			}
			if(!b) r+="0 ";
		}
		System.out.println(r.substring(0,r.length()-1));
	}
}