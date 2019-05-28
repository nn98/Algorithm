package BaekJoon;

import java.util.Scanner;

public class P1748 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(),r=0,i;
//		r+=N%10+(N%100*2)+(N%1000*3)+(N%10000*4)+(N%100000*5)+(N%1000000*6)+(N%10000000*7)+(N%100000000*8);
		for(i=100000000;N/i>0;i/=10);
//		9 180 2700 36000
//		for(int j=0;j<)
		System.out.println(r);
	}

}
