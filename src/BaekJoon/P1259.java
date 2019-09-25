package BaekJoon;

import java.util.Scanner;

class P1259 {

	public static void main(String[] a){
		Scanner s=new Scanner(System.in);
		String i=s.nextLine();
		while(!i.equals("0")) {
			boolean b=true;
			for(int j=0;j<i.length()/2;j++) {
				if(i.charAt(j)!=i.charAt(i.length()-(1+j))) {
					System.out.println("no");
					b=false;
					break;
				}
			}
			if(b) System.out.println("yes");
			i=s.nextLine();
		}
	}
}