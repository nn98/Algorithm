package _Algorithm.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P1766_3 {

	static int n,m,i,j,d[];
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt()+1;
		m=s.nextInt();
		List<List>l=new ArrayList();
		d=new int[n];
		for(;i++<n;l.add(new ArrayList()));
		for(;m-->0;) {
			l.get(s.nextInt()).add((i=s.nextInt()));
			d[i]++;
		}
		System.out.println(Arrays.toString(d));
		for(List a:l)System.out.println(a);
	}

}
