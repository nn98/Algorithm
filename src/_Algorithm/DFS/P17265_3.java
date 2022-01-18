package _Algorithm.DFS;
import java.io.*;
public class P17265_3 {
	static int n,i,j,r,L,S;
	static String[][]a;
	static char[]b;
	static void o(int x,int y) {
		b[i++]=a[x][y].charAt(0);
		if(x==n-1&y==n-1) {
			System.out.println(b);
			r=b[0]-'0';
			for(j=1;j<n*2-1;j+=2) {
				switch(b[j]){
				case '+':
					r+=b[j]-'0';
					break;
				case '-':
					r-=b[j]-'0';
					break;
				case '*':
					r*=b[j]-'0';
				}
			}
			L=L>r?L:r;
			S=S<r?S:r;
		}else {
			if(x<n-1)o(x+1,y);
			else if(y<n-1)o(x,y+1);
		}
		i--;
	}
	public static void main(String[] args)throws Exception{
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w=new BufferedWriter(new OutputStreamWriter(System.out));
		n=Integer.parseInt(r.readLine());
		a=new String[n][n];
		b=new char[n*2-1];
		for(;i<n;a[i++]=r.readLine().split(" "));
		i=0;
		o(0,0);
		System.out.print(L+" "+S);
	}
}