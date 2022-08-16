package Programmers;

public class P84512 {
	static char[]a= {' ', 'A', 'E', 'I', 'O', 'U'},b=new char[5];;
	static int i,h[]=new int[6];
	static void o(int x) {
		if(x==5)System.out.println(++i+"\t"+new String(b));
		else for(int i=x<1?1:0;i<(x>1?(b[x-1]==' '?1:6):6);i++) {
			b[x]=a[i];
			o(x+1);
		}
	}
	public static void main(String[] args) {
		o(0);
	}

}
