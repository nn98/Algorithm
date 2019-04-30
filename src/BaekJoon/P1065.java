package BaekJoon;

import java.util.Scanner;

public class P1065 {

	static boolean sol(int i) {
		int a=i/1000,b=(i%1000)/100,c=(i%100)/10,d=i%10;
		//System.out.println(""+a+b+c+d);
		int e,f,g;
		if(a!=0) {
			e=a-b;
			f=b-c;
			g=c-d;
		} else if (b!= 0) {
			f=b-c;
			g=c-d;
			e=g;
		} else if (c!= 0) {
			g=c-d;
			e=g;
			f=g;
		} else {
			e=f=g=d;
		}
		//System.out.println(""+e+f+g);
		//if(e==f&&f==g) System.out.println("c");
		return (e==f)&&(f==g);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int r=0;
		for(int i=1;i<=N;i++) 
			if(sol(i)) r++;
		System.out.println(r);
	}

}
