package Algorithm_Practice;

import java.util.Arrays;
import java.util.Random;

public class P1_1_1Bro_4 {
	
	static int[] set(int a) {
		int[] arr=new int[2];
		if(a%2==0) {
			arr[0]=a-1;
			arr[1]=a;
		} else {
			arr[0]=a;
			arr[1]=a+1;
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random();
		int a=r.nextInt(400)+1,b=r.nextInt(400)+1;
		int[] arr=set(a);
		int[] brr=set(b);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(brr));
	}

}
