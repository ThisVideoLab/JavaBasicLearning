package sec05_thismethod.EX01_ThisMethod_1;

// 클래스의 정의

class A{
	A(){
		System.out.println("첫 번째 생성자");
	}
	A(int a){
		this(); // A()를 호출함
		System.out.println("두 번째 생성자");
	}
	void abc(){ // class A와 이름이 다르므로 이것은 메서드임. 메서드 내에서는 this() 사용 불가능
		// this(); // 메서드에서는 this() 메서드 사용 불가능
	}
	
}

public class ThisMethod_1 {
	
	public static void main(String[]args) {
		
		/* 7.4.2 클래스 내 다른 생성자를 호출하는 this() 메서드
		   
		   this() 메서드는 this 키워드와 매우 비슷하게 생겼지만 의미는 전혀 다므르로 주의가 필요함. this() 메서드는 자신이 속한 클래스
		   내부의 다른 생성자를 호출하는 명령임. 만일 this(3)이라면 A(3), 즉 int 데이터 하나를 입력받는 생성자를 호출하라는 의미임.
		   this 매서드를 구성할 때는 반드시 2가지 문법적 규칙을 지켜야 함. 첫번째는 생성자의 내부에서만 사용할 수 있음. 즉 생성자의 내부에서만
		   또 다른 생성자를 호출할 수 있다는 말. 두 번째는 생성자의 첫 줄에 위치해야 함. 이 둘중 어느 하나라도 지켜지지 않으면 오류가 발생함.
		 */
		
		/*- 실습 - this() 메서드의 문법적 특징과 의미*/ System.out.println("- 실습 - this() 메서드의 문법적 특징과 의미");
		
		// 객체 생성
		A a1 = new A();
		System.out.println();
		A a2 = new A(3); // class A(int a)이므로 this()로 생성자 A() 호출한 뒤에, 문구를 출력함. 
		
	}
	
}
