package BaekJoon;
//https://jennylee4517.github.io/ps/2981-%EA%B2%80%EB%AC%B8/
import java.io.*;
import java.util.Arrays;
public class P2981_5 {
	static int G(int a,int b) {
		int t;
		if(a>b) {
			t=a;
			a=b;
			b=t;
		}
		t=b%a;
		while(t!=0) {
			b=a;
			a=t;
			t=b%a;
		}
		return a;
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(r.readLine()),a[]=new int[n],i=0,c,v=0;
		for(;i<n;a[i++]=Integer.parseInt(r.readLine()));
		Arrays.sort(a);
		for(i=1;i<n;a[i-1]=a[i]-a[i++-1]);
		//		System.out.println(Arrays.toString(a));
		if(n==2)v=a[0];
		else {
			v=G(a[0],a[1]);
			for(i=2;i<n-1;v=G(v,a[i++]));
		}
		for(i=2;i<=v-1;w.write(v%i==0?i+" ":""),i--);
//		boolean[]b=new boolean[v+1];
//		for(i=0;i++<v/2;b[i]=b[v/i]=v%i==0);
		//		System.out.println(Arrays.toString(b));
		//		System.out.println(v);
//		for(i=1;++i<=v;w.write(b[i]?i+" ":""));
		
		w.flush();
	}
}