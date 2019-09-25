package Algorithm_02;

public class Example4 {
	static void print1(int[][] a) {
		for (int i = 0; i < a.length; ++i) {
			for (int j = 0; j < a[i].length; ++j)
				System.out.printf("%d ", a[i][j]);
			System.out.println();
		}
	}
	static void print2(int[][] a, int i, int j) {
		if(i==a.length || j==a[i].length) return;
		System.out.print(a[i][j]+" ");
		print2(a,i,j+1);
		if(j==0) {
			System.out.println();
			print2(a,i+1,j);
		}

	}
	public static void main(String[] args) {
		int[][] a = {{ 1, 2, 3 }, {4, 5, 6}, {7, 8, 9} };
		print1(a);
		System.out.println();
		print2(a, 0, 0);
	}
}