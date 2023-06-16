package Algorithm_Practice._School.Algorithm_03_1;
import java.util.Comparator;

public class PersonNameComparator implements Comparator<Person> {
	//Name Comparator�̶� �ص� compare�� age����
	@Override
	public int compare(Person p1, Person p2) {
		int r = p1.name.compareTo(p2.name); // ���� �̸�(name)�� ���Ѵ�.
		if (r != 0) return r; // �̸��� ���� �ʴٸ�, �̸� �� ����� �����Ѵ�.
		return p1.age - p2.age; // �̸��� ���ٸ�, ����(age) �� ����� �����Ѵ�.
	}
}