package Algorithm_Practice._Lecture.Mentoring;

public class Register {
	private String name; //�������̸�
	private String number;//��Ϲ�ȣ
	private int fmlnum;//�ξ簡����
	private int give;//������

	public Register(String name,String number,int fmlnum,int give) {
		this.name = name;
		this.number = number;
		this.fmlnum = fmlnum;
		this.give = give;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getFmlnum() {
		return fmlnum;
	}

	public void setFmlnum(int fmlnum) {
		this.fmlnum = fmlnum;
	}

	public int getGive() {
		return give;
	}

	public void setGive(int give) {
		this.give = give;
	}

}