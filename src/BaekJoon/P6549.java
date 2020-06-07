package BaekJoon;
import java.io.*;
import java.util.*;

public class P12846_4 {

	static int n,a[],i,R;
	static void o(int f,int t) {
//		System.out.println(f+" "+t);
		if(t<f)return;
		if(f==t)R=R>a[f]?R:a[f];
		else {
			int m=a[f],v,l=t-f+1,i=f,j=f;
			for(;i++<t;)
				if(a[i]<m) {
					j=i;
					m=a[i];
				}
			v=m*l;
			R=R>v?R:v;
				o(f,j-1);
				o(j+1,t);
		}

	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(r.readLine());
		a=new int[n];
		StringTokenizer t=new StringTokenizer(r.readLine());
		for(;i<n;a[i++]=Integer.parseInt(t.nextToken()));
		o(0,n-1);
		System.out.print(R);
	}

}