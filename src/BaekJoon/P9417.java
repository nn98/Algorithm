package BaekJoon;

import java.util.Scanner;

public class P9417 {

	static int G(int a,int b) {
		return b==0?a:G(b,a%b);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i,j,m,r,t;
		s.nextLine();
		for(;n-->0;) {
			String[]a=s.nextLine().split(" ");
			r=0;
			m=a.length;
			for(i=0;i<m;i++)
				for(j=i+1;j<m;j++) {
					t=G(Integer.parseInt(a[i]),Integer.parseInt(a[j]));
					r=r>t?r:t;
				}
			System.out.println(r);
		}
	}

}
