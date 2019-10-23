package BaekJoon;

import java.util.Scanner;
public class P11722 {
	//¿øÆ®
	static int n,a[],h[],r=0;
	static void o(int x,int u) {
		if(h[x]>u)
			return;
		h[x]=u;
		for(int i=x+1;i<n;i++) {
			if(a[i]<a[x])
				if(h[i]<=u)
					o(i,u+1);
		}
		r=r>u?r:u;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		a=new int[n];
		h=new int[n];
		for(int i=0;i<n;i++)a[i]=s.nextInt();
		for(int i=0;i<n;i++)o(i,0);
//		System.out.println(Arrays.toString(h));
		System.out.print(r+1);
	}

}
