package BaekJoon;

public class P10822 {

	public static void main(String[] args) {
		int r=0;
		for(String a:new java.util.Scanner(System.in).next().split(","))r+=Integer.parseInt(a);
		System.out.print(r);
	}

}
