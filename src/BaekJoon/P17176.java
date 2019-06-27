package BaekJoon;

import java.util.Scanner;

public class P17176 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int[] arr=new int[53];
		for(int i=0;i<N;i++) {
			arr[s.nextInt()]++;
		}
		//System.out.println(Arrays.toString(arr));
		s.nextLine();
		char[] input=s.nextLine().toCharArray();
		//System.out.println(Arrays.toString(input));
		for(int i:input) {
			if(i==32) arr[0]--;
			else if(i<91) arr[i-64]--;
			else if(i<123) arr[i-70]--;
		}
		//System.out.println(Arrays.toString(arr));
		boolean isEmpty=true;
		for(int i:arr) {
			if(i!=0) {
				isEmpty=false;
				break;
			}
		}
		if(isEmpty) System.out.println("y");
		else System.out.println("n");
	}

}