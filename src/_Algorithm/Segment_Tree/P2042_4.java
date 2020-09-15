package _Algorithm.Segment_Tree;

import java.util.Arrays;
import java.util.Scanner;

public class P2042_4 {

	static int n,m,i,j,t[],k;
	static void o() {
		while(j>1)t[j/=2]=t[j*2]+t[j*2+1];
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		m=s.nextInt();
		m+=s.nextInt();
		for(i=1;i<n;i*=2);
		t=new int[i*2];
		for(;j<n;t[i+j++]=s.nextInt());
		System.out.println(Arrays.toString(t));
		for(;k<n;j=i+k++,o());
		System.out.println(Arrays.toString(t));
	}

}
