package BaekJoon;

import java.util.Scanner;

public class P10773 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),sum=0,buf=0;
		for(int i=0;i<n;i++) {
			int in=s.nextInt();
			if(in==0) buf=0;
			else {
				if(buf!=0) {
					sum+=buf;
					buf=in;
				} else {
					buf=in;
				}
			}
		}
		if(buf!=0) sum+=buf;
		System.out.print(sum);
	}
}