package _Algorithm.Two_Pointer;

import java.util.Scanner;

public class P17609 {
	
	static int n,x,y,c,r,i;
	static StringBuffer f,t;
	static int o(int X) {
		if(X>1)return c;
		int i=0;
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
			c++;
			X++;
			t=f;
			f=f.deleteCharAt(x);
			o(X);
			if(c<2)return c;
			c--;
			f=t.deleteCharAt(y);
			o(X);
		}
		return c;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(;i++<n;) {
			f=new StringBuffer(s.next());
			c=0;
			o(0);
			System.out.println(c);
		}
	}

}
