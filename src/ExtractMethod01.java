
public class ExtractMethod01 {

	void printOwing(double previousAmout){
		
		printBanner();
		double outstanding  = getOutstanding(previousAmout * 1.2);
		printDetails(outstanding);
		
	}
	
	void getOutstanding(double initialValue){
		Enumeration e = _orders.elements();
		double result = 0.0;
		//외상액 계산
		while(e.hasMoreElements()){
			Order each = (Order) e.nextElement();
			result += each.getAmount();
		}
		return result;
	}
	
	void printBanner(){
		//배너 출력 
		System.out.println("**********************");
		System.out.println("******* 고객 외상 *****");	
		System.out.println("**********************");
	}
	
	void printDetails (double outstanding){
		//세부 내역 출력
		System.out.println("고객명 : " + _name);
		System.out.println("외상액 : " + outstanding);
	}
	


}
