package BaekJoon;

import java.util.Scanner;
//50퍼에서 틀렸었는데 왤까
public class P2485_C {
	static int G(int a,int b) {
		for(;;) {
			int c=a%b;
			if(c==0)return b;
			a=b;
			b=c;
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=n-1,i=0,a[]=new int[n],b[]=new int[m],j=0;
		for(;i<n;j=i++) {
			a[i]=s.nextInt();
			if(i>0)b[j]=a[i]-a[j];
		}
		for(i=0;i<m-1;i++) {
			b[i]=b[i+1]=G(b[i],b[i+1]);
		}
		System.out.println((a[m]-a[0])/b[m-1]-m);
	}
}