package _Algorithm.Segment_Tree;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Test01 {
	static int i=1,j,n,m,t[],a[],x,k,h;
	static void o() {
		for(;x>1;x/=2,t[x]=t[x*2]+t[x*2+1]);
	}
	static void p(int v) {
		for(int Z=m++;Z-->0;System.out.print("\t"));
		System.out.println(v+" "+x);
		if(x>=j)k=x-j+1;
		else {
			h=t[x*=2];
			if(v>=h) {
				x++;
				v-=h;
			}
			p(v);
		}
	}
	public static void main(String[]Z)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		n=Integer.parseInt(r.readLine());
		a=new int[n+1];
		for(;i<n;i*=2);
		j=i;
		t=new int[i*2];
		for(i=0;i<n;t[x=(j+i++)]=1,o());
		System.out.println(Arrays.toString(t));
		for(i=0;i++<n;) {
			m=0;
			p(Integer.parseInt(r.readLine()));
			a[k]=i;
			t[x=j+k-1]=0;
			o();
			System.out.println(Arrays.toString(t));
		}
		for(i=0;i++<n;w.write(a[i]+"\n"));
		w.flush();
	}

}
