package BaekJoon;

//½Å±â
import java.util.Arrays;
import java.util.Scanner;
public class P14501_B{
	public static void main(String[]z){
		Scanner s = new Scanner(System.in);
		int n=s.nextInt(),d[]=new int[21];;
		for(int i=1;i<=n;i++) {
			int t = s.nextInt();
			int p = s.nextInt();
			d[i]=Math.max(d[i-1], d[i]);
			d[i+t-1] = Math.max(d[i+t-1], d[i-1]+p);
		}
		System.out.print(d[n]);
	}
}