package BaekJoon;

import java.io.IOException;
import java.util.Scanner;

public class P13458_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
//		System.out.println(999995/7);
//		System.out.println((999995/7+1)*5);
		//음수도 나눌 수 있다 시발거
		System.out.println(-5/5);
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int a=s.nextInt(),b=s.nextInt();
		long r=n;
		for(int i=0;i<n;i++) {
			arr[i]-=a;
			if(arr[i]<1) continue;
			r+=arr[i]%b==0?arr[i]/b:arr[i]/b+1;
		}
//		bw.write(""+r);
//		bw.flush();
		System.out.print(r);
	}
}