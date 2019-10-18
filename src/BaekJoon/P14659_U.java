package BaekJoon;

import java.util.Scanner;

public class P14659_U {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),v=0,c=0,m=0,i=0;
		for(;i<n;i++){
			if(i<1)v=s.nextInt();
			else {
				int t=s.nextInt();
				if(t<v)c++;
				else{
					v=t;
					m=m>c?m:c;
					c=0;
				}
			}
		}
		System.out.print(m>c?m:c);
	}
}