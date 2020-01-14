package BaekJoon;

public class P7572 {

	public static void main(String[] args) {
		int n=new java.util.Scanner(System.in).nextInt()-4;
		System.out.print((char)(n%12+'A')+""+n%10);
	}
}