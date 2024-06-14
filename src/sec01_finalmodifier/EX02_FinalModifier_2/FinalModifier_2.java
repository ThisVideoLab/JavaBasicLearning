package sec01_finalmodifier.EX02_FinalModifier_2;

class A{
	void abc() {}
	final void bcd() {}
}
class B extends A{
	void abc() {}
	// void bcd() {} // final 메서드는 오버라이딩이 불가능함.
}
final class C{}
// class D extends C {} // final 클래스는 상속 자체가 불가능함.


public class FinalModifier_2 {

	public static void main(String[]args) {
		
		/* 11.1.2 final 메서드와 fianl 클래스
		   
		   final 메서드처럼 final 클래스의 기능도 직관적임. final 변수는 변수가 저장한 값이 최종 final 값의 의미를 지니고 있는 것처럼
		   final 메서드와 final 클래스도 각각 최종 메서드, 최종 클래스의 의미를 지님. 그렇다면 최종 메서드의 의미는 무엇일까? 상속할 때
		   부모의 메서드를 오버라이딩하면, 자식 클래스에서는 메서드의 기능이 변경됨. final 메서드는 이렇게 메서드의 기능을 변경할 수 없는
		   메서드임. 즉 메서드를 final로 정의하면 위에 작성한 외부 클래스들과 같이 자식 클래스에서 해당 메서드를 오버라이딩 할 수 없음.
		   이와 같은 개념으로 final 클래스 역시 최종 클래스의 의미로 더 이상 자식 클래스가 없다는 것을 의미함. 따라서 final 클래스는 
		   상속 자체가 아예 불가능함. 정리하자면 final 변수는 값을 변경할 수 없고, fianl 메서드는 오버라이딩이 불가능하며, final 클래스는
		   상속 자체가 불가능함.
		   
		 */
		
		System.out.println("별도 실행 결과 없음");
		
	}
	
}
