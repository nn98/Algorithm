package Algorithm_Practice;

import java.util.Arrays;
import java.util.Scanner;

public class P1_1_1Bro_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String word=s.nextLine();
		char[] w=word.toCharArray();
		for(int i=0;i<w.length;i++) {
			if((int)w[i]>=65&&(int)w[i]<=91)
				w[i]=(char) ('A'+'Z'-w[i]);
			else if((int)w[i]>=97&&(int)w[i]<=123)
				w[i]=(char) ('a'+'z'-w[i]);
		}
		System.out.println(Arrays.toString(w));

	}

}
