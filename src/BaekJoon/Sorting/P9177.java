package BaekJoon.Sorting;
// ������ ����� ����
import java.util.Scanner;

public class P9177 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i=0,j,k;
		char[]a;
		for(;i++<n;) {
			k=1;
			a=new char[58];
			for(j=0;j++<2;)
				for(char c:s.next().toCharArray())
					a[c-'A']++;
			for(char c:s.next().toCharArray()) {
				a[c-'A']--;
				if(a[c-'A']<0) {
					k=0;
					break;
				}
			}
			System.out.println("Data set "+i+": "+(k>0?"yes":"no"));
		}
	}
}