package BaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P11365 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		String in;
		while(!(in=br.readLine()).equals("END")) {
			StringBuilder t=new StringBuilder(in);
			t.reverse();
			bw.write(t.toString()+"\n");
		}
		bw.flush();
	}
}
