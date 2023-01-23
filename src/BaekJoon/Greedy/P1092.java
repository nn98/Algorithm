package BaekJoon.Greedy;
import java.io.*;
import java.util.StringTokenizer;
public class P1092 {
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(r.readLine()),a[]=new int[n],m,b[],i=0,j=0;
		StringTokenizer t=new StringTokenizer(r.readLine());
		m=Integer.parseInt(r.readLine());
		b=new int[m];
		for(;i<n;a[i++]=Integer.parseInt(t.nextToken()));
		t=new StringTokenizer(r.readLine());
		for(;j<n;a[j++]=Integer.parseInt(t.nextToken()));
	}
}