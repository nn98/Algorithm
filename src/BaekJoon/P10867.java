package BaekJoon;
import java.util.Scanner;
public class P10867 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),a[]=new int[2001];
		for(;n>0;n--)
			a[s.nextInt()+1000]++;
		for(n=0;n<2001;n++)
			if(a[n]>0)
				System.out.print(n-1000+" ");
	}
}