package BaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class FacCarcul {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		BigInteger N=new BigInteger("1");
		for(int i=1;i<=n;i++) {
			N=N.multiply(new BigInteger(""+i));
			if(i>=(n-100)) System.out.println(i+"!:	"+N);
		}
	}

}
