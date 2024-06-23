package sec02_interface.EX10_StaticMethod;

interface A{
	static void abc() {
		System.out.println("A 인터페이스 내의 정적 메서드");
	}
}

public class StaticMethod {

	public static void main(String[]args) {
		
		/* 자바 8 이후부터 추가된 인터페이스의 두 번째 기능은 static 메서드를 포함할 수 있단느 것임.
		   이는 클래스 내부의 정적 메서드와 동일한 기능으로, 다음과 같이 객체를 생성하지 않고
		   '인터페이스명.정적 메서드명'의 방식으로 바로 호출할 수 있음.
		   
		   인터페이스 내의 정적 메서드 호출
		   
		   인터페이스명.정적 메서드명
		   
		  interface A{
			 static void abc() {}
		  }
		  
		  A.abc();
		  
		 */

		A.abc();
		
	}
	
}
