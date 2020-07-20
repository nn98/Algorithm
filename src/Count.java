import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a[]=new int[4],i;
		while((i=s.nextInt())!=0) {
			a[i]++;
		}
		System.out.println(a[1]+" "+a[2]+" "+a[3]);
	}
}