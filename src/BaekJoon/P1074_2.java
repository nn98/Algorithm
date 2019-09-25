package BaekJoon;

import java.util.Scanner;

public class P1074_2 {
	
	static Scanner s=new Scanner(System.in);
	static int sum=0;
	static boolean comp=false;
	
	static void sol(int s,int r,int c) {
		//System.out.println("S :"+s+" r :"+r+" c: "+c+" Comp :"+comp);
		if(comp) return;
		if(s<r||s<c) {
			sum+=s*s;
		}
		else if(s==1) {
			sum++;
			if(r==0&&c==0) comp=true;
		}
		else {
			sol(s/2,r,c);
			sol(s/2,r,c-s/2);
			sol(s/2,r-s/2,c);
			sol(s/2,r-s/2,c-s/2);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=(int)Math.pow(2,s.nextInt()),r=s.nextInt(),c=s.nextInt();
		sol(N,r,c);
		System.out.println(--sum);
	}
}
