package list01_Extract_Method;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {

	String _name;
	
	Vector<Integer> orders = new Vector<Integer>();
	
	void printOwing() {
		Enumeration e = orders.elements();
		double outstanding = 0.0;
		
		printBanner();
		
		//outstanding 계산
		while (e.hasMoreElements()) {
			Order each = (Order) e.nextElement();
			outstanding += each.getAmount();
		}
		
		//상세 정보 표시
		System.out.println("name:"+_name);
		System.out.println("name:"+outstanding);
		
	}
	
	void printBanner(){
		//배너 표시
		System.out.println("********************");
		System.out.println("Customer Owes");
		System.out.println("********************");
	}
	
}
