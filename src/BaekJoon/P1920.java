package BaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P1920 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine()),arr[]=new int[n];
		String[] in=br.readLine().split(" ");
		for(int i=0;i<n;i++) arr[i]=Integer.parseInt(in[i]);
		int m=Integer.parseInt(br.readLine()),brr[]=new int[m];
		in=br.readLine().split(" ");
		for(int i=0;i<m;i++) brr[i]=Integer.parseInt(in[i]);
		for(int i=0;i<m;i++) {
			boolean c=true;
			for(int j=0;j<n;j++) {
				if(arr[j]==brr[i]) {
					bw.write("1\n");
					c=false;
					break;
				}
			}
			if(c) bw.write("0\n");
		}
		bw.flush();
	}
}
