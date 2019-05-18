package ConTest;
import java.util.Arrays;
import java.util.Scanner;

public class C418_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=0,b=0,length=8;
		int[] a1=new int[8],a2=new int[8];
		for(String i:s.nextLine().split("")) {
			a1[a++]=Integer.parseInt(i);
		}
		for(String i:s.nextLine().split("")) {
			a2[b++]=Integer.parseInt(i);
		}
		int[] arr=new int[length*2-1];
		for(int j=0;j<arr.length-2;j++) {
			a=0;
			b=0;
			int c=0;
			for(int i=0;i<arr.length;i++) {
				if(i%2==0) 
					arr[i]=(a1[a++]+a2[b])%10;
				else 
					arr[i]=(a1[a]+a2[b++])%10;
				if(a==length) break;
			}
			for(int i=0;i<arr.length-j;i++) {
				if(i%2==0)
					a1[c]=arr[i];
				else
					a2[c++]=arr[i];
			}
			
		}
		System.out.println(""+(arr[0]+arr[1])%10+""+(arr[1]+arr[2])%10);
	}
}