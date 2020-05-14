package BaekJoon;

public class P11444 {

	static long mod=1000000007;
	static long f4(long n) {
		long N=n--,m[][]={{1,1},{1,0}},aM[][]={{1,0},{0,1}};
		while(n>0) {
			if(n%2==1)aM=mMultiply(aM,m);
			m=mMultiply(m,m);
			n/=2;
		}
		if(N<3)return 1;
		else return aM[1][0]+aM[1][1]%mod;
	}
	static long[][]mMultiply(long[][]mm1,long[][]mm2){
		int m1=mm1.length,n1=mm1[0].length,m2=mm2.length,n2=mm2[0].length,i=0,j,k;
		long[][]t=new long[m1][n2];
		for(;i<m1;i++)
			for(j=0;j<n2;j++) {
				for(k=0;k<n1;k++)
					t[i][j]+=mm1[i][k]*mm2[k][j];
				t[i][j]%=mod;
			}
		return t;
	}
	
	public static void main(String[] args) {
		System.out.print(f4(new java.util.Scanner(System.in).nextLong()));
	}

}
