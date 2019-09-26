package BaekJoon;

import java.util.Scanner;

public class P3040_C {

	public static void main(String[] args) {
		//Fuck
		Scanner s=new Scanner(System.in);
		int r=0,a[]=new int[9];
		for(int i=0;i<9;i++)r+=a[i]=s.nextInt();
		for(int i=0;i<9;i++)
			for(int j=i+1;j<9;j++)
				if(r-a[i]-a[j]==100)
					for(int k=0;k<9;k++)
						if(k!=i&&k!=j)
							System.out.println(a[k]);
//		System.out.println(Arrays.toString(a));
		
	}

}
