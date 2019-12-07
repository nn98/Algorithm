package BaekJoon;

import java.util.Arrays;

public class P1541 {

	public static void main(String[] args) {
		String[]n=new java.util.Scanner(System.in).next().split("-"),m;
		System.out.println(Arrays.toString(n));
		int i=0,j,r;
		for(String s:n) {
			if(s.contains("+")) {
				System.out.println(s);
				m=s.split("\\+");
				j=0;
				for(String t:m)
					j+=Integer.parseInt(t);
				n[i]=""+j;
			}
			i++;
		}
		r=Integer.parseInt(n[0]);
		for(i=1;i<n.length;)
			r-=Integer.parseInt(n[i++]);
		System.out.print(r);
	}

}
