package BaekJoon;
//https://extracold.tistory.com/5
import java.util.Scanner;

public class P2293 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),v=s.nextInt(),a[]=new int[n],h[]=new int[v+1],i=0,j,r=0;
		for(;i<n;a[i++]=s.nextInt());
		while(i-->0)a[i]=s.nextInt();
		h[0]=1;
		for(i=0;i<n;i++)for(j=1;j<=v;j++)if(j-a[i]>=0)h[j]+=h[j-a[i]];
		System.out.print(h[v]);
	}
}