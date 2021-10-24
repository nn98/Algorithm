package _Algorithm.Two_Pointer;
import java.util.Scanner;
public class P14465 {
	public static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),k=s.nextInt(),b=s.nextInt(),i=0,j=0,u=0,r=0;
		boolean[]a=new boolean[n];
		for(;i++<b;a[s.nextInt()]=true);
		for(i=0;i<n-k;u-=a[i++]?1:0) {
			for(;j<i+k;u+=a[j++]?1:0);
			r=r<u?r:u;
		}
		System.out.println(r);
	}
}