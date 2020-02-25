package BaekJoon;

import java.util.Scanner;

public class P7790 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int r=0,i;
		while(s.hasNext()) {
			char[]t=s.nextLine().toCharArray();
			for(i=0;i<t.length-3;i++)
				if(t[i]=='j'&&t[i+1]=='o'&&t[i+2]=='k'&&t[i+3]=='e')
					r++;
		}
		System.out.println(r);
	}

}
