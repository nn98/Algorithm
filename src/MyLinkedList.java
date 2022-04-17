
public class MyLinkedList {

	private Node head;//리스트 첫번째 노드를 가리킬 변수
	private int listLength;//리스트 길이(노드 개수)
	
	//노드 구조를 표현하는 클래스
	private class Node{
		String data;
		Node link;
	}

	//생성자 - 공백 리스트 생성
    public MyLinkedList() { 
    	this.head=null;
    	this.listLength=0;
    }
    
    //  add - 정수값을 매개변수로 받아 리스트 맨 뒤에 삽입
    public void add(int item) { 
    	Node newNode = new Node();//새 노드 생성
    	newNode.data = Integer.toString(item);// 새 노드에 데이터 저장
    	newNode.link = null;// 새 노드의 링크에 null 저장
    	
    	if(head==null) {// 첫 노드가 널값이면
    		head=newNode;//새 노드를 저장
    		listLength++;// 리스트 길이 1 증가
    	}
    	else {
    		Node temp=head;// temp에 첫 노드 저장
    		while(temp.link!=null)//마지막 노드로 이동
    			temp=temp.link;
    		temp.link=newNode;//마지막 노드 뒤에 새 노드 추가
    		listLength++;// 리스트 길이 1 증가    		
    	}	
    }
    
    //remove - 인덱스를 매개변수로 받아 인덱스 위치의 원소를 삭제하여 리턴
    public int remove(int index) { 
    	String deleted1;//삭제 대상 문자열 변수
    	int deleted2; //삭제 대상 정수 변수
    	
    	if(head==null)//공백 리스트인 경우
    		return 1;
    	if(head.link==null)//리스트 원소가 하나인 경우
    	{
    		deleted1=head.data;//삭제할 데이터 저장
    		head=null;// 하나뿐인 데이터 삭제
    		deleted2=Integer.parseInt(deleted1);//int로 반환을 위해 형변환
        	listLength--;//리스트 길이 1감소
    		return deleted2;
    	}
    	
    	if(index==0)//맨 앞노드 삭제하기
    	{
    		deleted1=head.data;//삭제할 데이터 저장
    		head=head.link;//맨 앞노드 제거
    		deleted2=Integer.parseInt(deleted1);//int로 반환을 위해 형변환
        	listLength--;//리스트 길이 1감소
    		return deleted2;
    	}
    	
    	else// 중간노드 삭제하기
    	{
    		Node pre=head;//첫 노드 저장
    		Node temp=head.link;// 두번째 노드 저장
    		
    		while(temp.link != null && index-1>0 )//노드를 이동(인덱스가 가리키는 곳까지)
    		{
    			pre= temp;//노드 이동
    			temp=temp.link;// 노드 이동
 			
    			index--;//인덱스 1감소
    		}
    		deleted1 = temp.data;//삭제할 데이터 저장
    		pre.link=temp.link;//temp 데이터 삭제
    		
    		deleted2=Integer.parseInt(deleted1);//int로 반환을 위해 형변환
        	listLength--;//리스트 길이 1감소
    		return deleted2;
    	}	
    }
    
    //  toString 오버라이드 - 리스트 원소들을 괄호 ( ) 안에 나열한 문자열을 리턴 - 반드시 [ ]가 아니라 ( )
    @Override
    public String toString() {
    	StringBuffer result = new StringBuffer("(");
    	Node temp = head;
    	if(listLength > 0) {
    		for(int i=0;i<listLength-1;i++) {
    			result.append(i+", ");
    			temp = temp.link;
    		}
    		result.append(temp.data);
    	}
    	result.append(")");
    	return result.toString();
    }
}
