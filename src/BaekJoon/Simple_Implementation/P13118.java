package BaekJoon.Simple_Implementation;
import java.util.Scanner;
class Main{
	public static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int a[]=new int[4],i=0,j,r=0;
		for(;i<4;a[i++]=s.nextInt());
		j=s.nextInt();
		for(i=0;i<4;r=j==a[i++]?i:r);
		System.out.print(r);
	}
}
