package BaekJoon;

import java.util.Scanner;

public class P14659 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),a[]=new int[n],v,c=0,m=0;
		boolean[]b=new boolean[n];
		for(int i=0;i<n;i++)a[i]=s.nextInt();
		v=a[0];
		for(int i=1;i<n;i++) {
			if(a[i]<v) {
				c++;
			}
			else {
				m=m>c?m:c;
				v=a[i];
				c=0;
			}
		}
		m=m>c?m:c;
		System.out.print(m);
	}

}
