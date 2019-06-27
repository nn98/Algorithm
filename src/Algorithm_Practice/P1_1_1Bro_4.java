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
	
	static int count(int a) {
		int h,t,o;
		h=a/100;
		t=a%100/10;
		o=a%10/1;
		int r1=h*t*o,r2=h+t+o;
		int r=r1>r2?r1:r2;
		return r;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random();
		int a=r.nextInt(400)+1,b=r.nextInt(400)+1;
		int[] arr=set(a);
		int[] brr=set(b);
		System.out.println("pobi		crong		result");
		System.out.print(Arrays.toString(arr));
		System.out.print("	"+Arrays.toString(brr));
		int t1=count(arr[0])>count(arr[1])?count(arr[0]):count(arr[1]);
		int t2=count(brr[0])>count(brr[1])?count(brr[0]):count(brr[1]);
		
		int result=-1;
		result=t1==t2?0:(t1>t2?1:2);
		System.out.println("	"+result);
	}

}
