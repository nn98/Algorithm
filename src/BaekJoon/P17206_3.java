package BaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P17206_3 {
	
	static boolean[] arr=new boolean[80000];

	public static void main(String[] args) throws NumberFormatException, IOException {
		for(int j=3;j<arr.length;j+=3) arr[j]=true;
		for(int j=7;j<arr.length;j+=7) arr[j]=true;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int index=0,sum=0,n=Integer.parseInt(br.readLine()),num[]=new int[n];
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			num[i]=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(num);
		for(int i=3;i<=num[num.length-1];i++) {
			if(arr[i]) sum+=i;
			if(num[index]==i) {
				bw.write(""+sum+"\n");
				index++;
			}
		}
		bw.flush();
	}
}
