package _Algorithm.BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P1697_2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt(),i=0,j,l=100001,h[]=new int[l],z,k;
		Queue<Integer>q=new LinkedList();
		q.add(n);
		for(;;) {
			i++;
			z=q.size();
			for(k=0;k<z;k++) {
				j=q.remove();
				h[j]++;
				if(j==m) {
					System.out.print(i-1);
					return;
				}
				else {
					if(j>0&h[j-1]<1) {
						q.add(j-1);
						h[j-1]++;
					}
					if(j+1<l&h[j+1]<1) {
						q.add(j+1);
						h[j+1]++;
					}
					if(j*2+1<l&h[j*2]<1) {
						q.add(j*2);
						h[j*2]++;
					}
				}
			}
		}
	}

}
