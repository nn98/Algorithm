package BaekJoon;

public class P13015 {

	public static void main(String[] args) {
		int n=new java.util.Scanner(System.in).nextInt();
		for(int i=1;i<n*2;i++) {
			if(i==1||i==n*2-1) {
				for(int j=0;j<n;j++) System.out.print('*');
				if(i<n)for(int j=0;j<(n-1-i)*2+1;j++)System.out.print(" ");
				else if(i>n)for(int j=0;j<(i-n)*2-1;j++)System.out.print(" ");
				for(int j=0;j<n;j++) System.out.print('*');
			}
			else {
				if(i<=n)
					for(int j=1;j<i;j++)System.out.print(" ");
				else 
					for(int j=0;j<Math.abs(n*2-1-i);j++)System.out.print(" ");
				
				System.out.print("*");
				for(int j=0;j<n-2;j++)System.out.print(" ");
				System.out.print("*");


				if(i<n)for(int j=0;j<(n-1-i)*2+1;j++)System.out.print(" ");
				else if(i>n)for(int j=0;j<(i-n)*2-1;j++)System.out.print(" ");

				if(i!=n)System.out.print("*");
				for(int j=0;j<n-2;j++)System.out.print(" ");
				System.out.print("*");
//				System.out.print(Math.abs((n-1-i)*2)+1);
			}
			System.out.println();
		}
	}

}
