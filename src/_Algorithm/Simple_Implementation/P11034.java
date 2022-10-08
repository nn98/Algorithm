package _Algorithm.Simple_Implementation;

import java.util.*;

public class P11034 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		while(s.hasNext()) {
			String[]a=s.nextLine().split(" ");
			Arrays.sort(a);
			int i=Integer.parseInt(a[1])-Integer.parseInt(a[0]),j=Integer.parseInt(a[2])-Integer.parseInt(a[1]);
			System.out.println((i<j?j:i)-1);
		}
	}

}