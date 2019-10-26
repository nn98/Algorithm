package BaekJoon;
import java.util.Scanner;
public class P10867 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),w=2001,a[]=new int[w],t=1000;
		for(;n>0;n--)
			a[s.nextInt()+t]++;
		for(;n<w;n++)
			if(a[n]>0)
				System.out.print(n-t+" ");
	}
}