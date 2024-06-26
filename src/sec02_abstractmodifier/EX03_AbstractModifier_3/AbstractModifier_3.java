package sec02_abstractmodifier.EX03_AbstractModifier_3;

class Animal1{
	void cry() {
		
	}
}

class Cat1 extends Animal1{
	void cRy() { // 고의적으로 오타를 낸 경우 컴파일은 가능함. 그러나 출력 값이 없음
		System.out.println("야옹1"); 
	}
}

abstract class Animal2{
	abstract void cry();
}

/*
class Cat2 extends Animal2{
		
	void cRy() { // 고의적으로 오타를 낸 경우 Cat2는 반드시 추상 메서드 cry() 메서드를 계승해야 한다는 오류가 발생함.
		System.out.println("야옹2");  
	}
}
*/
public class AbstractModifier_3 {

	/* 11.2.1 abstract 제어자의 장점
	   
	   앞의 추상 메서드를 사용하는 이유를 살펴보면 사실상 코드 간소화의 이점은 없음. 오히려 중괄호가 없는 새로운 문법을 1개 더 사용해야 하는
	   번거로움만 추가된 수준. 그렇다면 추상 메서드와 추상 클래스를 사용해서 얻게 되는 장점은 무엇일까? 먼저 두 방법의 차이를 알아보기 위해
	   일반 클래스 Animal1과 추상 클래스 Animal2를 작성하고, 부모 클래스의 메서드를 계승하는 자식 클래스에 고의로 오타를 내봄. 이때 
	   일반 클래스를 상속하는 Cat1 클래스 내부의 메서드명을 오타를 낸 경우, 컴파일러는 이를 계승할 메서드명의 오타로 인식하는 것이 아니라
	   완전히 새로운 이름의 새 메서드로 인식함. 따라서 오류를 발생하지 않음과 동시에 별다른 표시가 없어서 후에 코드가 길어지면 파악하는데 더 많은
	   어려움을 겪을 가능성이 높음.
	   반대로 추상 클래스를 상속하는 Cat2 클래스 내부의 메서드명을 오타를 낸 경우에는, Cat2 클래스 내부에 Aniaml2의 추상 메서드를 상속하는
	   자식 메서드가 없다는 오류를 컴파일러가 출력함. 그 이유는, 추상 클래스를 상속하면 추상 메서드도 똑같이 내려받기 때문임. 즉 추상 클래스를
	   상속받은 Cat2 클래스 내부에는 반드시 상속받은 추상 메서드인 cry() 메서드가 있어야 한다는 것. 일반 메서드로 오버라이딩을 하던, 추상
	   메서드로 자신을 정의하던, 부모 클래스에 상승하는 추상 메서드가 존재해야한다는 것임. 하지만 Cat2 클래스는 오타로 인해 마땅히 있어야 할
	   추상 메서드가 존재하지 않기 때문에 컴파일러가 오류를 출력하게 됨. 고로 이러한 오류는 프로그래머가 목적한 바에 맞게 코드가 작성되는지를
	   검수하는데 유용함.
	   
	 */
	
	// 객체 생성
	Animal1 animal1 = new Cat1(); 
		
	// 메서드 호출
			
	// animal1.cry(); // cry() 메서드가 오타가 나서 cRy()가 되었으므로 호출 불가능
	// animal2.cry(); // 멍멍
	
}
