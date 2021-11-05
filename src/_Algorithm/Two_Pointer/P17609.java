package _Algorithm.Two_Pointer;

import java.util.Scanner;

public class P17609 {
	
	static int n,x,y,r,i;
	static StringBuffer f,t;
	static int o(int X) {
		System.out.println(X+" "+f);
		int i=0,a,b;
		x=0;
		y=f.length()-1;
		for(;x<y&i<1;) {
			System.out.println(x+" "+f.charAt(x)+" "+y+" "+f.charAt(y));
			if(!(f.charAt(x)==f.charAt(y)))i++;
			else {
				x++;
				y--;
			}
		}
		if(i>0) {
			System.out.println(x+" "+y);
			if(++X>1)return X;
			t=new StringBuffer(f.toString());
			f.deleteCharAt(x);
			System.out.println(1+" "+f);
			a=o(X);
			f=new StringBuffer(t.deleteCharAt(y));
			System.out.println(2+" "+f);
			b=o(X);
			return a<b?a:b;
		}
		return X;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(;i++<n;) {
			f=new StringBuffer(s.next());
			System.out.println(o(0));
		}
	}

}
