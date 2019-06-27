package BaekJoon;

import java.util.Scanner;

public class P1977 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int sum=0,first=-1,i=s.nextInt(),n=s.nextInt();
		boolean f=true;
		for(;i<=n;i++) {
			for(int j=1;j<=100;j++) {
				if(Math.pow(j, 2)==i) {
					if(f) {
						first= (int)Math.pow(j, 2);
						f=false;
					}
					sum+=Math.pow(j, 2);
				}
			}
		}
		if(sum==0) System.out.println(first);
		else System.out.println(sum+"\n"+first);
	}

}
