package TA;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IDConverter {

	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input ID_LIST. end by 0");
		String s;
		StringBuffer f=new StringBuffer("[");
		while(!(s=r.readLine()).equals("0")) {
			f.append("\""+s+"\",");
		}
		f.append("]");
		System.out.println(f);
	}

}