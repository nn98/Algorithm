package BaekJoon;

public class P11023 {
	public static void main(String[] args) {
		int r=0;
		for(String i:new java.util.Scanner(System.in).nextLine().split(" "))r+=Integer.parseInt(i);
		System.out.print(r);
	}
}