package sec05_thismethod.EX01_ThisMethod_1;

// 클래스의 정의

class A{
	A(){
		System.out.println("첫 번째 생성자");
	}
	A(int a){
		System.out.println("두 번째 생성자");
	}
	void abc(){
		// this(); // 메서드에서는 this() 메서드 사용 불가능
	}
	
}

public class ThisMethod_1 {
	
	public static void main(String[]args) {
		
		/* 7.4.2 클래스 내 다른 생성자를 호출하는 this() 메서드
		   
		   this() 메서드는 this 키워드와 매우 비슷하게 생겼지만 의미는 전혀 다므르로 주의가 필요함. this() 메서드는 자신이 속한 클래스
		   내부의 다른 생성자를 호출하는 명령임. 만일 this(3)이라면 A(3), 즉 int 데이터 하나를 입력받는 생성자를 호출하라는 의미임.
		   
		 */
		
		
	}
	
}
