package sec02_interface.EX04_CreateOfInterface_1;

interface A{
	int a = 3;
	void abc();
}

class B implements A{
	public void abc() {
		System.out.println("방법 1. 자식 클래스 생성자로 객체 생성");
	}
}

public class CreateOfInterface_1 {
	
	public static void main(String[]args) {
		
		/* 12.2.3 인터페이스 타입의 객체 생성 방법
		   
		   인터페이스도 추상 메서드를 포함하고 있으므로 객체를 직접 생성할 수는 없음. 이때는 추상 클래스와 마찬가지로 자식 클래스를 정의하고,
		   자식 클래스의 생성자로 객체를 생성하는 방법과 익명 이너 클래스를 이용해 바로 객체를 생성하는 방법을 사용할 수 있음. 각각의 방법은
		   인터페이스를 상속한다는 것을 제외하고 추상 클래스의 객체 생성 방법과 같음.
		   
		 */
		
		// 객체 생성
		
		A b1 = new B();
		A b2 = new B();
		
		// 메서드 호출
		
		b1.abc();
		b2.abc();
		
	}

}
