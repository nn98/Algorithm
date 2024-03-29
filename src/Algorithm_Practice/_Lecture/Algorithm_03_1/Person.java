package Algorithm_Practice._Lecture.Algorithm_03_1;

public class Person {
	String name;
	int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	@Override
	public boolean equals(Object obj) {
		if ((obj instanceof Person) == false) return false;
		Person p = (Person)obj;
		return (this.name == null ? p.name == null : this.name.equals(p.name)) && this.age == p.age;
	}
	@Override
	public String toString() {
		return String.format("{name=\"%s\", age=%d}", name, age);
	}
}