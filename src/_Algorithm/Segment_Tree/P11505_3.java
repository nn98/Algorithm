package _Algorithm.Segment_Tree;

import java.util.Arrays;
import java.util.Scanner;

public class P11505_3 {

	static int n,m,i,j,x;
	static long t[],M=1000000007;
	static void o() {
		for(;x>1;x/=2,t[x]=t[x*2]*t[x*2+1]%M);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		m=s.nextInt()+s.nextInt();
		for(i=1;i<n;i*=2);
		j=i;
		i*=2;
		t=new long[i];
		for(;j<i;x=j++,t[x]=s.nextInt(),o());
		System.out.println(Arrays.toString(t));
	}

}
