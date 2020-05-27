package _Algorithm.Sorting;
//split vs StringTokenizer : https://stackoverflow.com/questions/691184/scanner-vs-stringtokenizer-vs-string-split?rq=1
import java.io.*;
import java.util.*;
public class P1516_4 {

	static int n,m,v[],c[],i,j;
	static List<Integer>[]l;
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		n=Integer.parseInt(r.readLine())+1;
		v=new int[n];
		c=new int[n];
		l=new List[n];
		for(;i<n;l[i++]=new ArrayList());
		for(i=0;++i<n;) {
			j=0;
			for(String s:r.readLine().split(" ")) {
				if(!s.equals("-1")) {
					if(++j>1) {
						l[i].add(Integer.parseInt(s));
						c[i]++;
					}
					else v[i]=Integer.parseInt(s);
				}
			}
		}
		System.out.println(Arrays.toString(v));
		System.out.println(Arrays.toString(c));
		for(i=0;++i<n;System.out.println(l[i].toString()));
	}

}
