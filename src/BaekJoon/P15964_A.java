package BaekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class P15964 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		String[] a=br.readLine().split(" ");
		BigInteger b=new BigInteger(a[0]);
		BigInteger c=new BigInteger(a[1]);
		//		System.out.println((n+m)*(n-m));
		System.out.println(b.multiply(b).subtract(c.multiply(c)));
	}
}
