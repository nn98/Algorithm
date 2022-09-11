package _Algorithm.Simple_Implementation;

import java.util.Scanner;

public class P4892 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int c=0,i;
		for(;;){
			i=s.nextInt();
			if(i<1)break;
			i*=3;
			System.out.println(++c+". "+(i%2<1?"even "+i/2*3/9:"odd "+(i+1)/2*3/9));
		}
	}

}
