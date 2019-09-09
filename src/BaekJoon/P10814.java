package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class P10814 {
	//출력실수
	static class Person implements Comparable{
		int age;
		String n;
		Person(int a,String n) {
			this.age=a;
			this.n=n;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + age;
			result = prime * result + ((n == null) ? 0 : n.hashCode());
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
			Person other = (Person) obj;
			if (age != other.age)
				return false;
			if (n == null) {
				if (other.n != null)
					return false;
			} else if (!n.equals(other.n))
				return false;
			return true;
		}
		@Override
		public int compareTo(Object arg0) {
			// TODO Auto-generated method stub
//			if(!arg0.getClass().equals(this)) return -1;
			Person o=(Person)arg0;
			return this.age-o.age;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
		s.nextLine();
		Person[] arr=new Person[n];
		for(int i=0;i<n;i++) {
			String in=s.nextLine(),co[]=in.split(" ");
			arr[i]=new Person(Integer.parseInt(co[0]),co[1]);
		}
		Arrays.sort(arr);
//		Arrays.parallelSort(arr);
		for(int i=0;i<n;i++) System.out.println(arr[i].age+" "+arr[i].n);
	}
}
