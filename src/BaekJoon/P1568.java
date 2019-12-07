package BaekJoon;

public class P1568 {

	public static void main(String[] args) {
		int n=new java.util.Scanner(System.in).nextInt(),i=1,j=0;
		for(;n!=0;j++) {
			if(i>n)i=1;
			n-=i++;
		}
		System.out.print(j);
	}

}
