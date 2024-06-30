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

public class AnonymousClass_1 {

	public static void main(String[]args) {
		
		/* 13.2 익명 이너 클래스
		   13.2.1 익명 이너 클래스의 정의와 특징
		   
		   익명 이너 클래스는 말 그대로 '이름을 알 수 없는 이너 클래스;를 의미함. 익명 이너 클래스는 
		   정의도니 이ㅟ치에 따라 분류 할 수 있는데, 클래스의 중괄호 바로 아래에 사용했을 때는 인스턴스
		   익명 이너 클래스, 메서드 내부에서 사용했을 때는 지역 익명 이너 클래스를 의미함. 이는 앞 절의
		   이너 클래스에서 살펴본 바와 같음. 일단은 상단 외부 클래스에 있는 코드들을 통해 알아보도록 하자.
		   
		   
		 */
		
		
		
	}
	
}
