package sec02_abstractmodifier.EX01_AbstractModifier_1;

class Animal{
	void cry() {
		
	}
}

class Cat extends Animal{
	void cry() {
		System.out.println("야옹");
	}
}

class Dog extends Animal{
	void cry() {
		System.out.println("멍멍");
	}
}

public class AbstractModifier_1 {

	public static void main(String[]args) {
		
		/* 11.2 abstract 제어자
		   		    
		   자바 제어자 중에서 마지막으로 알아볼 것은 abstract 제어자임. abstract의 사전적 의미는 '추상적인'임. abstract가 붙은 메서드를
		   추상 메서드 abstract method, abstract가 붙은 클래스를 추상 클래스 abstract class라고 부름.
		   
		   먼저 추상 메서드를 살펴보자. 메서드가 추상적이라는 것은 무슨 의미일까? 추상적이라는 말은 문자 그대로, 구체적이지 않은 것이란 의미임.
		   보통 메서드는 어떤 기능알 수행하는 요소이고, 기능은 메서드의 중괄호 {} 안에서 정의되기 마련임. 쉽게 말해 추상 메서드는 중괄호가 따로
		   없는 메서드로, 다음과 같음 구조를 띰. 중괄호가 없으므로 메서드의 기능 자체가 정의되지 않으며 세미 콜론으로 끝이 남.
		   
		   abstract 리턴 타입 메서드명 ();
		   
		   추상 메서드는 아직 무슨 기능을 정의할지 정해지지 않은 미완성 메서드라고 간주하자. 이러한 개념을 구체화시키기 위해 위에 작성해 둔
		   외부 클래스들을 통해서 살펴보도록 하자. 먼저 Animal 클래스에서 cry() 메서드는 아무런 기능을 수행하지 않음. 어차피 자식 클래스에서
		   cry() 메서드의 오버라이딩을 통해 사용할 예정이기 때문임. 그럼에도 불구하고 아무런 기능이 없는 cry() 메서드를 Animal에 정의한
		   이유는 다음과 같음. 

		 */
		
		// 객체 생성
		Animal animal1 = new Cat(); 
		Animal animal2 = new Dog();
		
		// 메서드 호출
		
		animal1.cry(); // 야옹
		animal2.cry(); // 멍멍
		
		/* 이처럼 다형적 표현을 사용해서 animal.cry()의 형태로도 cry() 메서드를 호출하기 위해서는 Animal 클래스에 cry() 메서드가
		   존재해야 한다는 것. 만약 Animal 클래스에 cry() 메서드가 없다면 이러한 호출 자체가 불가능해짐.
		   
		   그렇다면 이러한 오버라이딩이 abstract 제어자와 무슨 상관이냐? 이는 AbstractModifier_2 소스 파일과에서 알아보도록 하자.
		 */
	}
	
}
