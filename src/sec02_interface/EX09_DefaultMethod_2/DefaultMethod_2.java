package sec02_interface.EX09_DefaultMethod_2;

interface A{
	default void abc() {
		System.out.println("A 인터페이스의 abc()");
	}
}

class B implements A {
	@Override
	public void abc() {
		A.super.abc();
		System.out.println("B 클래스의 abc()");
	}
}

public class DefaultMethod_2 {

	public static void main(String[]args) {
		
		/* 디폴트 메서드가 인터페이스 내부에 속하는 일반 메서드처럼 동작한다고 했으므로, 자식 클래스에서 부모
		   인터페이스 내부의 디폴트 메서드도 호출이 가능함. 자식 클래스 메서드 내부에서 부모 인터페이스의
		   디폴트 메서드를 호출하는 방법은 다음과 같음.
		   
		   자식 클래스에서 부모 인터페이스의 디폴트 메서드를 호출하는 방법
		   
		   부모 인터페이스명.super.디폴트 메서드명

			interface A{
				default void abc() {
					System.out.println("A 인터페이스의 abc()");
				}
			}
			
			class B implements A {
				@Override
				public void abc() {
					A.super.abc();
					System.out.println("B 클래스의 abc()");
				}
			}		   
		   
		  자식 클래스 B의 메서드 abc() 메서드 내에서 A.super.abc()와 같이 부모 인터페이스를 생성하고
		  메서드를 호출하면 "A 인터페이스의 abc()"가 먽 ㅓ호출되고 이어서 "B 클래스의 abc()"가 호출됨.
		
		 */
		
		B b = new B();
		b.abc();
		
		/* 여기서 부모의 메서드를 호출하는 방식이 클래스와는 조금 다르다는 것을 알 수 있음. 부모 클래스의
		   메서드를 호출할 때는 'super.부모메서드명'인데 인터페이스의 메서드를 호출할 때는 super 앞에
		   부모 인터페이스 명까지 붙임. 부모가 클래스든, 인터페이스든 그냥 super.부모 메서드명으로 호출하면
		   편할탠데도 불구하고 이렇게 호출하는 이유는 부모 인터페이스가 여럿일 수 있기 때문임.
		   
		 */
		
	}
	
}
