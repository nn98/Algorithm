package insert;

import java.util.Scanner;

public class P2754 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String in=s.next();
		if(in.equals("A+")) System.out.println(4.3);
		else if(in.equals("A0")) System.out.println(4.0);
		else if(in.equals("A-")) System.out.println(3.7);
		else if(in.equals("B+")) System.out.println(3.3);
		else if(in.equals("B0")) System.out.println(3.0);
		else if(in.equals("B-")) System.out.println(2.7);
		else if(in.equals("C+")) System.out.println(2.3);
		else if(in.equals("C0")) System.out.println(2.0);
		else if(in.equals("C-")) System.out.println(1.7);
		else if(in.equals("D+")) System.out.println(1.3);
		else if(in.equals("D0")) System.out.println(1.0);
		else if(in.equals("D-")) System.out.println(0.7);
		else if(in.equals("F")) System.out.println(0.0);
	}

}
