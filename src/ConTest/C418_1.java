package ConTest;

import java.util.Scanner;

public class C418_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		String[] arr=s.next().split("");
		boolean r=true;
		for(int i=1;i<N*2-1;i+=2) {
			if(arr[i].equals(arr[i+1])) {
				r=false;
				break;
			}
		}
		if(r) System.out.println("Yes");
		else System.out.println("No");
	}

}
