package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10820 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String input;
		while((input=br.readLine())!=null&&input.length()!=0) {
			int a=0,b=0,c=0,d=0;
			for(int i=0;i<input.length();i++) {
				char t=input.charAt(i);
				if(t>='a'&&t<='z') a++;
				else if(t>='A'&&t<='Z') b++;
				else if(t>='0'&&t<='9') c++;
				else if(t==' ') d++;
			}
			System.out.println(a+" "+b+" "+c+" "+d);
		}
	}
}
