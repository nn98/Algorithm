package Algorithm_03_1;

import java.util.Arrays;
import java.util.Random;

public class Example9 {

	public static int[] sol(int[] arr) {
		int[] r=new int[arr.length];
		int f=0,e=arr.length-1;
		for(int i:arr) {
			if(i%2==0) r[f++]=i;
			if(i%2==1) r[e--]=i;
		}
		return r;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random();
		int[] n=new int[15];
		for(int i=0;i<n.length;i++) 
			n[i]=r.nextInt(10);
		System.out.println("before : "+Arrays.toString(n));
		n=sol(n);
		System.out.println("after : "+Arrays.toString(n));
	}

}
