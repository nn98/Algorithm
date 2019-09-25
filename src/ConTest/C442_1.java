package ConTest;

import java.util.Scanner;

public class C442_1 {

	static int[][] arr=new int[3][3];
	
	static boolean check(int i,int j) {
//		System.out.println(i+" "+j);
		if(i<0||i>=3) return false;
		if(j<0||j>=3) return false;
		
		if(arr[i][j]==1) return true;
		else return false;
	}
	
	static boolean sol(int i,int j) {
		
		if(arr[i][j]==1) return false;
		
		return check(i-1,j)||check(i-1,j-1)||check(i-1,j+1)
				||check(i,j+1)||check(i,j-1)
				||check(i+1,j)||check(i+1,j-1)||check(i+1,j+1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int L=s.nextInt();
		boolean r=true,result=true;
		for(int i=0;i<L;i++) {
			int a=s.nextInt()-1;
			if(r) {
				r=false;
				arr[a/3][a%3]=1;
			}
			else {
				if(sol(a/3,a%3)) {
					arr[a/3][a%3]=1;
				}
				else {
					result=false;
				}
			}
		}
		if(result) System.out.println("YES");
		else System.out.println("NO");
	}

}
