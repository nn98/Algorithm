package BaekJoon;

import java.math.BigDecimal;
import java.util.Scanner;

public class P10827 {
	//5min
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		BigDecimal bd=new BigDecimal(s.next()).pow(s.nextInt());
		System.out.println(bd.toPlainString());
	}
}
