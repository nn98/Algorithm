package BaekJoon;

public class P8320 {

	public static void main(String[] args) {
		int n=new java.util.Scanner(System.in).nextInt(),i=1,j,r=0;
		boolean[][]a=new boolean[n+1][n+1];
		for(;i<=n/2;i++) {
			for(j=1;j<=n&&i*j<=n;j++) {
				if(a[i][j])
					continue;
				a[i][j]=true;
				a[j][i]=true;
//				System.out.println(i+" "+j);
				r++;
			}
		}
		System.out.print(r);
	}

}
