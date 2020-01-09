package BaekJoon;

import java.util.*;
public class P11286 {

	public static void main(String[]z) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m;
//		Queue q=new PriorityQueue<>(new Comparator() {
//			@Override
//			public int compare(Object o1, Object o2) {
//				if (Math.abs((int) o1) > Math.abs((int) o2) || (Math.abs((int)o1) == Math.abs((int)o2) && (int)o1 > (int)o2)) return 1;
//                else return -1;
//			}
//        });
		PriorityQueue<Integer> q=new PriorityQueue<>((a,b)->{return Math.abs(a)==Math.abs(b)?(a-b):(Math.abs(a)-Math.abs(b));});
		for(;n-->0;) {
			m=s.nextInt();
			if(m==0)System.out.println(q.isEmpty()?0:q.poll());
			else q.add(m);
		}
	}
}