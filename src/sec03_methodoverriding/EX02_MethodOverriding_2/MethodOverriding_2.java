package sec03_methodoverriding.EX02_MethodOverriding_2;

class Animal {
	void cry() {
		
	}
}

class Bird extends Animal {
	@Override
	void cry() {
		System.out.println("짹짹");
	}
}

class Cat extends Animal {
	@Override
	void cry() {
		System.out.println("야옹");
	}
}

class Dog extends Animal {
	@Override
	void cry() {
		System.out.println("멍멍");
	}
}

public class MethodOverriding_2 {

	public static void main(String[]args) {
		
		/* 10.3.2 메서드 오버라이딩의 필요성
		   
		   메서드 오버라이딩의 필요성은 상기 외부 클래스들을 통해 확인이 가능함. 4개의 클래스는 모두 cry() 메서드를 포함하고 있음. Animal
		   클래스 내부의 cry() 메서드는 아무런 내용도 포함하고 있지 않음. 나머지 자식 클래스에는 각각 자신만의 출력을 소유중임. 이제 부모
		   클래스를 포함한 모든 클래스의 객체를 선언하고, 타입을 객체의 타입과 일치시켜 놓음. 이때 각각 객채의 cry() 메서드를 출력해보자.

		 */
		
		/*각각의 타입으로 선언 후, 각각의 타입으로 객체 생성*/ System.out.println("각각의 타입으로 선언 후, 각각의 타입으로 객체 생성");
		System.out.println();
		
		Animal aa = new Animal();
		Bird bb = new Bird();
		Cat cc = new Cat();
		Dog dd = new Dog();
		
		aa.cry(); // 출력 없음
		bb.cry(); // 짹짹
		cc.cry(); // 야옹
		dd.cry(); // 멍멍
		System.out.println();
		
		/*부모 클래스 타입으로 선언 후, 각각의 타입으로 객체 생성*/ System.out.println("부모 클래스 타입으로 선언 후, 각각의 타입으로 객체 생성");
		System.out.println();
		
		Animal ab = new Bird();
		Animal ac = new Cat();
		Animal ad = new Dog();
		
		ab.cry(); // 출력 없음
		ac.cry(); // 짹짹
		ad.cry(); // 야옹
		
		/* 이때 참조 변수 ab, ac, ad는 모두 Animal 타입이지만, 각각 서로 다른 메서드로 오버라이딩 되었으므로, 각각 cry() 메서드는
		   서로 다른 출력 결과를 보임. 이 때 Animal 클래스 안에 독자 기능이 아무것도 없는 cry() 메서드를 넣어 놓는 이유는, 다른 참조
		   변수에서 위와 같이 cry() 메서드를 호출해서 사용하기 위함임. 이렇게 여러 객체를 부모 타입 하나로 선언하면 여러 객체들을 다음과 같이
		   배열로 한번에 관리 가능하다는 강점이 있음. 
		   
		 */
		
		/*배열을 통한 자식 클래스의 관리*/ System.out.println("배열을 통한 자식 클래스의 관리");
		System.out.println();
		
		Animal[] animals = new Animal[]{new Bird(), new Cat(), new Dog()};
		for (Animal animal : animals) {
			animal.cry();
		} // 짹짹, 야옹, 멍멍
		
		/* @override 어노테이션의 사용 
		   
		   컴파일 타임 검증: 컴파일러가 해당 메서드가 실제로 슈퍼클래스의 메서드를 오버라이딩하는지 확인함. 만약 메서드 이름을 잘못 입력했거나
	                     메서드 시그니처가 일치하지 않으면 컴파일 오류가 발생하는데, 이를 통해 오타나 실수를 방지할 수 있음.
		   코드 가독성 향상: 해당 메서드가 오버라이딩된 메서드임을 명확하게 나타내므로, 코드를 읽는 사람에게 메서드의 역할을 쉽게 이해시킬 수 있음.
		      	         이는 코드의 유지보수성을 높임.
		   의도 명시: 해당 메서드를 작성한 개발자가 의도적으로 슈퍼클래스의 메서드를 오버라이딩하려고 했다는 것을 명확히 나타낼 수 있음.
		            이는 코드 리뷰나 협업 시 중요한 정보가 될 수 있음.
		   일관성 유지: @Override 어노테이션을 일관되게 사용하면 코드 스타일을 통일하고, 팀 내에서 코딩 규칙을 유지하는 데 도움이 됨.
		    
		 */
		
	}
	
}
