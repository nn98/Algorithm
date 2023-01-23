package BaekJoon._Before_Tagging;
import java.io.*;
public class P1564_6{
	public static void main(String[] args)throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		long n=Long.parseLong(br.readLine()),m=1,r=1,d=1000000000000L;
		while(m++<n) {
			r*=m;
			while(r%10==0)r/=10;
//			? �ƴ� ����?
			r%=d;
		}
		String R=""+r;
		System.out.print(R.substring(R.length()-5,R.length()));
	}
}