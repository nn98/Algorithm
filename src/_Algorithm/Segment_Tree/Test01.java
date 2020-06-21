package _Algorithm.Segment_Tree;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Test01 {
	static int i=1,j,n,m,t[],a[],x;
	static void o() {
		for(;x>1;x/=2,t[x]=t[x*2]+t[x*2+1]);
	}
	public static void main(String[]Z)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		n=Integer.parseInt(r.readLine());
		a=new int[n];
		for(;i<n;i*=2);
		j=i;
		t=new int[i*2];
		for(i=0;i<n;t[j+i++]=1,o());
		System.out.println(Arrays.toString(t));
	}

}
