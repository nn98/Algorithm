package BaekJoon;
//https://joonas.tistory.com/45
public class P12755_2 {
	public static void main(String[]z){
		int n=new java.util.Scanner(System.in).nextInt();
//		,t=0,p=0,s=0,x=9,f=1,d;
//		while(s<n) {
//			t++;
//			p=s;
//			s+=x*t;
//			s*=10;
//		}
//		for(x=0;x<t-1;s++)f*=10;
//		d=n-p-1;
//		System.out.println(f+(d/t));
		int digit = 0, sum = 0, psum = 0, s = 9;
		while (sum < n) {
			digit++;
			psum = sum;
			sum += s * digit;
			s *= 10;
		}
		// 목표: 10^{digit-1}부터 시작했을 때, idx번째 자리에 있는 숫자
		int from = 1;
		for (int i = 0; i < digit - 1; ++i) from *= 10;
		int idx = n - psum - 1;
		System.out.println((""+(from + (idx / digit))).charAt(idx%digit));
	}
}