package BaekJoon.Simple_Implementation;
import java.util.Scanner;

public class P14720 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i=0,j,r=0;
		for(;n-->0;) {
			j=s.nextInt();
			if(j==i) {
				i++;
				i%=3;
				r++;
			}
		}
		System.out.print(r);
	}

}
