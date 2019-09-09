package BaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class P11656 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		String t=br.readLine();
		ArrayList<String>[] al=new ArrayList[26];
		for(int i=0;i<t.length();i++) {
			String j=t.substring(i, t.length());
			int x=j.charAt(0)-'a';
			if(al[x]==null) al[x]=new ArrayList<String>();
			al[x].add(j);
		}
		for(int i=0;i<al.length;i++) if(al[i]!=null) Collections.sort(al[i]);
		for(int i=0;i<al.length;i++) if(al[i]!=null) for(int j=0;j<al[i].size();j++) bw.write(al[i].get(j)+"\n");
		bw.flush();
	}
}
