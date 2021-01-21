import java.util.Scanner;

public class BaekJoon_Git {
	public static void main(String[]z) {
		Scanner s=new Scanner(System.in);
		while(s.hasNext()) {
			String[]a=s.nextLine().split(" ");
			for(String b:a)System.out.print(String.format("[%s](https://www.acmicpc.net/problem/%s)",a,a));
			System.out.println();
		}
	}
}
