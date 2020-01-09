package BaekJoon;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
public class P11286 {

	public static void main(String[]z) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m;
		Queue q=new PriorityQueue<>(new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				if (Math.abs((int) o1) > Math.abs((int) o2) || (Math.abs((int)o1) == Math.abs((int)o2) && (int)o1 > (int)o2)) return 1;
                else return -1;
			}
        });
		for(;n-->0;) {
			m=s.nextInt();
			if(m==0)System.out.println(q.isEmpty()?0:q.poll());
			else q.add(m);
		}
	}
}