package insert;

import java.util.Scanner;

public class P2857 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String r="";
		for(int i=1;i<6;i++) {
			String in=s.next();
			for(int j=0;j<in.length()-2;j++) {
//				System.out.println(in.substring(j,j+2));
				if(in.substring(j,j+3).equals("FBI")) {
					r+=i+" ";
					break;
				}
			}
		}
		if(r.equals("")) System.out.println("HE GOT AWAY!");
		else System.out.println(r);
	}
}
