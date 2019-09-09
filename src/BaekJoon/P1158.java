package BaekJoon;

import java.util.ArrayList;
import java.util.Scanner;

public class P1158 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k=s.nextInt()-1;
//		int[] arr=new int[n];
//		int[] his=new int[n];
//		int count=0,index=0;
//		for(int j=k;count<n;j=(j+k)%n) {
//			for(int i=j;i>=0;i--) {
//				if(arr[i]==1) j++;
//			}
//			if(arr[j-1]==0) {
//				System.out.println(j);
//				arr[j-1]++;
//				count++;
//			}
//		}
		ArrayList<Integer> arr=new ArrayList<Integer>();
		for(int i=1;i<=n;i++) {
			arr.add(i);
		}
		int i=0;
		String r="<";
		while(!arr.isEmpty()) {
			i+=k;
			if(i>=arr.size()) i%=arr.size();
//			System.out.println(arr.remove(i));
			r+=arr.remove(i)+", ";
		}
		r=r.substring(0,r.length()-2)+">";
		System.out.println(r);
//		for(int i=k;!arr.isEmpty();i+=k) {
//			if(i>=arr.size()) i%=arr.size();
//			System.out.println(arr.remove(i-1));
//		}
	}
}