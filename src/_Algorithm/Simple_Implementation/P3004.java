package _Algorithm.Simple_Implementation;

public class P3004 {

	public static void main(String[] args) {
		int n=new java.util.Scanner(System.in).nextInt();
		System.out.println((int)n%2<1?Math.pow((n/2+1),2):((n/2+1)*(n/2+2)));
	}

}
