package _Algorithm.Simple_Implementation;

import java.util.*;
public class P17300 {

    public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt(),a[][]=new int[3][3],j,r;
	s.nextLine();
	for(String i:s.nextLine().split(" ")) {
	    j=Integer.parseInt(i)-1;
	    a[j/3][j%3]++;
	}
	for(int[]i:a) {
	    System.out.println(Arrays.toString(i));
	}
    }

}
