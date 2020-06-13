package _Algorithm.Brute_Force;
//
import java.util.Arrays;
import java.util.Scanner;

public class P2503_2 {
	static int n,m,i,j,d[][],r,e[];
	static char[]a=new char[3],b[];
	static boolean f,c[]=new boolean[10];
	static void o(int x) {
		if(x==3) {
			p();
		}
		else for(int k=0;++k<10;)
			if(!c[k]) {
				a[x]=(char)(k+'0');
				c[k]=true;
				o(x+1);
				c[k]=false;
			}
	}
	static void p() {
		System.out.println(a);
		f=true;
		for(j=0;j<n&&f;j++) {
			e=new int[2];
			for(i=0;i<3;i++)
				for(m=0;m<3;m++)
					if(a[i]==b[j][m])
						if(i==m)e[0]++;
						else e[1]++;
			System.out.println("\t"+Arrays.toString(a)+" "+Arrays.toString(b[j])+" "+Arrays.toString(e));
			f=d[j][0]==e[0];
			f=d[j][1]==e[1];
		}
//		r+=f?1:0;
		if(f) {
			r++;
		}
	}
	public static void main(String[]z) {
		Scanner s=new Scanner(System.in);
		m=n=s.nextInt();
		b=new char[n][];
		d=new int[n][2];
		for(;m-->0;b[m]=s.next().toCharArray(),d[m][0]=s.nextInt(),d[m][0]=s.nextInt());
		for(;++m<n;System.out.println(Arrays.toString(b[m])+" "+d[m][0]+" "+d[m][1]));
		o(0);
		System.out.println(r);
	}
}