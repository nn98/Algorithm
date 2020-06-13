package Mentoring;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class RegisterManager {//신청자 등록, 지원금 게산, 신청자 정보 등
	ArrayList<Register> list = new ArrayList<>();
	Scanner s=new Scanner(System.in);
	int com=1;
	void regist() {//신청자 등록 기능
		System.out.println("===아래 정보를 입력하세요. ===");
		System.out.print("세대주 이름: ");
		String name=s.next();
		System.out.print("부양가족 수: ");
		int fmlnum=s.nextInt();
		String number=this.computeRegID();
		int give=this.computeFund(fmlnum);
		Register r=new Register(name,number,fmlnum,give);
		list.add(r);
		System.out.println();
	}

	String computeRegID() {//세 자리 문자열로 구성된 등록번호 계산 기능
		return String.format("%03d",com++);
	}
	int computeFund(int count) {//부양가족 수에 따른 지원금 계산 기능
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
	void showAll() {//전체 신청자 정보 출력 기능
		Iterator<Register> i=list.iterator();
		while(i.hasNext()) {
			Register r=i.next();
			System.out.println("--------------------------");
			System.out.println("부양가족 수: "+r.getNumber());
			System.out.println("세대주 이름: "+r.getName());
			System.out.println("부양가족 수: "+r.getFmlnum());
			System.out.println("긴급 지원금: "+r.getGive());
		}
	}

}