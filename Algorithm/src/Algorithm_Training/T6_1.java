package Algorithm_Training;

import java.util.Scanner;

/*
 * class Diagram(int c, int x,int y,int r) {
	int c,x,y,r;
	public Diagram(int c,int x,int y,int r) {
		this.c=c;
		this.x=x;
		this.y=y;
		this.r=r;
	}


}
 */
public class T6_1 {
	

	public static void main(String[] args) {
		/*		3
		 * 1 10 10 7
	2 50 10 7
	3 10 50 5
	4 50 50 5
	5 30 32 20	2
	6 34 24 4	1
	7 30 74 20	4
	8 24 77 10
	9 29 77 3
	10 42 77 7	5
	11 44 77 3	6
		 */
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		int[][][][] diagram=new int[number+1][1][1][1];
		for(int i=0;i<number;i++) {
			int count=s.nextInt(),x=s.nextInt(),y=s.nextInt(),r=s.nextInt();
		}
		int from=s.nextInt(),to=s.nextInt();
	}

	

}