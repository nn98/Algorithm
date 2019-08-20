import java.util.Scanner;

public class P1966 {

	static class Doc{
		int j,v;
		Doc(int j,int v) {
			this.j=j;
			this.v=v;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++) {
			int a=s.nextInt(),b=s.nextInt(),max=-1;
			Doc[] arr=new Doc[a];
			for(int j=0;j<a;j++) {
				int v=s.nextInt();
				if(v>max) max=v;
				arr[j]=new Doc(j,v);
			}
			int r=0;
			boolean c=true;
			for(int j=0;c;j++) {
				if(arr[j%a].v==max) {
					if(j%a==b) c=false;
					r++;
					arr[j%a].v=-1;
					max=-1;
					for(Doc d:arr) if(d.v>=max) max=d.v;
				}
			}
			System.out.println(r);
		}
	}
}
