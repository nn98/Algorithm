package BaekJoon.Math;
import java.util.*;
public class P16204 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt(),k=s.nextInt(),a=n-m,b=n-k;
		System.out.println(Math.min(a, b)+Math.min(m, k));
	}
}