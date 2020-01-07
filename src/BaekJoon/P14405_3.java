package BaekJoon;

import java.util.Scanner;

public class P14405_3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		while(s.hasNext()) {
		System.out.print((s.next().replaceAll("pi","").replaceAll("ka","").replaceAll("chu","")).equals("")?"YES":"NO");
		return;
		}
		System.out.print("NO");
	}
}
