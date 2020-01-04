package BaekJoon;

import java.util.Scanner;

public class P11931 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		boolean[]a=new boolean[2000001];
		int i=s.nextInt();
		for(;i-->0;)a[s.nextInt()+1000000]=true;
		for(i=2000000;i>=0;i--)
			if(a[i])
				System.out.println(i-1000000);
	}
}