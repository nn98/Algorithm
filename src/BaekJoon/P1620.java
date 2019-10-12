package BaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class P1620 {

//	static class N{
//		int i;
//		String s;
//		N(int i,String s){
//			this.i=i;
//			this.s=s;
//		}
//	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		String[]in=r.readLine().split(" "),a,b;
		int n=Integer.parseInt(in[0]),m=Integer.parseInt(in[1]);
		a=new String[n];
		b=new String[n];
		for(int i=0;i<n;i++) {
			a[i]=r.readLine();
			b[i]=a[i]+" "+(i+1);
		}
//		System.out.println(Arrays.toString(a));
		Arrays.sort(b);
//		System.out.println(Arrays.toString(b));
		for(int i=0;i<m;i++) {
			String j=r.readLine();
			if(64<j.charAt(0)&&j.charAt(0)<91) {
				int k=-Arrays.binarySearch(b,j);
//				System.out.println(b[--k]);
				in=b[--k].split(" ");
				System.out.println(in[1]);
			}
			else {
				System.out.println(a[Integer.parseInt(j)-1]);
			}
		}
	}

}