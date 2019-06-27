package BaekJoon;

import java.util.Scanner;

public class P1748 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int m=s.nextInt();
		String t=""+m;
		String[] n=t.split("");
		int r=0,c=n.length,k=1;
		if(c<1) r=Integer.parseInt(t);
		else {
//			System.out.println(r);
			for(int i=1;i<c;i++) r+=9*i*(i>1?Math.pow(10, i-1):1);
//			System.out.println(r);
			m-=(int) Math.pow(10, t.length()-1)-1;
//			System.out.println(m+" "+c);
			r+=c*m;
		}
		//		r+=N%10+(N%100*2)+(N%1000*3)+(N%10000*4)+(N%100000*5)+(N%1000000*6)+(N%10000000*7)+(N%100000000*8);
		//		9 180 2700 36000  
		//		for(int j=0;j<)
		System.out.println(r);
	}
}
