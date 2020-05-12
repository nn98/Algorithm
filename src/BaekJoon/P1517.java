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
		a=s.nextLine().split(" ");
		for(;i<n;i++) {
			for(j=i+1;j<n;j++)
				if(a[j].compareTo(a[j-1])<0)o(j,j-1);
		}
		System.out.println(Arrays.toString(a));
		System.out.println(r);
	}

}
