package BaekJoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P2485_2 {

	static int G(int a,int b){
		for(;;) {
			int c=a%b;
			if(c==0)return b;
			a=b;
			b=c;
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m,i=0,j=0,k=0,v;
		List<Integer>l=new ArrayList();
		for(;i<n;i++) {
			m=s.nextInt();
			if(i>0) {
				v=m-k;
				l.add(v);
				
			}
			k=m;
		}
		System.out.println(l);
		for(int a:l) {
			if(i++!=n)j=G(a,k);
			k=a;
		}
		n=0;
		for(int a:l) {
			n+=a/j-1;
		}
		System.out.println(n);
	}

}
