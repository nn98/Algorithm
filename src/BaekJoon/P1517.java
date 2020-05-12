package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P1517 {

	static String[]a;
	static int r;
	static void o(int x,int y) {
		r++;
		String z=a[x];
		a[x]=a[y];
		a[y]=z;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i=0,j;
		s.nextLine();
		a=s.nextLine().split(" ");
		for(;i++<n;) {
			for(j=0;j<n-i;j++)
				if(a[j+1].compareTo(a[j])<0)o(j+1,j);
		}
		System.out.println(Arrays.toString(a));
		System.out.println(r);
	}

}
