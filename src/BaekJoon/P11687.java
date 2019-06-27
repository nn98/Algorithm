package BaekJoon;

import java.util.Scanner;

public class P11687 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int N=(int)Math.pow(10, s.nextInt()),r=1,c=-1;
		for(int i=2;;i++) {
			r*=i;
			System.out.println(r);
			if(r%N==0) {
				c=i;
				break;
			}
		}
		System.out.println(c);
	}

}
