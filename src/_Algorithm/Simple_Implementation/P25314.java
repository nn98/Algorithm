package _Algorithm.Simple_Implementation;
import java.util.Scanner;
public class P25314 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),l=4,i;
		for(;l<n;l+=4);
		for(i=l/4;i-->0;System.out.print("long "));
		System.out.println("int");
	}
}