package BaekJoon;
//?????
//출력을 병신같이 하지 않도록 주의하자!^^ㅆㅃㄹ
import java.util.Arrays;
import java.util.Scanner;
public class P2981_6S {
	static int G(int a,int b) {
		if(b==0)return a;
		else return G(b,a%b);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),a[]=new int[n],i=0,m;
		for(;i<n;a[i++]=s.nextInt());
		Arrays.sort(a);
		m=a[1]-a[0];
		for(i=2;i<n;m=G(m,a[i]-a[i++-1]));
		for(i=2;i<=m;i++)if(m%i==0)System.out.print(i+" ");
	}
}