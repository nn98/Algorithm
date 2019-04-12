package Algorithm;

public class N1_Example1Up {
	static void print(int[] a) {
		for (int i : a)
			System.out.printf("%d ", i);
	}
	static void insert(int[] a, int index, int value) {
		if(index<a.length-1) insert(a,index+1,a[index]);
		a[index] = value;
	}
	public static void main(String[] args) {
		int[] a = new int[10];
		for (int i = 0; i < a.length; ++i) a[i] = i;
		insert(a, 5, -99);
		print(a);
	}
}