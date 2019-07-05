package BaekJoon;

import java.util.Scanner;

public class P1149 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int his=-1;
		for(int i=0;i<N;i++) {
			int r=s.nextInt(),g=s.nextInt(),b=s.nextInt();
			his=(r<=g?r:g)<=b?(r<=g?0:1):2;
			System.out.println(his);
		}
	}

}
