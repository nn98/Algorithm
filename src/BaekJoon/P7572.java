package BaekJoon;

public class P7572{
	public static void main(String[] args){
		int n=new java.util.Scanner(System.in).nextInt()-4;
		if(n<0)n+=60;
		System.out.print((char)(n%12+'A')+""+n%10);
	}
}