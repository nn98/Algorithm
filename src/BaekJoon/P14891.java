package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P14891 {

	static String[][]a=new String[4][];
	static boolean[]h;
	static int i,r,j=1;
	static void o(int t,int c) {
		System.out.println(t);
		h[t]=true;
		if(c<0) {
			if(t>0)
				if(!a[t-1][2].equals(a[t][6]))if(!h[t-1])o(t-1,1);
			if(t<3)
				if(!a[t+1][6].equals(a[t][2]))if(!h[t+1])o(t+1,1);
			String v=a[t][0];
			for(int i=0;i<7;i++)a[t][i]=a[t][i+1];
			a[t][7]=v;
		}
		else{
			if(t>0)
				if(!a[t-1][2].equals(a[t][6]))if(!h[t-1])o(t-1,-1);
			if(t<3)
				if(!a[t+1][6].equals(a[t][2]))if(!h[t+1])o(t+1,-1);
			String v=a[t][7];
			for(int i=7;i>0;i--)a[t][i]=a[t][i-1];
			a[t][0]=v;
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		for(;i<4;a[i++]=s.next().split(""));
		for(i=s.nextInt();i-->0;) {
			h=new boolean[4];
			o(s.nextInt()-1,s.nextInt());
			for(String[]b:a)System.out.println(Arrays.toString(b));
		}
		for(;i<4;j*=2)if(a[i++][0].equals("1"))r+=j;
		System.out.print(r);
	}
}