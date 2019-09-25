package BaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P13458 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
//		System.out.println(999995/7);
//		System.out.println((999995/7+1)*5);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine()),arr[]=new int[n];
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
//		int a=Integer.parseInt(br.readLine()),b=Integer.parseInt(br.readLine()),r=0;
		st=new StringTokenizer(br.readLine());
		int a=Integer.parseInt(st.nextToken()),b=Integer.parseInt(st.nextToken());
		long r=n;
		for(int i=0;i<n;i++) {
			arr[i]-=a;
			r+=arr[i]%b==0?arr[i]/b:arr[i]/b+1;
		}
//		bw.write(""+r);
//		bw.flush();
		System.out.print(r);
	}
}