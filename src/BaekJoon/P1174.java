package BaekJoon;

import java.util.Scanner;

public class P1174 {

	public static void main(String[] args) {
		long k=System.currentTimeMillis();
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),r=0;
		for(int i=0;;i++) {
			String t=""+i;
			boolean p=true;
			for(int j=0;j<t.length()-1;j++) {
				if(t.charAt(j+1)>=t.charAt(j)) {
					p=false;
					break;
				}
			}
			if(p)r++;
			if(r==n) {
				System.out.println(i);
				break;
			}
		}
		System.out.println(System.currentTimeMillis()-k);
	}
}