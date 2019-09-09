package BaekJoon;

import java.util.Scanner;

public class P2490 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		for(int i=0;i<3;i++) {
			int sum=0;
			for(int j=0;j<4;j++)
				sum+=s.nextInt();
			switch(sum) {
			case 0:
				System.out.println("D");
				break;
			case 1:
				System.out.println("C");
				break;
			case 2:
				System.out.println("B");
				break;
			case 3:
				System.out.println("A");
				break;
			case 4:
				System.out.println("E");
				break;
			}
		}
	}

}
