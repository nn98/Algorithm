package ConTest;

import java.util.Arrays;
import java.util.Scanner;

public class C442_1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int L=s.nextInt(),his[]=new int[L];
		boolean r=true;
		for(int i=0;i<L;i++) {
			int a=s.nextInt();
			System.out.println(Arrays.toString(his));
			for(int j=0;j<i;j++) {
				if(a==his[j]) {
					r=false;
					break;
				}
			}
			if(!r) continue;
			if(i==0) his[i]=a;
			else {
				for(int j=0;j<i;j++) {
					if(a-1==his[j]||a+1==his[j]||a+3==his[j]||a-3==his[j]) {
						r=true;
						break;
					}
					else if(a>3) {
						if(a-4==his[j]) {
							r=true;
							break;
						}
						if(a%3!=0) {
							if(a-2==his[j]) {
								r=true;
								break;
							}
						}
					}
					else {
						r=false;
					}
				}
				if(r) his[i]=a;
			}
		}
		if(r) System.out.println("YES");
		else System.out.println("NO");
	}

}
