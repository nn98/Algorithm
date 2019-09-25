package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10173 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String in;
		while(!(in=br.readLine()).equals("EOI")) {
			boolean c=false;
			for(int i=0;i<in.length()-4;i++) {
				if(in.substring(i, i+4).toLowerCase().equals("nemo")) {
					c=true;
					break;
				}
			}
			if(c)
				System.out.println("Found");
			else
				System.out.println("Missing");
		}
	}
}
