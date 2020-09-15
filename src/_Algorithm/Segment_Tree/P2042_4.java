package _Algorithm.Segment_Tree;

import java.util.Arrays;
import java.util.Scanner;

public class P2042_4 {

	static int n,m,i,j,t[];
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		m=s.nextInt();
		m+=s.nextInt();
		for(i=1;i<n;i*=2);
		t=new int[i*2];
		for(;j<n;t[i+j++]=s.nextInt());
		System.out.println(Arrays.toString(t));
	}

}
