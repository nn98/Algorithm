package BaekJoon;

import java.util.*;
class P1547_S {
	public static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int m,a,b,x=1;
		m=s.nextInt();
		for(int i=0;i<m;i++){
			a=s.nextInt();
			b=s.nextInt();
			if(x==a)x=b;
			else if(x==b)x=a;
		}
		System.out.print(x);
	}
}