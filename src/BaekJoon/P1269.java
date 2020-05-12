package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P1269 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt(),i=0,j,r=0,v=0,c[]=new int[100000000];
		s.nextLine();
		String[]a=s.nextLine().split(" "),b=s.nextLine().split(" ");
		Arrays.sort(a);
		Arrays.sort(b);
		for(;i<n;i++)
			for(j=v;j<m;j++) {
				if(a[i].equals(b[j])) {
					r-=2;
					v=j+1;
				}
				if(a[i].compareTo(b[j])<0)break;
			}
		System.out.print(n+m+r);
	}

}
