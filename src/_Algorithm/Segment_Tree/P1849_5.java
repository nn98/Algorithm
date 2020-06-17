package _Algorithm.Segment_Tree;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class P1849_5 {
	static int n,m=1,i=1,j,k,e,p,a[],t[],x,y,v;
	static void o() {
		x=j+i-1;
		t[x]=m;
		for(;x>1;x/=2,t[x]=t[x*2]+t[x*2+1]);
	}
	static void f(int v) {
		if(x>=j)i=x-j+1;
		else {
			e=t[x*2];
			if(v<e)x*=2;
			else {
				x*=2;
				x++;
				v-=e;
			}
			f(v);
		}
	}
	public static void main(String[]z)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		n=Integer.parseInt(r.readLine());
		a=new int[n+1];
		for(;i<n;i*=2);
		j=i;
		i*=2;
		t=new int[i];
		for(i=0;i++<n;o());
		System.out.println(Arrays.toString(t));
		m=0;
		for(;p++<n;) {
			f(Integer.parseInt(r.readLine()));
			a[i]=p;
			o();
			System.out.println(Arrays.toString(a));
		}
	}
}