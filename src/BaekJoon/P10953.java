package BaekJoon;

import java.util.Scanner;

public class P10953 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		for(int i=0;i<N;i++) {
			int r=0;
			String a=s.next();
			for(String j:a.split(",")) r+=Integer.parseInt(j);
			System.out.println(r);
		}
	}

}
