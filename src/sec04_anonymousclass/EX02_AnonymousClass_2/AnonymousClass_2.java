package sec04_anonymousclass.EX02_AnonymousClass_2;

interface C {
	public abstract void bcd();
}

class A {
	C c = new C() {
		public void bcd() {
			System.out.println("익명 이너 클래스");
		}
	};
	void abc() {
		c.bcd();
	}
}


public class AnonymousClass_2 {

	public static void main(String[]args) {
		
		/* 위는 앞서 알아본 익명 이너 클래스와 조금은 다른 예시임. 인터페이스를 구현한 자식 클래스에서 메서드를
		   추가로 정의한 경우. 왼쪽처럼 자식 클래스 타입으로 객체를 선언하고 생성하면 오버라이딩 된 메서드와
		   추가 메서드를 모두 사용할 수 있음. bcd() 메서드와 cde() 메서드 모두 클래스 B 내부에서
		   정의돼있으며, 참조 변수가 B 타입이므로 두 메서드를 모두 호출할 수 있음. 반면 익명 이너 클래스를
		   사용할 때는 항상 부모 타입으로만 선언할 수 있으므로 추가로 정의한 메서드 cde()는 항상 호출 할 수
		   없음.  
		   
		   그렇다면 호출이 불가능한데 애초에 만들 이유는 무엇일까? 오버라이딩 메서드 내부에서는 호출할 수
		   있기 때문에 작성해야 할 내용이 많은 경우엔 메서드를 분리해 작성하는 것이 효율적이며, 이때 익명
		   이너 클래스 정의식 내부에 추가 메서드를 정의해 사용하는 것이 편할 수 있음.
		   
		   익명 이너 클래스는 아무래도 일회성에 적합한 구조이나, 일회성으로 필요하더라도 그 안에 작성해야 할
		   내용이 많은 경우에는 분리해 작성하는 것이 충분한 이점으로 작용할 수 있음.
		 
		 */
		
		// 익명 이너 클래스를 활용해 인터페이스 객체 생성
		System.out.println("익명 이너 클래스를 활용해 인터페이스 객체 생성");
		
		// 객체 생성 및 메서드 생성
		
		A a = new A();
		a.abc();
	}
}
