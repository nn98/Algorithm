package Algorithm_Practice._School.Mentoring;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	// �̳�Ŭ������ ����Ŵϱ� �˾Ƽ� ����
	static class Register {
		
		private String name; 	//�������̸�
		private String number;	//��Ϲ�ȣ
		private int fmlnum;		//�ξ簡����
		private int give;		//������

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
	
	static class RegisterManager {							//��û�� ���, ������ �Ի�, ��û�� ���� ��
		ArrayList<Register> list = new ArrayList<>();		//����Ʈ ��ü �����Ҷ�<> �ȿ� ����Ʈ�� ���� ��ü ����
		Scanner s=new Scanner(System.in);					//��ĳ�ʸ� �޼ҵ� �ȿ� ������ �޼ҵ� �����Ҷ����� ������
		int com=1;											//��Ϲ�ȣ ������ ������ ����
		
		//�����Ҷ� ��� �޼ҵ忡 public�� ���� ������ �ٿ��� �����ȴ���
		public void regist() {								//��û�� ��� ���
			System.out.println("===�Ʒ� ������ �Է��ϼ���. ===");	//�Է� �ȳ���
			System.out.print("������ �̸�: ");					//����� ����
			String name=s.next();							
			System.out.print("�ξ簡�� ��: ");					
			int fmlnum=s.nextInt();							
			String number=this.computeRegID();				//�Ʒ� ��Ϲ�ȣ ����� computeRegID�޼ҵ� ����
			int give=this.computeFund(fmlnum);				//computeFund�޼ҵ�, �ξ簡���� �Ű������� ����
			Register r=new Register(name,number,fmlnum,give);
			list.add(r);
			System.out.println();							// ��� ��Ŀ� ���� ����
		}

		public String computeRegID() {						//�� �ڸ� ���ڿ��� ������ ��Ϲ�ȣ ��� ���
			return String.format("%03d",com++);				//�������� ���´�� String.format���
		}
		
		public int computeFund(int count) {					//�ξ簡�� ���� ���� ������ ��� ���
			switch(count) {									//����ġ�� ����Ҹ��� ������? if else�� �ص� ��
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
		
//		�Ƹ� �̰� ������ ��Ǯ������
		public void showAll() {										//��ü ��û�� ���� ��� ���
			Iterator<Register> i=list.iterator();					//���ͷ����� ����
			while(i.hasNext()) {									//���ͷ����� �� ������
				Register r=i.next();								//�������� ��ü ����
				System.out.println("--------------------------");	//���
				System.out.println("�ξ簡�� ��: "+r.getNumber());
				System.out.println("������ �̸�: "+r.getName());
				System.out.println("�ξ簡�� ��: "+r.getFmlnum());
				System.out.println("��� ������: "+r.getGive());
			}
		}

	}
	
	public static void main(String[]z) {
		RegisterManager m=new RegisterManager();			//�������͸Ŵ��� ����
		m.regist();											//���
		m.regist();											//���
		m.regist();											//���
		m.showAll();										//���
	}
}