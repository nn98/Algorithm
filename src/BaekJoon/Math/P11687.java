package BaekJoon.Math;

public class P11687 {

	public static void main(String[] args) {
		int f=0;
		long v=0,i,n=new java.util.Scanner(System.in).nextInt();
		for(;;) {
			v+=5;
			for(i=v;i>4;) {
				f++;
//				System.out.println(f+" "+i);
				if(i/5%5==0)i/=5;
				else i=1;
			}
			if(f>=n){
				if(f>n)n=-1;
				else n=v;
				System.out.print(n);
				return;
			}
		}
	}

}
