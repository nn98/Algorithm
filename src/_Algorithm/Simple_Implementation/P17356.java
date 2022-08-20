package _Algorithm.Simple_Implementation;
import java.util.*;
public class P17356 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		double a=s.nextInt();
		System.out.print(1/(1+Math.pow(10,(s.nextInt()-a)/400)));
	}
}