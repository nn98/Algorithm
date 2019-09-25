package ConTest;

import java.util.Scanner;

public class C442_1_3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int L=s.nextInt(),arr[][]=new int[3][3];
		boolean r=true,result=true;
		s.nextLine();
		String[] input=s.nextLine().split(" ");
		//		System.out.println(Arrays.toString(input));
		for(int i=0;i<input.length;i++) {
			int t=Integer.parseInt(input[i])-1,a=t/3,b=t%3;
			//			System.out.println(a+" "+b);
			if(r) r=false;
			else {
				if(arr[a][b]==1) {
					result=false;
					break;
				}

				boolean c=false;
				if(a-1>=0) {
					if(arr[a-1][b]==1) 
						c=true;
					if(b-1>=0) {
						if(arr[a-1][b-1]==1) 
							c=true;
					}
					if(b+1<3) {
						if(arr[a-1][b+1]==1) 
							c=true;
					}
				}
				if(a+1<3) {
					if(arr[a+1][b]==1) 
						c=true;
					if(b-1>=0) {
						if(arr[a+1][b-1]==1) 
							c=true;
					}
					if(b+1<3) {
						if(arr[a+1][b+1]==1) 
							c=true;
					}
				}
				if(b-1>=0) 
					if(arr[a][b-1]==1) 
						c=true;
				if(b+1<3)
					if(arr[a][b+1]==1) 
						c=true;
				if(!c) {
					System.out.println(t);
					result=false;
					break;
				}

			}
			arr[a][b]=1;
			//			for(int j=0;j<L;j++) {
			//				arr[i][j]=i*L+(j+1);
			//				System.out.println(arr[i][j]);
			//			}
		}
		for(int i=0;i<arr.length;i++) { 
			for(int j=0;j<arr[i].length;j++)
				System.out.print(arr[i][j]);
			System.out.println();
		}
		if(result) System.out.println("YES");
		else System.out.println("NO");
	}
}
