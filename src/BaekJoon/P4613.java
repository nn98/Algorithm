package BaekJoon;
import java.util.Scanner;

public class P4613 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String in=s.nextLine();
		while(!in.equals("#")) {
			int sum=0;
			for(int i=0;i<in.length();i++) {
				if(in.charAt(i)==' ') continue;
				else
					sum+=(i+1)*(in.charAt(i)-'A'+1);
			}
			System.out.println(sum);
			in=s.nextLine();
		}
	}

}