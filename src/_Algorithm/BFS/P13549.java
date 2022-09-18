package _Algorithm.BFS;

public class P13549 {
	static String[]a=new java.util.Scanner(System.in).nextLine().split(" ");
	static int n=Integer.parseInt(a[0]),m=Integer.parseInt(a[1]),l=100001,b[]=new int[l];
	static void o(int x,int v) {
		b[x]=v;
		if(x*2<l&b[x*2]<v)o(x*2,v);
		if(x<l+1&b[x+1]<v+1)o(x+1,v+1);
		if(x>0&b[x-1]<v+1)o(x-1,v+1);
	}
	public static void main(String[] args) {
		o(n,0);
		
		System.out.println(b[m]);
	}

}
