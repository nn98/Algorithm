package BaekJoon;
//OneT
import java.util.Scanner;
public class P1992 {
	static char[][]a;
	static void o(int p,int q,int s){
		int S=s/2,i=p,j,x=p+s,y=q+s;
		char t=a[p][q];
		boolean c=true;
		for(;i<x&&c;i++) {
			for(j=q;j<y&&c;j++) {
				c=a[i][j]==t;
//				System.out.println(i+" "+j+" "+a[i][j]);
			}
		}
		if(c)System.out.print(t);
		else {
			System.out.print("(");
			o(p,q,S);
			o(p,q+S,S);
			o(p+S,q,S);
			o(p+S,q+S,S);
			System.out.print(")");
		}
	}
	public static void main(String[] args) {
//		System.out.println((int)'1');
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i=0;
		a=new char[n][];
		for(;i<n;a[i++]=s.next().toCharArray());
		o(0,0,n);
	}
}