package BaekJoon;

import java.util.Scanner;

public class P2576 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int c=-1,max=0;
		for(int i=0;i<7;i++) {
			int a=s.nextInt();
			if(a%2==1) {
				if(c==-1) c=0;
				c+=a;
				if(max==0) max=a;
				else max=max<a?max:a;
			}
		}
		if(c==-1) {
			System.out.println(-1);
		} else {
			System.out.println(c);
			System.out.println(max);
		}
	}

}
