package BaekJoon;

import java.util.Scanner;

public class P11557 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int c=s.nextInt(),max=0,index=-1;
		s.nextLine();
		for(int k=0;k<c;k++) {
			int n=s.nextInt();
			s.nextLine();
			String[][] arr=new String[n][2];
			for(int i=0;i<n;i++) {
				arr[i]=s.nextLine().split(" ");
			}
			for(int i=0;i<n;i++) {
				int t=Integer.parseInt(arr[i][1]);
				if(t>max) {
					max=t;
					index=i;
				}
			}
			System.out.println(arr[index][0]);
		}
	}
}
