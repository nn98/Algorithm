package BaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class P17436_3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
//		String[] arr=br.readLine().split(" ");
		StringTokenizer st=new StringTokenizer(br.readLine());
		long nrr[]=new long[(int) Long.parseLong(st.nextToken())],b=Long.parseLong(st.nextToken()),r=0;
		st=new StringTokenizer(br.readLine());
		for(int i=0;i<nrr.length;i++) nrr[i]=Integer.parseInt(st.nextToken());
		HashSet<Long> hs=new HashSet<Long>();
		for(int i=0;i<nrr.length;i++) {
			for(long j=nrr[i];j<=b;j+=nrr[i]) {
				if(!hs.contains(j)) {
					hs.add(j);
					r++;
				}
			}
		}
		bw.write(""+r);
		bw.flush();
	}
}
