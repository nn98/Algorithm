package BaekJoon;

import java.io.*;
public class P1371 {
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		String s;
		int i,a[]=new int[26],v=0;
		StringBuffer f=new StringBuffer();
		while((s=r.readLine())!=null) {
//			while(!(s=r.readLine()).equals("")) {
			for(i=0;i<s.length();i++) {
				char c=s.charAt(i);
				if(c>96&&c<123)a[c-'a']++;
			}
		}
		for(i=0;i<26;i++)v=v>a[i]?v:a[i];
		for(i=0;i<26;i++)System.out.print(a[i]==v?(char)(i+97):"");
	}
}