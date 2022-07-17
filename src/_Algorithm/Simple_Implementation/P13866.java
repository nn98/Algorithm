package _Algorithm.Simple_Implementation;

import java.util.Arrays;
import java.util.Scanner;

public class P13866 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int[]a={s.nextInt(),s.nextInt(),s.nextInt(),s.nextInt()};
		Arrays.sort(a);
		System.out.println(Math.abs(a[0]+a[3])-(a[1]+a[2]));
	}

}
