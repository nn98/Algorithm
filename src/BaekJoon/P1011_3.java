package BaekJoon;
import java.util.Scanner;
public class P1011_3 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i,a,b,j;
		for(;n-->0;) {
			i=1;
			a=s.nextInt();
			b=s.nextInt();
			j=0;
			for(;;){
				a+=i;
				j++;
				if(a>=b)break;
				b-=i;
				j++;
				if(a>=b)break;
				i++;
			}
			System.out.println(j);
		}
	}
}