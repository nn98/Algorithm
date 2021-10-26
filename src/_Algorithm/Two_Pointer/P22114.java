package _Algorithm.Two_Pointer;
import java.util.Scanner;
public class P22114 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),k=s.nextInt(),a[]=new int[n-1],i=0,j=0,r=0,u=1,p=1;
		s.nextLine();
		for(String b:s.nextLine().split(" "))a[i++]=Integer.parseInt(b);
		i=0;
		for(;j<n-1;) {
			if(a[j++]>k) {
				if(p==0){
					for(;p==0;) {
						if(a[i++]>k)p--;
						u--;
					}
				}
				p++;
			}
			u++;
			r=r>u?r:u;
		}
		System.out.println(r);
	}
}