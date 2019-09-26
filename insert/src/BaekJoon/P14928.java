package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P14928 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		Scanner s=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//		BigInteger b=new BigInteger(br.readLine()).mod(new BigInteger("20000303"));
//		System.out.print(b);
		String in=br.readLine();
		int r=0;
		for(int i=0;i<in.length();i++) {
			r=(r*10+in.charAt(i)-'0')%20000303;
		}
		System.out.println(r);
	}
}