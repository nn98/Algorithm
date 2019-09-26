package insert;

import java.util.Scanner;

public class P2720 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++) {
			int in=s.nextInt();
			System.out.print(in/25+" ");
			in%=25;
			System.out.print(in/10+" ");
			in%=10;
			System.out.print(in/5+" ");
			in%=5;
			System.out.println(in/1);
			in%=1;
		}
	}

}