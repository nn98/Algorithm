package _Algorithm.Simple_Implementation;
import java.util.Scanner;
public class P10474 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		for(;;) {
			int a=s.nextInt(),b=s.nextInt();
			if(a+b<1)break;
			System.out.println(a/b+" "+a%b+" / "+b);
		}
	}
}