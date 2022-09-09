package _Algorithm.DFS;
import java.io.*;
import java.util.*;
public class P14615 {
// 갱신마다 모든 간선정보를 업데이트하지 않는이상 바로 연결정보를 저장할수는 없을듯
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		String[]a=r.readLine().split(" ");
		int n=Integer.parseInt(a[0]),m=Integer.parseInt(a[1]),i,j;
		Set<Integer>[]l=new Set[n+1];
		for(;m-->0;) {
			a=r.readLine().split(" ");
			i=Integer.parseInt(a[0]);
			j=Integer.parseInt(a[1]);
			if(l[i]==null)l[i]=new HashSet();
			l[i].add(j);
			if(l[j]!=null)for(int c:l[j])l[i].add(c);
		}
		for(i=0;i++<n;System.out.println(l[i]));
	}

}
