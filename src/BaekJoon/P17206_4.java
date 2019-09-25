package BaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P17206_4 {
	static int[] arr=new int[800001];
	public static void main(String[] args) throws NumberFormatException, IOException {
		for(int j=3;j<arr.length;j++) {
			if(j%3==0||j%7==0) {
				arr[j]=arr[j-1]+j;
			}
			else arr[j]=arr[j-1];
		}
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int index=0,sum=0,n=Integer.parseInt(br.readLine()),num[]=new int[n];
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			bw.write(""+arr[Integer.parseInt(st.nextToken())]+"\n");
		}
		bw.flush();
	}
}
