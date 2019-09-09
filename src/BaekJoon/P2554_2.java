package BaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class P2554_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		BigInteger N=new BigInteger("1");
		for(int i=1;i<=n;i++) {
			N=N.multiply(new BigInteger(""+i));
		}
		String r=N.toString();
		int i=r.length()-1;
		for(;r.charAt(i)=='0';i--);
		System.out.println(r.substring(i, i+1));
	}
}
