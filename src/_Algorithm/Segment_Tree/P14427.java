package _Algorithm.Segment_Tree;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P14427 {
	static int n,a[],l=1,i,j,k;
	static void o() {
		if(j>=l) {
			j/=2;
			a[j]=(a[j*2]==0?Integer.MAX_VALUE:a[j*2])<=(a[j*2+1]==0?Integer.MAX_VALUE:a[j*2+1])?j*2:j*2+1;
		}
		for(;j>2;j/=2,a[j]=(a[a[j*2]]==0?Integer.MAX_VALUE:a[a[j*2]])<=(a[a[j*2+1]]==0?Integer.MAX_VALUE:a[a[j*2+1]])?a[j*2]:a[j*2+1]);
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		n=Integer.parseInt(r.readLine());
		for(;l<n;l*=2);
		a=new int[l*2];
//		a[0]=Integer.MAX_VALUE;
//		Arrays.fill(a,Integer.MAX_VALUE);
		StringTokenizer t=new StringTokenizer(r.readLine());
		for(;i<n;j=l+i++,a[j]=Integer.parseInt(t.nextToken()),o());
		for(n=Integer.parseInt(r.readLine());n-->0;) {
			t=new StringTokenizer(r.readLine());
			k=Integer.parseInt(t.nextToken());
			if(k>1)w.write(a[1]+"\n");
			else {
				a[j=Integer.parseInt(t.nextToken())+l-1]=Integer.parseInt(t.nextToken());
				o();
			}
		}
		w.flush();
//		System.out.println(Arrays.toString(a));
	}

}
