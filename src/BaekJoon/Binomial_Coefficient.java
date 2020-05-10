package BaekJoon;

public class Binomial_Coefficient {

	static long sol1(long n,long r) {
		if(n==r||r==0) return 1;
		return sol1(n-1,r-1)+sol1(n-1,r);
	}
	
	static long[][]h=new long[1001][1001];
	
	static long sol2(int n,int r) {
		if(h[n][r]>0)return h[n][r];
	}
	
	public static void main(String[] args) {
		
	}

}
