package BaekJoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P1660 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),a=1,b=1,u=0,m;
		List<Integer>l=new ArrayList<>();
		for(;b<=n;) {
			a++;
			l.add(b);
			//			System.out.println(l.toString());
			b+=a;
		}
//		System.out.println(l);
		for(int i=l.size()-1;i>=0;i--) {
			m=l.get(i);
			if(n-m>=0) {
				n-=m;
				u++;
			}
			if(n==0)break;
		}
		System.out.print(u);
	}
}