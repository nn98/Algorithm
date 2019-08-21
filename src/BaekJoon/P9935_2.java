package BaekJoon;

import java.util.Scanner;

public class P9935_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String[] input=s.nextLine().split(""),b=s.nextLine().split(""),r=new String[input.length+1];
//		System.out.println(Arrays.toString(input));
//		System.out.println(Arrays.toString(b));
		int index=0,cont=0;
		boolean c=false;
		for(;index<input.length;index++) {
			r[cont]=input[index];
			if(r[cont].equals(b[b.length-1])) {
				for(int i=0;i<b.length;i++) {
					if(b[(b.length-1)-i].equals(r[cont-i]))
						c=true;
					else
						c=false;
				}
			}
			if(c) {
				cont-=b.length;
				for(int i=0;i<b.length;i++) {
					r[(cont+1)+i]=null;
				}
				c=false;
			}
			cont++;
		}
//		System.out.println(Arrays.toString(r)+cont);
		if(r[0]==null) System.out.println("FRULA");
		else for(int i=0;r[i]!=null;i++) System.out.print(r[i]);
	}

}