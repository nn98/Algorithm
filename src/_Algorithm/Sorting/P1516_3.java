package _Algorithm.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class P1516_3 {
	static int n,i,j,k,x,y,v[],t[][],r[];
	static boolean[]a[],b[],f;
	static void o() {
		x++;
		y=0;
		for(i=0;++i<n;) {
			if(f[i])continue;
			boolean c=false;
			for(j=0;++j<n;c=c|a[i][j]);
			if(!c) {
				t[x][++y]=i;
				f[i]=true;
			}
		}
		System.out.println(Arrays.toString(t[x])+x);
		for(i=0;++i<n&&t[x][i]!=0;)
			for(k=0;++k<n;a[k][t[x][i]]=false,System.out.println(k+" "+i));
	}
	public static void main(String[] args) {
//		System.out.println(1^1); XOR test
		Scanner s=new Scanner(System.in);
		n=s.nextInt()+1;
		v=new int[n];
		t=new int[n][n];
		r=new int[n];
		f=new boolean[n];
		a=new boolean[n][n];
		b=new boolean[n][n];
		for(;++i<n;) {
			v[i]=s.nextInt();
			while((j=s.nextInt())>=0)b[i][j]=a[i][j]=true;
		}
		System.out.println(Arrays.toString(v));
		while(x<n-1)o();
		for(boolean[]c:a)
			System.out.println(Arrays.toString(c));
		for(int[]c:t)
			System.out.println(Arrays.toString(c));
		for(boolean[]c:b)
			System.out.println(Arrays.toString(c));
//		for(i=0;++i<n;) {
//			k=0;
//			j=t[i];
//			System.out.println("time "+i+": "+j);
//			while(++k<i) {
//				System.out.println(k);
//				if(b[j][t[k]])
//					r[j]=Math.max(r[j],v[t[k]]);
//			}
//			r[j]+=v[j];
//		}
		for(i=0;++i<n;) {
			j=0;
			while(++j<n&&t[i][j]!=0) {
				k=t[i][j];
				for(x=0;++x<i;) {
					for(y=0;++j<n&&t[x][y]!=0;)
						if(b[k][t[x][y]])
							r[k]=Math.max(r[k],v[t[x][y]]);
				}
				r[k]+=v[k];
			}
		}
		System.out.println(Arrays.toString(r));
	}

}