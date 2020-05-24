import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
	static class Pair<L,R> {
		static <L,R> Pair<L,R> of(L left, R right){
			return new Pair<L,R>(left, right);
		}
		final L left;

		final R right;

		public Pair(L left, R right) {
			this.left = left;
			this.right = right;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Pair other = (Pair) obj;
			if (left == null) {
				if (other.left != null)
					return false;
			} else if (!left.equals(other.left))
				return false;
			if (right == null) {
				if (other.right != null)
					return false;
			} else if (!right.equals(other.right))
				return false;
			return true;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((left == null) ? 0 : left.hashCode());
			result = prime * result + ((right == null) ? 0 : right.hashCode());
			return result;
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
		System.out.println(l);
	}

}
