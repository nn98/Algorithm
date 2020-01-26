package BaekJoon;
//https://joonas.tistory.com/45
public class P12755_2 {
	public static void main(String[]z){
		int n=new java.util.Scanner(System.in).nextInt(),t=0,p=0,s=0,x=9,f=1,d;
		while(s<n) {
			t++;
			p=s;
			s+=x*t;
			s*=10;
		}
		for(x=0;x<t-1;s++)f*=10;
		d=n-p-1;
		System.out.println(f+(d/t));
	}
}
