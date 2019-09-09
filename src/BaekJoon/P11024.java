package BaekJoon;

import java.util.Scanner;

public class P11024 {
	//4Ка
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		s.nextLine();
		for(int i=0;i<n;i++) {
			String[] arr=s.nextLine().split(" ");
			int r=0;
			for(String j:arr) r+=Integer.parseInt(j);
			System.out.println(r);
		}
	}
}
