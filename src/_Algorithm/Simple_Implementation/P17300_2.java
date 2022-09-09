package _Algorithm.Simple_Implementation;
// 원클의 즐거움
import java.util.Scanner;

public class P17300_2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),a[]=new int[10],i=0,j,p=0,r=0;
		for(;i++<n&r<1;) {
			j=s.nextInt();
			a[j]++;
			if(a[j]>1)r++;
			if(i>1)
				switch(j) {
				case 1:
					switch(p) {
					case 3:
						if(a[2]<1)r++;
						break;
					case 7:
						if(a[4]<1)r++;
						break;
					case 9:
						if(a[5]<1)r++;
						break;
					}
					break;
				case 2:
					switch(p) {
					case 8:
						if(a[5]<1)r++;
						break;
					}
					break;
				case 3:
					switch(p) {
					case 1:
						if(a[2]<1)r++;
						break;
					case 7:
						if(a[5]<1)r++;
						break;
					case 9:
						if(a[6]<1)r++;
						break;
					}
					break;
				case 4:
					switch(p) {
					case 6:
						if(a[5]<1)r++;
						break;
					}
					break;
				case 6:
					switch(p) {
					case 4:
						if(a[5]<1)r++;
						break;
					}
					break;
				case 7:
					switch(p) {
					case 3:
						if(a[5]<1)r++;
						break;
					case 1:
						if(a[4]<1)r++;
						break;
					case 9:
						if(a[8]<1)r++;
						break;
					}
					break;
				case 8:
					switch(p) {
					case 2:
						if(a[5]<1)r++;
						break;
					}
					break;
				case 9:
					switch(p) {
					case 3:
						if(a[6]<1)r++;
						break;
					case 7:
						if(a[8]<1)r++;
						break;
					case 1:
						if(a[5]<1)r++;
						break;
					}
					break;
				}
			p=j;
		}
		System.out.print(r<1?"YES":"NO");
	}

}
