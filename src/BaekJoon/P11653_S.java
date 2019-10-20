package BaekJoon;

class P11653_S {
	public static void main(String[]z) {
		int n=new java.util.Scanner(System.in).nextInt(),i=2;
		for(;i<=n;i++) {
			if(n%i==0) {
				System.out.println(i);
				n/=i--;
			}
		}
	}
}