package sec01_abstractclass.EX01_AbstractClass_1;

abstract class A{
	abstract void abc();
}
class B extends A{
	void abc() {
		System.out.println("방법1. 자식 클래스 생성 및 추상 메서드 구현");
	}
}
public class AbstractClass_1 {

	public static void main(String[]args) {

		/* 12.1.3 추상 클래스 타입의 객체 생성 방법
		   
		   앞에서 추상 클래스 자체로는 직접 객체를 생성할 수 없지만, 자식 클래스를 생성해 객체를 생성하고 부모 클래스인 추상 클래스 타입으로
		   선언할 수 있다고 학습함. 이렇게 추상 클래스의 객체를 생성하는 방법은 자식 크래스의 생성 여부에 따라 크게 2가지로 나뉨. 첫 번째 방법은
		   익히 알듯이 다음 예와 같이 추상 클래스를 상속한 일반 클래스를 생성하는 것.
		   
		   방법1) 추상 클래스를 일반 클래스로 상속해 객체 생성
		   
		   외부 클래스 A와 B를 살펴보자. 자식 클래스 B가 일반 클래스로 정의되기 위해서는 반드시 상속받은 추상 메서드 abc()를 구현해야 함.
		   클래스 B는 일반 클래스이므로 객체를 생성할 수 있고, 이렇게 생성한 객체는 다형적 표현으로 부모 추상 클래스 타입으로 선언 가능함.
		   
		 */
		
		// 객체 생성
		
		A b1 = new B();
		A b2 = new B();
		
		// 메서드 호출
		
		b1.abc();
		b2.abc();
		
	}
	
}
