package BaekJoon;

import java.util.Scanner;

public class P2711 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i;
		StringBuffer t,r=new StringBuffer();
		for(;n-->0;) {
			i=s.nextInt();
			t=new StringBuffer(s.next());
			t.replace(i-1,i,"");
			r.append(t+"\n");
		}
		System.out.print(r);
	}

}
