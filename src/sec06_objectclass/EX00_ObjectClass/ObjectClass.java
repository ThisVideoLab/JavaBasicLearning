package sec06_objectclass.EX00_ObjectClass;

class A{ // 아무것도 상속하지 않는 경우, 컴파일러가 자동으로 extends Object 를 추가함.
	
}
class B extends A{
	
}


public class ObjectClass {

	public static void main(String[]args) {
		
		/* 10.6 최상위 클래스 object
		   
		   자바의 모든 클래스는 최상위 클래스인 Object 클래스를 상속 받음. 즉, Object 클래스는 자바의 최상위 클래스임. 물론 한번도
		   Object 클래스를 상속한 적이 없기 때문임. 실제로 컴파일러는 아무런 클래스로 상속하지 않으면 자동으로 extends Object 코드를
		   삽입해 Object 클래스를 상속함. 즉, 다음과 같이 클래스 A를 상속받아 B 클래스를 만들었을 때 부모 클래스인 클래스 A는 아무것도
		   상속하지 않았음. 그 결과 컴파일러는 자동으로 extends Object를 추가했음. 결국 B 또한 Object 클래스를 상속하게 됨.
		   결국 모든 클래스의 최상단에는 Object 클래스가 있다는 의미. 따라서 자바의 모든 클래스는 어떤 객체로 만들든지 다음과 같이 Object
		   타입으로 선언이 가능함.
		   
		   임의의 클래스르 Object 타입으로 선언하는 예
		   
		   Object oa = new A();
		   Object ob = new A();
		   
		   이것은 정말 중요한 장점임. 메서드 오버로딩을 설명할 때 살펴본 System.out.println() 메서드를 살펴보자. println() 메서드는
		   다양한 타입을 출력하기 위해 여러 개의 입력매개 변수 타입으로 오버로딩 되어 있음. 만일 10개의 타입을 출력하는 기능을 부여하려면
		   10개의 메서드를 오버로딩 해 놓아야 함. 그러나 이상하게도 System.out.println(new A())와 같이 사용자가 직접 만든 클래스
		   타입도 출력할 수 있었음. 이것이 가능한 이유는, 바로 Object 클래스가 지니는 특징을 활용한 System.out.println(Object X)
		   코드때문임. 즉 기본 자료형 이외에 Object를 매개변수로 하는 println() 메서드를 오버로딩해 놓은 것. 이 코드는 사용자가 어떤
		   클래스 타입의 객체를 생성하더라도 다형성에 따라 Object 타입으로 귀결되므로 입력 매개변수로 모든 타입의 객체를 소화 가능해짐.
		   
		 */
		
	}
	
}
