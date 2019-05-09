package BaekJoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P17173 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(),M=s.nextInt(),sum=0;
		int[] arr=new int[M];
		for(int i=0;i<M;i++) arr[i]=s.nextInt();
		List<Integer> array=new ArrayList<Integer>();
		for(int i:arr) for(int j=1;i*j<=N;j++) if(!array.contains(i*j)) array.add(i*j);
		for(int i:array) sum+=i;
		System.out.println(sum);
	}

}
