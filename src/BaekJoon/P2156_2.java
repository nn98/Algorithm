package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2156_2 {

	static int max=0,arr[],dp1[],dp2[];

	static void sol(int in,int sum,int count) {
		if(count==0) {
			dp1[in]=sum;
			max=max>dp1[in]+arr[in]?max:dp1[in]+arr[in];
			if(in+1<arr.length) 
				if(dp2[in+1]<sum+arr[in]) 
					sol(in+1,sum+arr[in],1);
			if(in+2<arr.length) 
				if(dp1[in+2]<sum+arr[in]) 
					sol(in+2,sum+arr[in],0);
		}
		else {
			dp2[in]=sum;
			max=max>dp2[in]+arr[in]?max:dp2[in]+arr[in];
			if(in+2<arr.length) 
				if(dp1[in+2]<sum+arr[in]) 
					sol(in+2,sum+arr[in],0);
		}

	}

	public static void main(String[] args) throws NumberFormatException, IOException {
//		Scanner s=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		arr=new int[n];
		dp1=new int[n];
		dp2=new int[n];
		for(int i=0;i<n;i++) arr[i]=Integer.parseInt(br.readLine());
		sol(0,0,0);
		sol(1,0,0);
//		System.out.println(Arrays.toString(dp1));
//		System.out.println(Arrays.toString(dp2));
		System.out.print(max);
	}
}