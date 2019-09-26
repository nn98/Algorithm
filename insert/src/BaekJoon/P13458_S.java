package BaekJoon;
import java.util.*;
class P13458_S{
	public static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),arr[]=new int[n];
		for(int i=0;i<n;i++)arr[i]=s.nextInt();
		int a=s.nextInt(),b=s.nextInt();
		long r=n;
		for(int i=0;i<n;i++) {
			arr[i]-=a;
			if(arr[i]<1) continue;
			r+=arr[i]%b==0?arr[i]/b:arr[i]/b+1;
		}
		System.out.print(r);
	}
}