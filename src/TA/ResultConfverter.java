package TA;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ResultConfverter {

	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		String[]a=r.readLine().split(" ");
		int i=0;
		for(;i<a.length;w.write(a[i]+(i++%2==0?"\t":"\n")));
		w.flush();
	}

}
