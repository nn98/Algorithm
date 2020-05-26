package _Algorithm.Sorting;

import java.util.Scanner;
public class P1517 {

	static int n,i,a[],b[];
	static long r;
	static void o(int f,int t) {
		if(f<t) {
			int m=(f+t)/2;
			o(f,m);
			o(m+1,t);
			m(f,t,m);
		}
	}
	static void m(int f,int t,int m) {
		//System.out.println("\t"+Arrays.toString(a));
		int x=f,y=m+1,z=0,w=0,c=0;
		//System.out.println(Arrays.toString(b));
		while(!(x>m&&y>t)) {
			if(x>m) {
				b[z++]=a[y++];
				c++;
			}
			else if(y>t) {
				b[z++]=a[x++];
				r+=c;
			}
			else 
				if(a[x]<a[y]) {
					b[z++]=a[x++];
					r+=c;
				}
				else {
					b[z++]=a[y++];
					c++;
				}
		}
		//System.out.println(Arrays.toString(b));
		for(;f<=t;a[f++]=b[w++]);
		//System.out.println("\t"+Arrays.toString(a));
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		a=new int[n];
		b=new int[n];
		for(;i<n;a[i++]=s.nextInt());
		//System.out.println(Arrays.toString(a));
		o(0,n-1);
//		for(i=0;i<n;System.out.println(a[i++]));
		//System.out.println(Arrays.toString(a));
		System.out.println(r);
	}

}