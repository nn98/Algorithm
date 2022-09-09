package Programmers;

import java.util.*;
import java.io.*;

public class P1835 {
	static BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
	
	static String[]d;
	static char[]a,b;
	static int c[],R;
	static public int solution(int n, String[] data)throws Exception{
		a="ACFJMNRT".toCharArray();
		b=new char[8];
		c=new int[8];
		d=data.clone();
		R=0;
		o(0);
        return R;
    }
	static void o(int x)throws Exception{
		if(x==8) {
//			System.out.println(b);
			R+=p(String.valueOf(b))?1:0;
		}
		else {
			for(int i=0;i<8;i++) {
				if(c[i]<1) {
					b[x]=a[i];
					c[i]++;
					o(x+1);
					c[i]--;
				}
			}
		}
	}
	static boolean p(String s)throws Exception{
		boolean r=true;
		for(String x:d) {
			char n=x.charAt(0),u=x.charAt(2);
			int dis=Integer.parseInt(x.substring(4)),rea=Math.abs(s.indexOf(n)-s.indexOf(u))-1;
			switch(x.charAt(3)) {
			case '=':
				r=r&dis==rea;
				break;
			case '>':
				r=r&rea>dis;
				break;
			case '<':
				r=r&rea<dis;
			}
			w.write(String.format("s:%s n:%c u:%c dis:%d rea:%d case:%c r:%b R:%d\n",s,n,u,dis,rea,x.charAt(3),r,R));
		}
		return r;
	}
	public static void main(String[] args)throws Exception{
		int[]a= {2,2};
		String[][]b= {{"N~F=0", "R~T>2"},{"M~C<2", "C~M>1"}};
		for(int i=0;i<2;w.write("res: "+solution(a[i],b[i++])+"\n"));
		w.flush();
	}

}
