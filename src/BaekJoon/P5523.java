package BaekJoon;

import java.util.Scanner;

public class P5523 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),w1=0,w2=0;
		for(int i=0;i<n;i++) {
			int a=s.nextInt(),b=s.nextInt();
			if(a>b) w1++;
			else if(a<b) w2++;
		}
		System.out.println(w1+" "+w2);
	}

}
