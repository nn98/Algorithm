package BaekJoon;

import java.math.BigDecimal;
import java.util.Scanner;

public class P15792 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		BigDecimal a=new BigDecimal(s.next());
		BigDecimal b=new BigDecimal(s.next());
		a=a.divide(b,1500,BigDecimal.ROUND_UP);
		System.out.println(a);
	}

}
