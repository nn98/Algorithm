package BaekJoon;

import java.util.Scanner;

public class P4948 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		while(true) {
			int n=s.nextInt(),r=0;
			if(n==0) break;
			int n2=n*2;
			for(int i=n+1;i<=n2;i++) if(i%2==0||i%3==0) break;
			
		}
	}

}
