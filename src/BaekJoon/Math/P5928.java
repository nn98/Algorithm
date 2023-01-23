package BaekJoon.Math;
import java.util.*;
public class P5928 {
	public static void main(String[]z){
		Scanner s=new Scanner(System.in);
		int n=1440*s.nextInt()+60*s.nextInt()+s.nextInt()-16511;
		System.out.print(n<0?-1:n);
	}
}