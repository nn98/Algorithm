package _Algorithm.Simple_Implementation;
import java.util.Scanner;
public class P23795 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i=s.nextInt(),u=0;
		for(;i>0;u+=i,i=s.nextInt());
		System.out.print(u);
	}
}