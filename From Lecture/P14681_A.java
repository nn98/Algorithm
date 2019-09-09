package BaekJoon;
import java.util.Scanner;

public class P14681 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt();
		if(n>=0&&m>=0) System.out.println(1);
		else if(n<0&&m>=0) System.out.println(2);
		else if(n<0&&m<0) System.out.println(3);
		else if(n>=0&&m<0) System.out.println(4);
	}
}
