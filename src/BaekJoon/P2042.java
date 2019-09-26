package BaekJoon;

import java.util.Scanner;

public class P2042 {
	//시간초과
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		long n=s.nextLong(),m=s.nextLong(),k=s.nextLong(),a[]=new long[(int) n];
		for(long i=0;i<n;i++)a[(int) i]=s.nextLong();
		for(long i=0;i<m+k;i++) {
			if(s.nextLong()==1) {
				a[(int) (s.nextLong()-1)]=s.nextLong();
			}
			else {
				long d=s.nextLong()-1,b=s.nextLong(),r=0;
				for(;d<b;d++)r+=a[(int) d];
				System.out.println(r);
			}
		}
	}
}
