package BaekJoon;

public class P10997_2 {
	static int n=new java.util.Scanner(System.in).nextInt(),t=n*2-2,l=t*2+1;
	static char[][]a=new char[l+2][l];
	static void S(int p) {
		int x=t-p+1,y=t+p;
		System.out.println(x+" "+y);
		for(int i=x;i<=y;i++) {
			a[x-1][i]='*';
			a[y+1][i]='*';
			a[i][x]='*';
			a[i][y]='*';
		}
	}
	public static void main(String[]z){
		System.out.println(a.length+" "+t);
		for(int i=0;i<=t;i+=2)S(i);
		int q=l-1;
		boolean p=true;
		for(int i=1;i<l;i++) {
			System.out.println(i+" "+q);
			if(p) {
				a[i][q]=' ';
				p=false;
			}
			else {
				a[i][q]='*';
				p=true;
			}
//			a[i][q]=' ';
			q--;
		}
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++)System.out.print(a[i][j]=='*'?"*":" ");
			System.out.println();
		}
	}
}