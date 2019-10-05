package BaekJoon;

public class P10997_3 {
	
	static int n=new java.util.Scanner(System.in).nextInt(),l=1+(n-1)*4,y=l/2,x=y+1;
	static char[][]A=new char[l+2][l];

	static void S(int h,int w) {
		int a=x-h,b=x+h,c=y-w,d=y+w;
		for(int i=a;i<=b;i++) {
			A[i][c]='*';
			A[i][d]='*';
		}
		for(int i=c;i<=d;i++) {
			A[a][i]='*';
			A[b][i]='*';
		}
	}
	
	public static void main(String[] args) {
//		System.out.println(A.length+" "+A[0].length+" "+x+" "+y);
		if(n==1)System.out.print('*');
		else {
			int i=0;
//			S(1,i);
//			System.out.println((n-1)*2);
			for(;i<=(n-1)*2;i+=2)S(1+i,i);
//			S(i,i-2);
//			for(int i=x+1;;) {
//				for(int j=y;;) {
//					a[i][j]='*';
//					
//				}
//			}
			int a=1,b=l-1;
			boolean f=true;
			for(i=0;i<l;i++) {
				if(a==x&&b==y)continue;
				if(f) {
					A[a][b]=' ';
					f=false;
				}
				else {
					A[a][b]='*';
					f=true;
				}
				a++;
				b--;
			}
			for(i=0;i<l+2;i++) {
				if(i==1) {
					System.out.println('*');
					continue;
				}
				for(int j=0;j<l;j++) 
					System.out.print(A[i][j]=='*'?'*':' ');
				System.out.println();
			}
		}
	}
}
