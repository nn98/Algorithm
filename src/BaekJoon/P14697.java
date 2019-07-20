package BaekJoon;

import java.util.Scanner;

public class P14697 {
	//브루스포스
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt(),b=s.nextInt(),c=s.nextInt(),sum=s.nextInt(),r=0;
		//? 시간제한 안걸림?
		for(int i=0;i<=50;i++) 
			for(int j=0;j<=50;j++) 
				for(int k=0;k<=50;k++) 
					if(a*i+b*j+c*k==sum) 
						r=1;
		System.out.println(r);
		//No TimeLimit
	}
}
