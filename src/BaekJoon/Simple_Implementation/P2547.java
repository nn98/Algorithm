package BaekJoon.Simple_Implementation;
import java.math.*;
import java.util.*;
class P2547{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i,j;
		BigInteger u;
		for(;n-->0;) {
			for(i=s.nextInt(),j=0,u=BigInteger.ZERO;i-->0;u=u.add(s.nextBigInteger()),j++);
			System.out.println(u.remainder(new BigInteger(""+j)).equals(BigInteger.ZERO)?"YES":"NO");
		}
	}
}