package Algorithm;
import java.util.Arrays;

public class Main {
	static void swap(int[] a, int i, int j) {
		int v=a[i];
		a[i]=a[j];
		a[j]=v;
	}
	static void swapS(String[] a, int i, int j) {
		String v=a[i];
		a[i]=a[j];
		a[j]=v;
	}
	static void swapP(Person[] a, int i, int j) {
		Person v=a[i];
		a[i]=a[j];
		a[j]=v;
	}
	static void swapC(char[] a, int i, int j) {
		char v=a[i];
		a[i]=a[j];
		a[j]=v;
	}
	public static void sort1(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			int v=-1,t=arr[i],s=arr[i];
			for(int j=i;j<arr.length;j++) {
				if(t>=arr[j]) {
					t=arr[j];
					v=j;
				}
			}
			arr[i]=arr[v];
			arr[v]=s;
		}
	}
	public static void sort2(int[] arr) {
		int v=-1,t=arr[0],s=arr[0];
		for(int j=0;j<arr.length;j++) {
			if(t>=arr[j]) {
				t=arr[j];
				v=j;
			}
		}
		arr[0]=arr[v];
		arr[v]=s;
		if(arr.length==2) return;
		sort2(Arrays.copyOfRange(arr, 1, arr.length));
	}
	public static void sort3(int[] arr) {
		boolean f=true;
		for(int k=0;k<arr.length-1;k++) {
			for(int i=0;i<arr.length-1;i++) {
				if(arr[i]>arr[i+1]) {
					swap(arr,i,i+1);
					f=false;
				}
			}
			if(f) return;
		}
	}
	public static void sort4(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<i;j++) {
				if(arr[i]<arr[j]) swap(arr,i,j);
			}
		}
	}
	public static void sort5(String[] arr) {
		//imp by bubble
		boolean f=true;
		for(int k=0;k<arr.length-1;k++) {
			for(int i=0;i<arr.length-1;i++) {
				if(arr[i].compareTo(arr[i+1])>0) {
					swapS(arr,i,i+1);
					f=false;
				}
			}
			if(f) return;
		}
	}
	public static void sort6(Person[] arr) {
		//imp by bubble
		PersonNameComparator c=new PersonNameComparator();
		boolean f=true;
		for(int k=0;k<arr.length-1;k++) {
			for(int i=0;i<arr.length-1;i++) {
				if(c.compare(arr[i], arr[i+1])>0) {
					swapP(arr,i,i+1);
					f=false;
				}
			}
			if(f) return;
		}
	}
	public static int[] sep(int[] arr) {
		int f=0,t=arr.length-1;
		int[] r=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				r[f]=arr[i];
				f++;
			} else if(arr[i]%2==1) {
				r[t]=arr[i];
				t--;
			}
		}
		return r;
	}
	public static void sort7(char[] arr) {
		boolean f=true;
		for(int k=0;k<arr.length-1;k++) {
			for(int i=0;i<arr.length-1;i++) {
				if(arr[i]>arr[i+1]) {
					swapC(arr,i,i+1);
					f=false;
				}
			}
			if(f) return;
		}
	}
	public static char[] sort8(char[] arr) {
		int[] a=new int[26];
		char[] r=new char[arr.length];
		int index=0;
		for(char i:arr) 
			a[(int)i-'a']++;
		//¹è¿­ È®ÀÎ
		System.out.println(Arrays.toString(a));
		/*
		 * ½Ï´Ù b°¡µÊ
		  for(int i:a) {
			if(index==arr.length) break;
			for(int j=i;j>0;j--) {
				r[index++]=(char)(i+97);
			}
		}
		 */
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {
				for(int j=a[i];j>0;j--) {
					r[index++]=(char)(i+97);
				}
			}
		}
		return r;
	}
	public static char[] sort9(char[] arr) {
		int c=0;
		char[] r=new char[arr.length];
		Arrays.fill(r, '0');
		for(char i:arr) 
			if(i=='1') c++;
		for(int i=r.length-1;c!=0;i--) {
			r[i]='1';
			c--;
		}
		return r;
	}
	//quickSort ÀÌÈÄ¿£ ÄüÀ¸·Î ±¸ÇöÀÌ Á¤´ä
	public static void main(String[] args) {
		int[] arr = {5,8,4,25,6,8,4,5,2,4};
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(Arrays.copyOfRange(arr, 1, arr.length)));
		sort4(arr);
		System.out.println(Arrays.toString(arr));
		String[] arr1 = {"s","e","z","E","y","r","A","L","t","x"};
		System.out.println(Arrays.toString(arr1));
		sort5(arr1);
		System.out.println(Arrays.toString(arr1));
		Person[] p=new Person[5];
		p[0]=new Person("±è¤±¤±",21);
		p[1]=new Person("¹Ú¤²¤²",21);
		p[2]=new Person("ÀÌ¤·¤·",21);
		p[3]=new Person("±è¤±¤±",25);
		p[4]=new Person("¹Ú¤²¤²",23);
		for(Person i:p) 
			System.out.println(i.toString());
		System.out.println();
		sort6(p);
		for(Person i:p) 
			System.out.println(i.toString());
		int[] arr2 = {5,8,4,25,6,8,4,5,2,4};
		System.out.println(Arrays.toString(arr2));
		arr2=sep(arr2);
		System.out.println(Arrays.toString(arr2));
		char[] arr3 = {'t','e','z','w','g','s','x','n','m','o'};
		System.out.println(Arrays.toString(arr3));
		sort7(arr3);
		System.out.println(Arrays.toString(arr3));
		char[] arr4 = {'t','e','z','w','g','s','x','n','m','o'};
		System.out.println(Arrays.toString(arr4));
		arr4=sort8(arr4);
		System.out.println(Arrays.toString(arr4));
		char[] arr5 = {'0','1','1','1','0','0','1','0','1','1'};
		System.out.println(Arrays.toString(arr5));
		arr5=sort9(arr5);
		System.out.println(Arrays.toString(arr5));
	}
}
