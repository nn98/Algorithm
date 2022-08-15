package _Algorithm.Math;

public class P12866 {

	public static void main(String[] args) {
		int i,a[]=new int[20],m=1000000007;
		for(char c:new java.util.Scanner(System.in).next().toCharArray())a[c-'A']++;
		i=a[0]%m;
		i=i*a[2]%m;
		i=i*a[6]%m;
		System.out.print(i*a[19]%m);
	}

}
