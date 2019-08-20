package BaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P9935 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		String in=br.readLine(),ex=br.readLine();
		while(!in.replace(ex, "").equals(in)) in=in.replace(ex, "");
		if(in.equals("")) System.out.println("FRULA");
		else System.out.println(in);
	}
}
