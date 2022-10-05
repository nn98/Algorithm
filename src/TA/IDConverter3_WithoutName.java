package TA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class IDConverter3_WithoutName {

	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Lecture ID: ");
		int i=0,lID=Integer.parseInt(r.readLine()),sID;
		String s;
		StringTokenizer t;
		StringBuffer f=new StringBuffer();
		while(!(s=r.readLine()).equals("0")) {
			t=new StringTokenizer(s);
			System.out.println(s);
			f.append(String.format("insert into Student (ID, bojid) values (%d, \"%s\");",
					sID=Integer.parseInt(t.nextToken()),t.nextToken(),t.nextToken()));
			f.append(String.format("insert into Learn (Student_ID,Lecture_ID) values (%d,%d);", sID,lID));
			if(++i%5==0)f.append("\n");
		}
		System.out.println(f);
	}
}
