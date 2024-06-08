package sec05_superkeywordsupermethod.EX02_SuperKeyword_2;

class A {
	void abc() {
		System.out.println("A 클래스의 abc()");
	}
}

class B extends A {
	void abc() {
		System.out.println("B 클래스의 abc()");
	}
	void bcd() {
		super.abc(); // 부모 클래스 객체의 abc() 메서드 호출
	}
}

public class SuperKeyword_2 {

	public static void main(String[]args) {
		
		/* SuperKeyword_1 자바 코드에서 먼저 간단하게 this 키워드의 용례를 복기하였음. 그렇다면 부모 클래스의 abc()를 자식 클래스에서
		   호출할 수 있을까? 이때 사용하는 것이 바로 super 키워드임. 외부 클래스 A와 B를 참조해 다음 예를 살펴보자.
		 */
		
		// 객체 생성
		B bb = new B();
		
		// 메서드 호출
		
		bb.abc();
		bb.bcd(); // super 키워드로 부모 클래스의 abc() 메서드를 출력함
		
	}
	
}
