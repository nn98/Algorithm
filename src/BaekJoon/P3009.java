package BaekJoon;

import java.util.Scanner;

public class P3009 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		boolean[]a=new boolean[1001],b=new boolean[1001];
		int i=0,j,k;
		for(;i++<3;) {
			j=s.nextInt();
			if(a[j])a[j]=false;
			else a[j]=true;
			j=s.nextInt();
			if(a[j])b[j]=false;
			else b[j]=true;
		}
		for(i=0;++i<1002;);
	}

}
