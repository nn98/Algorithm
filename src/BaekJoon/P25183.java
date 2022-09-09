package BaekJoon;
import java.util.Scanner;

public class P25183 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		s.next();
		char[]a=s.next().toCharArray();
		int i=0,j,r=1;
		for(;i<a.length-4&r<5;i++) {
			for(j=i;Math.abs(a[j]-a[j+1])==1&j<a.length&r<5;j++,r++);
		}
		System.out.println(r<5?"NO":"YES");
	}

}
