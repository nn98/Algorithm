package BaekJoon.Binary_Search;

// ��ä�� �������ϳ�

import java.io.*;
import java.util.*;

public class P1920 {
	
	static int[]arr;
	static int o(int i,int j,int x) {
		if(j<i)return 0;
		int m=(i+j)/2;
		if(arr[m]==x)return 1;
		if(arr[m]<x)return o(m+1,j,x);
		if(arr[m]>x)return o(i,m-1,x);
		return 0;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine()),m,brr[];
		arr=new int[n];
		StringTokenizer t=new StringTokenizer(br.readLine());
		for(int i=0;i<n;arr[i++]=Integer.parseInt(t.nextToken()));
		m=Integer.parseInt(br.readLine());
		brr=new int[m];
		t=new StringTokenizer(br.readLine());
		for(int i=0;i<m;brr[i++]=Integer.parseInt(t.nextToken()));
		Arrays.sort(arr);
		for(int i=0;i<m;i++) {
			bw.write(o(0,n-1,brr[i])+"\n");
		}
		bw.flush();
	}
}