package _Algorithm.Math;

public class T {

	public static void main(String[] args) {
		int a=52*52,b=9,c=16;
		for(;;) {
			System.out.println(a+" "+b*b+" "+c*c);
			if(a<b*b+c*c)break;
			b++;
			c++;
		}
		System.out.println(b+" "+c);
	}
}