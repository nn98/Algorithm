package BaekJoon;
import java.util.*;
public class P1149_S{
	static int q(int x,int y){return x>y?y:x;}
    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
    	int l=s.nextInt(),m=0,n=0,o=0;
    	for(int i=0,r,g,b;i<l;i++) {r=s.nextInt()+q(n,o);g=s.nextInt()+q(m,o);b=s.nextInt()+q(m,n);m=r;n=g;o=b;}
    	System.out.println(q(m,q(n,o)));
    }
}