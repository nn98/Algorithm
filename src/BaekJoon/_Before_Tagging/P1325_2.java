package BaekJoon._Before_Tagging;
import java.util.ArrayList;
import java.util.Scanner;

public class P1325_2 {

	static ArrayList<Integer>[] arr;
	static boolean[] his;
	static int[] c;
	
	static int sol(int index) {
		if(his[index]) return 0;
		his[index]=true;
		int r=1;
		if(arr[index]==null) return c[index]=r;
		for(int i=0;i<arr[index].size();i++) {
			if(c[arr[index].get(i)]!=0) r+=c[arr[index].get(i)];
			else r+=sol(arr[index].get(i));
		}
		return c[index]=r;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt()+1,m=s.nextInt(),max=0;
		arr=new ArrayList[n];
		c=new int[n];
		for(int i=0;i<m;i++) {
			int a=s.nextInt(),b=s.nextInt();
			if(arr[b]==null) arr[b]=new ArrayList<>();
			arr[b].add(a);
		}
//		for(int i=0;i<n;i++) {
//			if(arr[i]!=null)
//			System.out.println(i+" "+arr[i].toString());
//		}
		for(int i=1;i<n;i++) {
			his=new boolean[n];
			c[i]=sol(i);
			max=max>c[i]?max:c[i];
		}
		for(int i=1;i<n;i++) {
			if(c[i]==max) System.out.print(i+" ");
		}
	}
}