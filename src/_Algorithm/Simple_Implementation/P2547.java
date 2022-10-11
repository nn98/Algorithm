package _Algorithm.Simple_Implementation;
import java.util.*;
class P2547{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i,j,u;
		for(;n-->0;) {
			for(i=s.nextInt(),j=0,u=0;i-->0;u+=s.nextInt(),j++);
			System.out.println(u%j<1?"YES":"NO");
		}
	}
}