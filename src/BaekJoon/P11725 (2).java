import java.util.ArrayList;
import java.util.Scanner;

public class P11725 {

	static int N, config[];
	static boolean[] c;
	static ArrayList<Integer>[] arr;

	static void sol(int s) {
//		System.out.println(s+1);
		if(s==0) {
			for(int i:arr[s]) {
				config[i]=s+1;
				c[i]=true;
			}
		}
		else {
			if(config[s]!=0) {
				for(int i:arr[s]) {
					if(c[i]) continue;
					config[i]=s+1;
					c[i]=true;
				}
			}
			else {
				for(int i:arr[s]) {
					if(c[i]) {
						config[s]=i+1;
						c[s]=true;
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		N=s.nextInt();
		config=new int[N];
		c=new boolean[N];
		arr=new ArrayList[N];
		for(int i=0;i<N;i++) arr[i]=new ArrayList<>();
		for(int i=1;i<N;i++) {
			int a=s.nextInt()-1,b=s.nextInt()-1;
			arr[a].add(b);
			arr[b].add(a);
		}
		//		for(int i=0;i<N;i++) System.out.println(i+" : "+arr[i].toString());
		config[0]=-1;
		for(int i=0;i<N;i++) {
			sol(i);
//			System.out.println(Arrays.toString(config));
		}
		for(int i=1;i<N;i++) System.out.println(config[i]);
	}
}