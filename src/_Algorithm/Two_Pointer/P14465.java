package _Algorithm.Two_Pointer;
import java.util.Scanner;
public class P14465 {
	public static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),k=s.nextInt(),b=s.nextInt(),i=0,j=0,u=0,r=n;
		boolean[]a=new boolean[n];
		for(;i++<b;a[s.nextInt()-1]=true);
		i=0;
		for(;j<k;u+=a[j++]?1:0);
		j--;
		r=r<u?r:u;
		for(;j<n;u-=a[i++]?1:0,u+=a[j++]?1:0,r=r<u?r:u);
		System.out.println(r);
	}
}