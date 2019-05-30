package BaekJoon;

import java.util.Scanner;

public class P1748 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String[] n=s.next().split("");
		int r=0,c=n.length;
		if(c<1) {
			for(int i=1;i<=Integer.parseInt(n[n.length-1]);i++) r++;
		}
		else {
			for(int i=c-1;i>1;i--) r+=9*Math.pow(10, i-1);
			for(int i=1;i<=Integer.parseInt(n[n.length-1]);i++) r++;
		}
		//		r+=N%10+(N%100*2)+(N%1000*3)+(N%10000*4)+(N%100000*5)+(N%1000000*6)+(N%10000000*7)+(N%100000000*8);
		//		9 180 2700 36000  
		//		for(int j=0;j<)
		System.out.println(r);
	}

}
