package BaekJoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P1300 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),k=s.nextInt(),i=1,x=1,y=1,t=1;
		List<Integer>l=new ArrayList<>();
		for(;i<=n*n;i++) {
			t=x*y;
			l.add(t);
			if(i==k)break;
//			System.out.println(t);
//			if(i==k) {
//				System.out.print(t);
//				break;
//			}
//			if(x!=y)i++;
//			if(i==k) {
//				System.out.print(t);
//				break;
//			}
			y++;
			if(y>n) {
				y=1;
				x++;
			}
		}
		Collections.sort(l);
		System.out.print(l+" "+l.get(k-1));
	}

}
