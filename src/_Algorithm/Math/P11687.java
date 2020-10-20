package _Algorithm.Math;

public class P11687 {

	public static void main(String[] args) {
		int n=new java.util.Scanner(System.in).nextInt(),f=0,v=0,i;
		for(;;) {
			v+=5;
			for(i=v;i>4;i/=5,f++);
			if(f>=n){{
				if(f>n)n=-1;
				else n=v;
				System.out.print(n);
				return;
			}
		}
	}

}
