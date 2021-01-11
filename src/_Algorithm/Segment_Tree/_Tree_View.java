package _Algorithm.Segment_Tree;

import java.util.Arrays;

public class _Tree_View {

	public static void main(String[] args) {
		String s=new java.util.Scanner(System.in).nextLine(),S[];
		int n=1,i,b=0,l=1,L,x;
		for(char c:s.toCharArray())if(c==',')n++;
//		l=n>>2;
		for(b=2;b<n;b*=2,l++);
		b=0;
		StringBuffer f,F[]=new StringBuffer[L=l];
		s=s.substring(1,s.length()-1);
		s=s.replaceAll(",","");
		S=s.split(" ");
		for(;n>1;b++) {
			f=new StringBuffer();
			n/=2;
			for(i=0;i++<b;f.append("  "));
			for(i=n;i<n*2;) {
				f.append(S[i++]);
				for(x=b;x-->0;f.append(" "));
			}
			f.append("\n");
			F[--L]=f;
//			for(i=0;i++<b;System.out.print("\t"));
//			for(i=n;i-->n/2;f.append(S[i]+(i==n/2?"\n":"  ")));
//			n/=2;
		}
		while(n<=l)System.out.println(F[n++-1]);
	}

}
// [0, 15, 10, 5, 3, 7, 5, 0, 1, 2, 3, 4, 5, 0, 0, 0]
// [0, 55, 36, 19, 10, 26, 19, 0, 3, 7, 11, 15, 19, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0, 0, 0, 0]