package BaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.StringTokenizer;

public class P17436_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		//		String[] arr=br.readLine().split(" ");
		StringTokenizer st=new StringTokenizer(br.readLine());
		int nrr[]=new int[Integer.parseInt(st.nextToken())],r=0;
		BigInteger b=new BigInteger(st.nextToken());
		st=new StringTokenizer(br.readLine());
		for(int i=0;i<nrr.length;i++) nrr[i]=Integer.parseInt(st.nextToken());
		HashSet<BigInteger> hs=new HashSet<BigInteger>();
		for(int i=0;i<nrr.length;i++) {
			for(int j=nrr[i];b.compareTo(BigInteger.valueOf(j))>=0;j+=nrr[i]) { 
//				if(hs.contains(o)r++;
			}
		}
		//		for(int i:brr) r+=i;
		bw.write(""+r);
		bw.flush();
	}

}