package _Algorithm.Segment_Tree;

import java.io.*;
import java.util.*;

public class P14428 {
	static int n,a[],l=1,i,j,k,M=Integer.MAX_VALUE;
	static void o() {
		System.out.println("\n"+Arrays.toString(a));
//		for(;j>1;j/=2,a[j]=(a[j*2]==0?Integer.MAX_VALUE:a[j*2])<=(a[j*2+1]==0?Integer.MAX_VALUE:a[j*2+1])?a[j*2]:a[j*2+1]);
		for(;j>1;j/=2,a[j]=a[a[j*2]]<a[a[j*2+1]]?a[j*2]:a[j*2+1]);
	}
	static int p(int n,int l,int r) {
//		System.out.println(n+" "+l+" "+r);
		if(l>i|j>r) {
//			System.out.println("re 0");
			return 0;
		}
		if(j<=l&r<=i) {
//			System.out.println("re "+a[n]);
			return a[n];
		}
		int m=(l+r)/2,x=p(n*2,l,m),y=p(n*2+1,m+1,r);
		return a[x]>a[y]?y:x;
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		n=Integer.parseInt(r.readLine());
		for(;l<n;l*=2);
		a=new int[l*2];
		a[0]=Integer.MAX_VALUE;
		Arrays.fill(a,l,l*2,M);
		StringTokenizer t=new StringTokenizer(r.readLine());
		for(;i<n;j=l+i++,a[j]=Integer.parseInt(t.nextToken()),j/=2,a[j]=a[j*2]>a[j*2+1]?j*2+1:j*2,o());
//		System.out.println(Arrays.toString(a));
		for(n=Integer.parseInt(r.readLine());n-->0;) {
			t=new StringTokenizer(r.readLine());
			k=Integer.parseInt(t.nextToken());
			j=Integer.parseInt(t.nextToken());
			i=Integer.parseInt(t.nextToken());
			if(k>1) {
				w.write(p(1,j,i)-l+"\n");
			}
			else {
				j+=l-1;
				a[j]=i;
				j/=2;
				a[j]=a[j*2]>a[j*2+1]?j*2+1:j*2;
				o();
//				System.out.println(Arrays.toString(a));
			}
		}
		w.flush();
	}

}