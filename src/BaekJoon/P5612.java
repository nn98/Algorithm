package BaekJoon;
import java.util.*;
public class P5612 {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),r=s.nextInt(),m=0;
		for(;n-->0;r+=s.nextInt()-s.nextInt(),m=m>r?m:r)if(r<0){
			m=0;
			break;
		}
		System.out.print(m);
	}
}