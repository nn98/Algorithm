package ConTest;

import java.util.Arrays;
import java.util.Scanner;

public class P11444 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		long N=s.nextLong();
		int[] arr=new int[3];
		if(N<2) System.out.println(N);
		else {
			arr[0]=0;
			arr[1]=1;
			for(long i=2;i<=N;i++) {
				arr[(int)i%3]=arr[(int)(i-1)%3]%1000000007+arr[(int)(i-2)%3]%1000000007;
				System.out.println(arr[(int)i%3]%3);
			}
		}
		//System.out.println(Arrays.toString(arr));
		System.out.println(arr[(int)N%3]);
	}

}
