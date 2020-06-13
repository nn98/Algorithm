package Mentoring;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	// 이너클래스로 만든거니까 알아서 나눠
	static class Register {
		
		private String name; 	//세대주이름
		private String number;	//등록번호
		private int fmlnum;		//부양가족수
		private int give;		//지원금

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
	
	static class RegisterManager {							//신청자 등록, 지원금 게산, 신청자 정보 등
		ArrayList<Register> list = new ArrayList<>();		//리스트 객체 생성할때<> 안에 리스트에 넣을 객체 지정
		Scanner s=new Scanner(System.in);					//스캐너를 메소드 안에 넣으면 메소드 실행할때마다 생성됨
		int com=1;											//등록번호 저장할 정수형 변수
		
		//과제할땐 모든 메소드에 public등 생성 지정자 붙여야 감점안당함
		public void regist() {								//신청자 등록 기능
			System.out.println("===아래 정보를 입력하세요. ===");	//입력 안내문
			System.out.print("세대주 이름: ");					//대충봐 ㅅㅂ
			String name=s.next();							
			System.out.print("부양가족 수: ");					
			int fmlnum=s.nextInt();							
			String number=this.computeRegID();				//아래 등록번호 만드는 computeRegID메소드 실행
			int give=this.computeFund(fmlnum);				//computeFund메소드, 부양가족수 매개변수로 전달
			Register r=new Register(name,number,fmlnum,give);
			list.add(r);
			System.out.println();							// 출력 양식에 맞춰 개행
		}

		public String computeRegID() {						//세 자리 문자열로 구성된 등록번호 계산 기능
			return String.format("%03d",com++);				//문제설명에 나온대로 String.format사용
		}
		
		public int computeFund(int count) {					//부양가족 수에 따른 지원금 계산 기능
			switch(count) {									//스위치문 기억할리가 없겠죠? if else로 해도 됨
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
		
//		아마 이건 뒤져도 못풀었을듯
		public void showAll() {										//전체 신청자 정보 출력 기능
			Iterator<Register> i=list.iterator();					//이터레이터 생성
			while(i.hasNext()) {									//이터레이터 빌 때까지
				Register r=i.next();								//레지스터 객체 생성
				System.out.println("--------------------------");	//출력
				System.out.println("부양가족 수: "+r.getNumber());
				System.out.println("세대주 이름: "+r.getName());
				System.out.println("부양가족 수: "+r.getFmlnum());
				System.out.println("긴급 지원금: "+r.getGive());
			}
		}

	}
	
	public static void main(String[]z) {
		RegisterManager m=new RegisterManager();			//레지스터매니저 생성
		m.regist();											//등록
		m.regist();											//등록
		m.regist();											//등록
		m.showAll();										//출력
	}
}