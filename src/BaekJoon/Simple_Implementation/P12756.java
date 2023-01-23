package BaekJoon.Simple_Implementation;
import java.util.Scanner;
public class P12756 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt(),b=s.nextInt(),x=s.nextInt(),y=s.nextInt();
		String r;
		for(;;) {
			if(b<1) {
				r="PLAYER B";
				if(y<1)r="DRAW";
				System.out.println(r);
				return;
			}
			if(y<1) {
				r="PLAYER A";
				if(b<1)r="DRAW";
				System.out.println(r);
				return;
			}
			b-=x;
			y-=a;
		}
	}
}