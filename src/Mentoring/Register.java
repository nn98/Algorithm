package Mentoring;

public class Register {
	private String name; //세대주이름
	private String number;//등록번호
	private int fmlnum;//부양가족수
	private int give;//지원금

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