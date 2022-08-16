package Programmers;

public class P84512 {
	static char[]a= {' ', 'A', 'E', 'I', 'O', 'U'},b;
	static int[]h=new int[6];
	static void o(int x) {
		if(x==6)System.out.println(b);
		for(int i=0;i<6;i++) {
			if(x<1)continue;
			b[x]=a[i];
			o(x+1);
		}
	}
	public static void main(String[] args) {
		o(0);
	}

}
