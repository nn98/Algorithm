package BaekJoon;

import java.util.Scanner;

public class P1016 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		long min=s.nextLong(),max=s.nextLong(),sum=0;
		boolean[] arr=new boolean[(int)(max-min+1)];
		for(int i=2;;i++) {
			long p=(long) Math.pow(i, 2),add=p;
			if((p-min)>=arr.length) break;
			//			if((p-min)<0) continue;
			//			if(p==1) continue;
			while((p-min)<arr.length) {
				//				System.out.println(p);
				if(!((p-min)<0)) arr[(int)(p-min)]=true;
				p+=add;
			}
		}
		//		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++) if(!arr[i]) sum++;
		System.out.println(sum);
	}

}