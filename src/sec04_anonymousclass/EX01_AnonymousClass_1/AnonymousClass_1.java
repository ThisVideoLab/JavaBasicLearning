package sec04_anonymousclass.EX01_AnonymousClass_1;

interface C{
    public abstract void bcd();
 }

class A1{
	C b = new B();
	void abc() {
		System.out.println("클래스 A의 abc() 메서드"); 
	}
	
	class B implements C {
		public void bcd() {
			System.out.println("클래스 B의 bcd() 메서드");
		}
		
	}
}

class A2 {
	C b = new C() {
		public void bcd() {
			// 메서드 구현
		}
	}; // 익명 클래스 anonymous class의 정의를 마친 후에 해당 인스턴스를 변수 b에 할당하는 표현식을
}      // 마무리하기 위한 마침표임. 

class A{
	C c = new B();
	void abc() {
		c.bcd();
	}
	class B implements C {
		public void bcd() {
			System.out.println("인스턴스 이너 클래스 B의 bcd() 메서드");
		}
		
	}
}



public class AnonymousClass_1 {

	public static void main(String[]args) {
		
		/* 13.2 익명 이너 클래스
		   13.2.1 익명 이너 클래스의 정의와 특징
		   
		   익명 이너 클래스는 말 그대로 '이름을 알 수 없는 이너 클래스;를 의미함. 익명 이너 클래스는 
		   정의도니 이ㅟ치에 따라 분류 할 수 있는데, 클래스의 중괄호 바로 아래에 사용했을 때는 인스턴스
		   익명 이너 클래스, 메서드 내부에서 사용했을 때는 지역 익명 이너 클래스를 의미함. 이는 앞 절의
		   이너 클래스에서 살펴본 바와 같음. 일단은 상단 외부 클래스에 있는 코드들을 통해 알아보도록 하자.
		   
		   먼저 클래스 A1 내부에는 인터페이스 C를 구현 implements 하고 있는 인스턴스 이너 클래스 B가
		   있음. 필드에는 인터페이스 C 타입의 참조 변수가 있고, 생성자 B()로 객체를 생성해 초기화 함.
		   그리고 abc() 메서드가 정의돼 있음. 즉 클래스 A1에서는 C 타입 객체를 생성하기 위해 이너 클래스를
		   B라는 이름으로 직접 정의해 사용함. 이를 익명 이너 클래스로 정의한 클래스 A2를 살펴보면, C타입의
		   생성자를 호출한 후 중괄호 안에 인터페이스에 호팜된 추상 메서드 bcd()를 구현해 표현하고 있음.
		   이렇게 되면 컴파일러는 인터페이스 C를 상속받아 추상 메서드를 구현한 클래스를 내부적으로 생성한 후
		   해당 클래스로 객체를 생성해 참조 변수에 대입함. 즉 익명의 이너 클래스를 생성해 사용하는 것임.
		   
		 */
		
		// - 실습 - 인터페이스를 상속한 이너 클래스를 생성해 인터페이스 객체 생성
		System.out.println("- 실습 - 인터페이스를 상속한 이너 클래스를 생성해 인터페이스 객체 생성");
		System.out.println();
		
		// 객체 생성 및 메서드 호출
		
		A a = new A();
		a.abc();
		
	}
	
}
