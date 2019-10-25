package BaekJoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P15649_2 {

	static int n,m,a[],i=1;
	static List<StringBuffer>r;
	
	static void o(int x,StringBuffer s) {
		if(x==n) {
			if(s.length()==m*2)
				r.add(s);
			return;
		}
		o(x+1,new StringBuffer(s));
		o(x+1,new StringBuffer(s.append(a[x]+" ")));
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		m=s.nextInt();
		a=new int[n];
		r=new ArrayList<>();
		for(;i<=n;i++)a[i-1]=i;
		o(0,new StringBuffer());
//		Collections.sort(r);
	}

}
