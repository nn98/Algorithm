package BaekJoon;

public class P10994_S{
	static int n=new java.util.Scanner(System.in).nextInt(),t=n*2-2,l=t*2+1;
	static char[][]a=new char[l][l];
	static void S(int p) {
		int x=t-p,y=t+p;
		for(int i=x;i<=y;i++)a[x][i]=a[i][x]=a[y][i]=a[i][y]='*';
	}
	public static void main(String[]z){
		for(int i=0;i<=t;i+=2)S(i);
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++)System.out.print(a[i][j]=='*'?"*":" ");
			System.out.println();
		}
	}
}