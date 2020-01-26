package BaekJoon;

public class P11727 {
	public static void main(String[] args){
		int i=1,s=1001,a[]=new int[s];
		a[0]=1;
		a[1]=1;
		for(;++i<s;a[i]=(a[i-1]+a[i-2]*2)%10007);
		System.out.print(a[new java.util.Scanner(System.in).nextInt()]);
	}
}