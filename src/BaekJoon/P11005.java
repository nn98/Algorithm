package BaekJoon;

import java.util.Scanner;

public class P11005 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),b=s.nextInt(),p;
		StringBuffer f=new StringBuffer();
		while(n!=0) {
			p=n%b;
			if(p>9)f.append((char)('A'+p-10));
			else f.append(p);
			n/=b;
		}
		System.out.print(f.reverse());
	}

}
