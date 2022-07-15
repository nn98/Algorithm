package _Algorithm.Math;

public class P20499 {

	public static void main(String[] args) {
		String[]a=new java.util.Scanner(System.in).next().split("/");
		System.out.println(a[1].equals("0")|(Integer.parseInt(a[0])+Integer.parseInt(a[2])<Integer.parseInt(a[1]))?"hasu":"gosu");
	}

}
