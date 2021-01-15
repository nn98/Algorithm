package _Algorithm.Sweeping;

import java.util.Scanner;

public class P1931 {

	static class T{
		int s,e;
		T(int s,int e){
			this.s=s;
			this.e=e;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + e;
			result = prime * result + s;
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			T other = (T) obj;
			if (e != other.e)
				return false;
			if (s != other.s)
				return false;
			return true;
		}
		
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
	}

}
