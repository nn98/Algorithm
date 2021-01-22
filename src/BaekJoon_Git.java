import java.util.Scanner;
public class BaekJoon_Git {
	public static void main(String[]z) {
		Scanner s=new Scanner(System.in);
		String[]a=s.nextLine().split(" ");
		for(int i=0;i<a.length;System.out.print(String.format("[%s](https://www.acmicpc.net/problem/%s)",a[i],a[i])+((i+++1)%10==0?"\n":" ")));
	}
}
