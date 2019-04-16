package Algorithm;

public class N1_Example2 {
	static int sum(int n) {
		if(n==1) return n;
		else return n+sum(n-1);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 3; i <= 10; ++i)
			 System.out.printf("%d %d\n", i, sum(i));
	}

}
