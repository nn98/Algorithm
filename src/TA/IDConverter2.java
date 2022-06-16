package TA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class IDConverter2 {

	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		int i=0;
		String s;
		StringTokenizer t;
		StringBuffer f=new StringBuffer();
		while(!(s=r.readLine()).equals("0")) {
			t=new StringTokenizer(s);
			System.out.println(s);
			f.append(String.format("insert into Student (ID, name, bojid) values (%d, \"%s\", \"%s\"",
					Integer.parseInt(t.nextToken()),t.nextToken(),t.nextToken()));
			if(++i%5==0)f.append("\n");
		}
		System.out.println(f);
	}

}
