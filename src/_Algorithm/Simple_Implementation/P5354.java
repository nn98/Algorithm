import java.util.Scanner;

public class P5354 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m,i,j;
		for(;n-->0;) {
			m=s.nextInt();
			i=0;
			for(;i<m;i++) {
				for(j=0;j<m;j++) {
					System.out.print((i<1|i==m-1|j<1|j==m-1?"#":"J")+(j==(m-1)?"\n":""));
				}
			}
			System.out.println();
		}
	}

}
