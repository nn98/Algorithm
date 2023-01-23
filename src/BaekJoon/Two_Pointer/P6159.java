package BaekJoon.Two_Pointer;
import java.util.Scanner;
public class P6159{
	public static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt(),i=0,a[]=new int[n],j,r=0;
		for(;i<n;i++) {
			a[i]=s.nextInt();
			for(j=i;j-->0;r+=a[i]+a[j]>m?0:1);
		}
		System.out.print(r);
	}
}