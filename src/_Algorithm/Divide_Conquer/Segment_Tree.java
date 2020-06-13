package _Algorithm.Divide_Conquer;

import java.io.*;
import java.util.*;

public class Segment_Tree {

	static int n,m,h,k,i,j,a[]={3,1,6,4,5,2},t[];
	static int o(int n,int s,int e) {
//		System.out.println(n+" "+s+" "+e+" "+Arrays.toString(t));
		if(s==e)return t[n]=a[s];
		else return t[n]=o(n*2,s,(s+e)/2)+o(n*2+1,(s+e)/2+1,e);
//		int m=(s+e)/2;
//		return t[n]=o(n*2,s,m)+o(n*2+1,m+1,e);
	}
	public static void main(String[] args)throws Exception{
//		System.out.println(Math.round(Math.log(n)));
//		System.out.println(Math.pow(2,Math.round(Math.log(n))+1)-1);
//		t=new long[(int)Math.round(Math.pow(2,Math.round(Math.log(n))+1)-1)];
//		t=new long[(int)(2*n-1)];
//		세상에 자바엔 log2가 없대! 시발
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer s=new StringTokenizer(r.readLine());
		n=Integer.parseInt(s.nextToken());
		m=Integer.parseInt(s.nextToken());
		k=Integer.parseInt(s.nextToken());
		h=(int)Math.round(Math.log(n)/Math.log(2));
		i=(1<<(h+1));
		System.out.println(i);
		t=new int[i];
//		o(0,0,(int)m-1);
		o(1,0,5);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(t));
	}

}