package Algorithm;

public class RadixTest {
	public static void main(String args[]) {
		int[] arr = {123,453,435,342,173,931,634,532,876};
		int[] c=new int[10];
		int j=1;
		for(int i:arr) {
			c[i/j%10]++;
		}
	}
}
