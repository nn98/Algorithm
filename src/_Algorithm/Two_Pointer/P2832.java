package _Algorithm.Two_Pointer;

import java.io.*;
import java.util.*;

public class P2832 {
	static int n,a[],i,j,k,p,u,R;
	static List<Integer>l=new ArrayList();
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(r.readLine());
		StringTokenizer t=new StringTokenizer(r.readLine());
//		a=new int[n+1];
//		a[n]=n+1;
//		for(;i<n;a[i++]=Integer.parseInt(t.nextToken()));
		for(;i++<n;l.add(Integer.parseInt(t.nextToken())));
		l.add(n+1);
		l.add(0,10);
		System.out.println(l);
//		for(;++k<=n;) {
//			System.out.println("k: "+k+" j: "+j);
////			if(a[k-1]>a[k])j=k;
//			if(a[k-1]<a[k]) {
//				for(i=k-1;i>=j;p=a[i],a[i]=a[j],a[j]=p,i--,j++);
//				j=k;
//			}
//		}
//		System.out.println(Arrays.toString(a));
//		for(i=0;++i<n;) {
//			for(j=i-1;j>0&a[j]>a[i];j--);
//			System.out.println(i+" "+j);
//			u+=i-(j+1);
//		}
//		System.out.println(u);
	}

}
