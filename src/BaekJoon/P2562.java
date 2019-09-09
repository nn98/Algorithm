package BaekJoon;

import java.util.Scanner;

public class P2562 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int max=0,index=0;
		for(int i=0;i<9;i++) {
			int a=s.nextInt();
			if(a>max) {
				max=a;
				index=i+1;
			}
		}
		System.out.println(max);
		System.out.println(index);
	}

}
