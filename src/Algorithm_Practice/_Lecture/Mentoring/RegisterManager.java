package Algorithm_Practice._Lecture.Mentoring;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class RegisterManager {//��û�� ���, ������ �Ի�, ��û�� ���� ��
	ArrayList<Register> list = new ArrayList<>();
	Scanner s=new Scanner(System.in);
	int com=1;
	void regist() {//��û�� ��� ���
		System.out.println("===�Ʒ� ������ �Է��ϼ���. ===");
		System.out.print("������ �̸�: ");
		String name=s.next();
		System.out.print("�ξ簡�� ��: ");
		int fmlnum=s.nextInt();
		String number=this.computeRegID();
		int give=this.computeFund(fmlnum);
		Register r=new Register(name,number,fmlnum,give);
		list.add(r);
		System.out.println();
	}

	String computeRegID() {//�� �ڸ� ���ڿ��� ������ ��Ϲ�ȣ ��� ���
		return String.format("%03d",com++);
	}
	int computeFund(int count) {//�ξ簡�� ���� ���� ������ ��� ���
		switch(count) {
		case 0:
			return 40;
		case 1:
			return 60;
		case 2:
			return 80;
		default:
			return 100;
		}
	}
	void showAll() {//��ü ��û�� ���� ��� ���
		Iterator<Register> i=list.iterator();
		while(i.hasNext()) {
			Register r=i.next();
			System.out.println("--------------------------");
			System.out.println("�ξ簡�� ��: "+r.getNumber());
			System.out.println("������ �̸�: "+r.getName());
			System.out.println("�ξ簡�� ��: "+r.getFmlnum());
			System.out.println("��� ������: "+r.getGive());
		}
	}

}