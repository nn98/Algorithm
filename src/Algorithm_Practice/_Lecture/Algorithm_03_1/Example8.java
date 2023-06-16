package Algorithm_Practice._School.Algorithm_03_1;

public class Example8 {

	static void swap(Person a[], int i, int j) {
		Person temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	// bubble sort
	static void bubbleSort(Person a[], int n) {
		PersonNameComparator p=new PersonNameComparator();
		for(int j=0;j<a.length;j++) {
			for(int i=0;i<a.length-1;i++) {
				if(p.compare(a[i], a[i+1])>0)
					swap(a,i,i+1);
			}
		}

	}
	static void print(Person a[], int n) {
		String r="[ ";
		for (Person i:a)
			r+=i.toString()+" ";
		System.out.println(r+="]");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] a= { //�׽�Ʈ�� ȫ�浿 ����� �߰�
				new Person("ȫ�浿", 18), new Person("ȫ�浿", 19), new Person("�Ӳ���", 22), new Person("�̸���", 17),
				new Person("����ġ", 23), new Person("��û", 16), new Person("�����", 38) , new Person("�����", 35) };
		bubbleSort(a, a.length);
		print(a, a.length);
	}

}
