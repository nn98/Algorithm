package BaekJoon;
public class P1564_7{
	public static void main(String[] args)throws Exception{
		long n=new java.util.Scanner(System.in).nextLong(),m=1,r=1,d=1000000000000L;
		while(m++<n){
			r*=m;
			while(r%10==0)r/=10;
			r%=d;
		}
		String R=""+r;
		System.out.print(R.substring(R.length()-5,R.length()));
	}
}