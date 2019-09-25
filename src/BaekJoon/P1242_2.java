package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P1242_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),k=s.nextInt(),m=s.nextInt()-1,index=0,count=0,sum=0,confirm=1;
		boolean[] arr=new boolean[n];
		while(sum<n) {
//			System.out.println(Arrays.toString(arr)+" "+count);
			if(index==n) index=0;
			if(arr[index]) {
				index++;
				continue;
			} else {
				if(confirm==k) {
//					System.out.println(index);
					arr[index]=true;
					sum++;
					confirm=1;
					if(arr[m]) break;
					continue;
				}
				count++;
				index++;
				confirm++;
			}
		}
		System.out.print(count);
	}
}
