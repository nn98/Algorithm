package Algorithm;

import java.util.Scanner;

public class Main0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int x=s.nextInt(),y=s.nextInt(),w=s.nextInt(),h=s.nextInt();
		System.out.println((x<w-x?x:w-x)<(y<h-y?y:h-y)?(x<w-x?x:w-x):(y<h-y?y:h-y));
	}

}
