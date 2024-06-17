package sec02_interface.EX07_DefaultMethod_1;

interface A {
	void abc();
	default void bcd() { // 기본 구현 메서드. default 메서드는 자식 클래스에서 반드시 구현하지 않아도 됨. 아래 참조.
		System.out.println("A 인터페이스의 bcd()");
	}
}

class B implements A {
	public void abc() {
		System.out.println("B 클래스의 abc()");
	}
}

class C implements A {
	public void abc() {
		System.out.println("C 클래스의 abc()");
	}
	public void bcd() {
		System.out.println("C 클래스의 bcd()");
	}
}

public class DefaultMethod_1 {

	public static void main(String[]args) {
		
		// 객체 생성
		
		A a1 = new B();
		A a2 = new B();
		
		// 메서드 호출
		
		a1.abc();
		a1.bcd();
		a2.abc();
		a2.bcd();
		
		/* 교재 기준으로는 이미 설명한 내용이라고 하나, 기억이 나지 않아 상기하는 개념으로 인터페이스 내부의 default 메서드를 반드시 구현하지
		   않아도 되는 내용에 대해 더 자세히 정리해보자. 자바 8에서는 인터페이스에서 default 메서를 사용할 수 있게 되었는데, 이는 인터페이스에서도
		   메서드의 기본 구현을 제공할 수 있음을 의미함. default 메서드는 인터페이스를 구현하는 클래스가 해당 메서드를 반드시 구현하지 않아도
		   되는 메서드임. 대신 기본 구현이 제공되기 때문에 인터페이스를 구현하는 클래스는 필요에 따라 이 메서드를 오버라이딩할 수 있음. 반면
		   default가 없는 인터페이스 내의 추상 메서드는 자식 클래스 내부에서 반드시 구현해 제공해야 함.   
		   
		 */
		
	}
	
}
