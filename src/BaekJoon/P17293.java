package BaekJoon;

import java.util.Scanner;

public class P17293 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		for(int i=N;i>0;i--) {
			if(i>2)
			System.out.printf("%d bottles of beer on the wall, %d bottles of beer.\n"+"Take one down and pass it around, %d bottles of beer on the wall.\n\n",i,i,i-1);
			else if(i==2)
				System.out.printf("%d bottles of beer on the wall, %d bottles of beer.\n"+"Take one down and pass it around, %d bottle of beer on the wall.\n\n",i,i,i-1);
			else if(i==1) 
				System.out.printf("%d bottle of beer on the wall, %d bottle of beer.\n"+"Take one down and pass it around, no more bottles of beer on the wall.\n\n",i,i,i-1);
		}
		if(N==1)
			System.out.printf("No more bottles of beer on the wall, no more bottles of beer.\n" + 
					"Go to the store and buy some more, %d bottle of beer on the wall.", N);
		else
			System.out.printf("No more bottles of beer on the wall, no more bottles of beer.\n" + 
				"Go to the store and buy some more, %d bottles of beer on the wall.", N);
	}

}