package BaekJoon;

public class P9417 {

	static int G(int a,int b) {
		return b==0?a:G(b,a%b);
	}
	public static void main(String[] args) {
		
	}

}
