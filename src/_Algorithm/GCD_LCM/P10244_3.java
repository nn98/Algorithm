package _Algorithm.GCD_LCM;
//TimeOver
import java.util.*;
import java.io.*;
public class P10244_3 {
	static int o(int a,int b) {
		int t;
		while(b>0) {
			t=a%b;
			a=b;
			b=t;
		}
		return a;
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		int n,i=0,j,m,a[],b[];
		while((n=Integer.parseInt(r.readLine()))!=0) {
			Set<Integer> t=new HashSet();
			a=new int[n+1];
			b=new int[n+1];
			for(;i++<n;t.add(a[i]=Integer.parseInt(r.readLine())),t.add(b[i]=o(a[i-1],a[i])));
			for(;--i>0;) {
				m=a[i];
				for(j=i;++j<=n;t.add(m=o(m,a[j])));
			}
			System.out.println(t.size());
		}
	}
}