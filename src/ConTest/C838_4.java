package ConTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class C838_4 {

	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer t=new StringTokenizer(r.readLine());
		long e=Long.parseLong(t.nextToken()),h=Long.parseLong(t.nextToken()),n=Long.parseLong(t.nextToken()),
				a[]=new long[(int)n],g,tar,far,now=0;
		int i=0;
		for(;i<n;i++) {
			far=Math.abs(now-a[i]);
			System.out.println("f: "+far);
			
		}
	}

}
