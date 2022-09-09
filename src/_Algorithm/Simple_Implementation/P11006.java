package _Algorithm.Simple_Implementation;
import java.util.Scanner;
public class P11006 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),a,b;
		for(;n-->0;a=s.nextInt(),b=s.nextInt(),System.out.println(b*2-a+" "+(b-(b*2-a))));
	}
}