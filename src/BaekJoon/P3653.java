package BaekJoon;
// 시간초과 까비
import java.io.*;
import java.util.*;

public class P3653 {

	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(r.readLine()),m,i,j,k,x,a[];
		for(;n-->0;) {
			StringTokenizer t=new StringTokenizer(r.readLine());
			x=i=Integer.parseInt(t.nextToken());
			j=Integer.parseInt(t.nextToken());
			a=new int[i];
			for(;i-->0;a[i]=i);
			t=new StringTokenizer(r.readLine());
			for(;j-->0;) {
				m=Integer.parseInt(t.nextToken())-1;
				w.write(a[m]+" ");
				k=a[m];
				for(i=0;i<x;i++)if(a[i]<k)a[i]++;
				a[m]=0;
			}
			w.write("\n");
		}
		w.flush();
	}

}
