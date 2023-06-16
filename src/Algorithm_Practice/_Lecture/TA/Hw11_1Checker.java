package Algorithm_Practice._Lecture.TA;

import java.util.Scanner;

public class Hw11_1Checker {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String I,J[]=("10\r\n"
				+ "201899011\r\n"
				+ "201988011\r\n"
				+ "202077022\r\n"
				+ "201988022\r\n"
				+ "202099022\r\n"
				+ "202176123\r\n"
				+ "201876125\r\n"
				+ "202077001\r\n"
				+ "9599002\r\n"
				+ "201988010\r\n"
				+ "201876125\r\n"
				+ "202176123\r\n"
				+ "202077001\r\n"
				+ "202077022\r\n"
				+ "201988010\r\n"
				+ "201988011\r\n"
				+ "201988022\r\n"
				+ "9599002\r\n"
				+ "201899011\r\n"
				+ "202099022\"").split("\r\n");
		while(!(I=s.nextLine()).equals("0")) {
			if(I.equals("")) {
				System.out.println();
				continue;
			}
			if(I.split(" ")[0].charAt(0)=='"') {
				boolean T=true;
				for(int i=0;i<21;T=T?s.nextLine().equals(J[i]):T,i++);
				System.out.println(I.substring(1)+"\t"+T);
			}
		}
	}

}
