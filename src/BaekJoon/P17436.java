package BaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P17436 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
//		String[] arr=br.readLine().split(" ");
		StringTokenizer st=new StringTokenizer(br.readLine());
		boolean[] ak=new boolean[10];
		int nrr[]=new int[Integer.parseInt(st.nextToken())],brr[]=new int[Integer.parseInt(st.nextToken())+1],r=0;
		st=new StringTokenizer(br.readLine());
		for(int i=0;i<nrr.length;i++) nrr[i]=Integer.parseInt(st.nextToken());
		for(int i=0;i<nrr.length;i++) {
			for(int j=nrr[i];j<brr.length;j+=nrr[i]) brr[j]=1;
		}
		for(int i:brr) r+=i;
		bw.write(""+r);
		bw.flush();
	}

}
