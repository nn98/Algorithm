package _Algorithm.Two_Pointer;

import java.util.Scanner;

public class P8726_3 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),k=s.nextInt(),i=1,j=-1,c,v=0,r=n+1;
		s.nextLine();
		String[]a=s.nextLine().split(" ");
		c=a[0].equals("0")?1:0;
		for(;i<n-1;) {
			while(c<k&v<n-1) {
				v++;
				if(a[v].equals("0"))c++;
			}
			if(c==k)r=r<v-i+1?r:v-i+1;
			if(a[i].equals("0"))c--;
			i++;
		}
		System.out.print(r==n+1?"NIE":r);
	}

}