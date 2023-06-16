package Algorithm_Practice._Lecture.TA;

import java.util.Scanner;

public class RunTestConvert {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i=0;
		s.nextLine();
		String[]a=new String[n];
		for(;i<n;a[i++]=s.nextLine());
		for(i=0;i<n;System.out.println(a[i++]+"\n"
				+ "10\n"
				+ "201899011\n"
				+ "201988011\n"
				+ "202077022\n"
				+ "201988022\n"
				+ "202099022\n"
				+ "202176123\n"
				+ "201876125\n"
				+ "202077001\n"
				+ "9599002\n"
				+ "201988010\n"
				+ ""));
	}

}
