package sec02_abstractmodifier.EX02_AbstractModifier_2;

abstract class Animal{ // 추상 메서드를 1개 이상 포함하고 있으므로 추상 클래스로 정의함
	abstract void cry(); // 추상 메서드
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

public class AbstractModifier_2 {

	public static void main(String[]args) {
		
		/* 앞서 AbstractModifier_1 소스 파일에서 살펴 본 것처럼 오버라이딩을 위한 부모 클래스의 메서드에 내용이 없다면, 이를 간단하게
		   추상 클래스로 만들어서 사용이 가능함. 추상 메서드를 1개 이상 포함한다면 해당 클래스는 반드시 추상 클래스로 정의되어야 하는 것이
		   자바의 규칙이기 때문에 abstract void cry() 메서드를 포함한 class Animal 역시 추상 클래스로 표기해 줌.
		   
		 */
		
		// 객체 생성
		Animal animal1 = new Cat(); 
		Animal animal2 = new Dog();
			
		// 메서드 호출
				
		animal1.cry(); // 야옹
		animal2.cry(); // 멍멍
		
	}
	
}
