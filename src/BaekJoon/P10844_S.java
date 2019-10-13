package BaekJoon;

class P10844_S{
	public static void main(String[]z){
		int n=new java.util.Scanner(System.in).nextInt(),a[][]=new int[101][11],r=0,p=1000000000;
		for(int i=1;i<10;i++)a[1][i]=1;
		for(int i=2;i<=n;i++){
			a[i][0]=a[i-1][1];
			for(int j=1;j<10;j++)a[i][j]=(a[i-1][j-1]+a[i-1][j+1])%p;
		}
		for(int i=0;i<10;i++)r=(r+a[n][i])%p;
		System.out.print(r%p);
	}
}