package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P1912_3 {

	static int r,arr[],history[];
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),max=0,add=0;
		arr=new int[n];
		history=new int[n];
		for(int i=0;i<n;i++) arr[i]=s.nextInt();
		history[0]=arr[0];
		for(int index=1;index<arr.length;index++) {
			history[index]=history[index-1]+arr[index]>arr[index]?history[index-1]+arr[index]:arr[index];
			r=r>history[index]?r:history[index];
//			int sum=0;
//			if(index+1<arr.length) sum=history[index+1];
//			history[index]=arr[index]>sum?arr[index]:sum;
		}
//		System.out.println(Arrays.toString(history));
//		for(int i:history) {
//			if(i>r) r=i;
//		}
		System.out.print(r);
	}
}