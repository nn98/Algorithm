package BaekJoon;

import java.util.*;
public class P15829_3 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i=0;
		long p=0,q=1;
		for(char c:s.next().toCharArray()) {
			p+=(c-96)*q;
			q*=31;
			p%=1234567891;
			q%=1234567891;
		}
		System.out.print(p);
	}
}