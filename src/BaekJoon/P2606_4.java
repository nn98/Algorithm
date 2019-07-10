package BaekJoon;

import java.util.ArrayList;
import java.util.Scanner;

public class P2606_4 {

	static ArrayList<Integer> arr,his;
	static int h=0;

	static void sol(int in) {
		his.add(in);
		for(int i=0;i<arr.size();i++) {
			if(arr.get(i)==in) {
				if(i%2==0)
					if(!his.contains(arr.get(i+1)))
						sol(arr.get(i+1));
					else 
						if(!his.contains(arr.get(i+1)))
							sol(arr.get(i-1));
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int N=s.nextInt(),M=s.nextInt();
		arr=new ArrayList<Integer>();
		his=new ArrayList<Integer>();
		for(int i=0;i<M;i++) {
			arr.add(s.nextInt());
			arr.add(s.nextInt());
		}
		sol(1);
		System.out.println((his.size()-1));
	}
}