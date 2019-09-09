package BaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P1212_3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		String in=br.readLine();
		boolean b=true;
		if(in.equals("0")) {
			System.out.println(in);
			return;
		}
		String[] arr=in.split("");
		for(String i:arr) {
			String j="";
			switch(Integer.parseInt(i)) {
			case 0:
				j="000";
				break;
			case 1:
				j="001";
				break;
			case 2:
				j="010";
				break;
			case 3:
				j="011";
				break;
			case 4:
				j="100";
				break;
			case 5:
				j="101";
				break;
			case 6:
				j="110";
				break;
			case 7:
				j="111";
				break;
			}
			if(b) {
				while(!(j.charAt(0)=='1')) {
					j=j.replaceFirst("0", "");
				}
				b=false;
			}
			bw.write(j);
		}
		bw.flush();
		bw.close();
	}
}