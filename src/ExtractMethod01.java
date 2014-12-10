
public class ExtractMethod01 {

	void printOwing(){
		Enumeration e = _orders.elements();
		double outstanding = 0.0;
		
		//배너 출력 
		System.out.println("**********************");
		System.out.println("******* 고객 외상 *****");	
		System.out.println("**********************");
		
		//외상액 계산
		while(e.hasMoreElements()){
			Order each = (Order) e.nextElement();
			outstanding += each.getAmount();
		}
		
		//세부 내역 출력
		System.out.println("고객명 : " + _name);
		System.out.println("외상액 : " + outstanding);
	}

}
