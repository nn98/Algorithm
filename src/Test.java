import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
	static class Pair implements Comparable<Pair>{
		final int left;
		final int right;

		public Pair(int left, int right) {
			this.left = left;
			this.right = right;
		}

		public int compareTo(Pair o) {
			int r=0;
			r=Integer.compare(this.left,o.left);
			if(r==0)r=Integer.compare(this.right,this.right);
			return r;
		}

		public String toString() {
			return this.left+" "+this.right;
		}

	}
	public static void main(String[] args) {
		List l=new ArrayList();
		//		l.add("1 2");
		//		l.add("6 7");
		//		l.add("115 22");
		//		l.add("185 21");
		//		l.add("101 2");
		//		l.add("101 25646");
		//		l.add("10949 22");
		l.add(new Pair(1,2));
		l.add(new Pair(6,7));
		l.add(new Pair(115,22));
		l.add(new Pair(185,21));
		l.add(new Pair(101,2));
		l.add(new Pair(100,25646));
		l.add(new Pair(10949,22));
		Collections.sort(l);
		//		int as=0;
		//		
		//		int[][]a= {
		//				{1,2},
		//				{6,7},
		//				{115,22},
		//				{185,21},
		//				{101,2},
		//				{100,25665},
		//				{10949,22}
		//		};
		//
		//		Arrays.sort(a);
		//		for(int[]i:a)System.out.println(Arrays.toString(i));

		System.out.println(l);
	}

}
