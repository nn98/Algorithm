package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;
public class P16503 {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		String[]a=s.nextLine().split(" ");
		int q[]=new int[2],i=1,j=0,k=0;
		for(;j<2;i+=2,j++,k+=2)
			switch(a[i]) {
			case "+":
				q[j]=Integer.parseInt(a[k])+Integer.parseInt(a[k+2]);
				break;
			case "-":
				q[j]=Integer.parseInt(a[k])-Integer.parseInt(a[k+2]);
				break;
			case "*":
				q[j]=Integer.parseInt(a[k])*Integer.parseInt(a[k+2]);
				break;
			case "/":
				q[j]=Integer.parseInt(a[k])/Integer.parseInt(a[k+2]);
				break;
			}
		System.out.println(Arrays.toString(q));
	}
}