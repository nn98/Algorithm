package BaekJoon;

import java.io.*;
import java.util.*;
public class P1406_3{
	public static void main(String[]z)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		String t;
		List<String>l=new ArrayList(Arrays.asList(r.readLine().split("")));
		int n=Integer.parseInt(r.readLine()),i=l.size();
		for(;n-->0;) {
			switch(t=r.readLine()){
			case "L":
				if(i>0)i--;
				break;
			case "D":
				if(i<l.size())i++;
				break;
			case "B":
				if(i>0)l.remove(i---1);
				break;
			default:
				l.add(i++,t.substring(t.length()-1));
				break;
			}	
		}
		
	}
}
