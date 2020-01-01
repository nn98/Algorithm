package BaekJoon;

import java.util.Scanner;

public class P16953 {

	static int f,t,r=-1;
	static void o(String x,int c) {
		int X=Integer.parseInt(x);
		if(X==t)
			r=r==-1?c:r<c?r:c;
		if(X>t)
			return;
		o(""+X*2,c+1);
		o(x+"1",c+1);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		f=s.nextInt();
		t=s.nextInt();
		o(""+f,0);
		System.out.print(r);
	}

}
