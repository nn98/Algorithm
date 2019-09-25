package BaekJoon;

import java.util.Scanner;

public class P8892 {

	static boolean sol(String[] in) {
		for(int i=0;i<in.length/2;i++) {
			if(in[i].equals(in[in.length-(i+1)])) continue;
			else return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++) {
			boolean c=false;
			int m=s.nextInt();
			s.nextLine();
			String[] arr=new String[m];
			for(int j=0;j<m;j++) arr[j]=s.nextLine();
			for(int j=0;j<m-1;j++) {
				if(c) break;
				for(int k=j+1;k<m;k++) {
					String t1=arr[j]+arr[k];
					String t2=arr[k]+arr[j];
					String[] brr=t1.split("");
					c=sol(brr);
					if(c) {
						System.out.println(t1);
						break;
					}
					brr=t2.split("");
					c=sol(brr);
					if(c) {
						System.out.println(t2);
						break;
					}
				}
			}
			if(!c) System.out.println(0);
		}
	}
}
