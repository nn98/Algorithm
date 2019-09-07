package BaekJoon;

import java.util.Scanner;

public class P5671_E {

	//런타임 에러 by Scanner
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		while(true) {
			String o=s.nextLine();
			if(o.equals("")) break;
			String[] or=o.split(" ");
			int a=Integer.parseInt(or[0]),b=Integer.parseInt(or[1]),sum=0;
			for(int i=a;i<=b;i++) {
				String in=String.valueOf(i);
				boolean c=false;
				for(int j=0;j<in.length()-1;j++) {
					for(int k=j+1;k<in.length();k++) {
						if(in.charAt(j)==in.charAt(k)) {
							c=true;
							//break;
						}
					}
					//if(c) break;
				}
				if(!c) sum++;
			}
			System.out.println(sum);
		}
		
	}

}
