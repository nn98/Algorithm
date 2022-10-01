package _Algorithm.Simple_Implementation;
import java.util.Scanner;
public class P11134 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i,j;
		for(;n-->0;i=s.nextInt(),j=s.nextInt(),System.out.println(i/j+(i%j<1?0:1)));
	}
}