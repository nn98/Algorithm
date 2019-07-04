package BaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P10815_2 {
	static int[] arr;
	static String r="";
	static void search(int n) {
		int f=0,t=arr.length-1;
		while(true) {
			int m=(f+t)/2;
			if(arr[m]==n||arr[f]==n||arr[t]==n) {
				r+="1 ";
				return;
			}
			if(arr[m]<n) f=m+1;
			else t=m-1;
			if(t<=f) {
				r+="0 ";
				return;
			}
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		arr=new int[n];
		StringTokenizer s=new StringTokenizer(br.readLine().trim());
		for(int i=0;i<n;i++) arr[i]=Integer.parseInt(s.nextToken());
		Arrays.sort(arr);
		int m=Integer.parseInt(br.readLine());
		s=new StringTokenizer(br.readLine().trim());
		for(int i=0;i<m;i++) {
			int a=Integer.parseInt(s.nextToken());
			search(a);
		}
		bw.write(r);
		bw.flush();
	}
}