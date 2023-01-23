package BaekJoon.Math;
import java.util.Scanner;
public class P15726 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		double a=s.nextInt(),b=s.nextInt(),c=s.nextInt();
		System.out.println((int)Math.max(a*b/c,a/b*c));
	}
}