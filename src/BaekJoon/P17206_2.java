package BaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P17206_2 {
	
//	static boolean[] arr

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			int sum=0,arr[]=new int[Integer.parseInt(st.nextToken())+1];
			for(int j=3;j<arr.length;j+=3) arr[j]=1;
			for(int j=7;j<arr.length;j+=7) arr[j]=1;
			for(int j=3;j<arr.length;j++) if(arr[j]!=0) sum+=j;
			bw.write(""+sum+"\n");
		}
		bw.flush();
	}
}
