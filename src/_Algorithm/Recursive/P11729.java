package _Algorithm.Recursive;

import java.util.ArrayList;
import java.util.List;

public class P11729 {
	static List l=new ArrayList();
	static void o(int n,int f,int b,int t) {
		if(n==1)l.add(f+" "+t);
		else {
			o(n-1,f,t,b);
			l.add(f+" "+t);
			o(n-1,b,f,t);
		}
	}
	public static void main(String[] args) {
		o(new java.util.Scanner(System.in).nextInt(),1,2,3);
		int i=-2,s=l.size();
		for(;++i<s;System.out.println(i<0?s:l.get(i)));
	}

}
