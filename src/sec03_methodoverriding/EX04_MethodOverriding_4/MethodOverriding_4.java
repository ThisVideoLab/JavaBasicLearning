package sec03_methodoverriding.EX04_MethodOverriding_4;

class A {
	protected void abc() {}
}
class B1 extends A {
	protected void abc() {
		System.out.println("B1 메서드 오버라이딩");
	}
}
class B2 extends A {
	protected void abc() {
		System.out.println("B2 메서드 오버라이딩");
	}
}
class B3 extends A {
	// void abc() {} // 부모 클래스 A의 접근 지정자 protected 보다 좁은 default 접근 지정자 메서드이므로 불가능함.
}
class B4 extends A {
	// private void abc() {}  // 부모 클래스 A의 접근 지정자 protected 보다 좁은 private 접근 지정자 메서드이므로 불가능함.
}

public class MethodOverriding_4 {

	public static void main(String[]args) {
		
		/* 10.3.4 메서드 오버라이딩과 접근 지정자
		   
		   자식 클래스가 부모 클래스의 메서드를 오버라이딩할 때는 반드시 상속받은 메서드의 접근 지정자와 범위가 같거나 넓은 접근 지정자를 사용해야 함.
		   즉, 접근 지정자의 범위를 좁힐 수 없다는 의미. 예를 들어 부모 클래스의 메서드가 default가 접근 지정자를 포함하고 있을 때 자식 클래스는
		   default 접근 지정자와 같거나 큰 범위의 접근 지정자, 즉 protected, public, default 접근 지정자만 사용 가능함.
		   
		   메서드 오버라이딩할 때 사용할 수 있는 접근 지정자
		   부모 클래스 메서드의 접근 지정자 - 메서드 오버라이딩을 할 때 사용 가능한 접근 지정자
		   
		   public    - public
		   protected - public, protected
		   default   - public, protected, default
		   private   - public, protected, default, private
		   		   
		 */
		
		/*-실습- 메서드 오버라이딩과 접근 지정자*/ System.out.println("-실습- 메서드 오버라이딩과 접근 지정자");
		System.out.println();
		
		B1 b1 = new B1();
		B2 b2 = new B2();
		
		b1.abc();
		b2.abc();
		
	}
	
}
