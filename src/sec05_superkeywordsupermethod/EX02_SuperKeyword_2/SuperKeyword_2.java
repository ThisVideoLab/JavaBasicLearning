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

// 다음 예제용 외부 클래스: 중복으로 인해 C, D로 클래스명 변경

class C {
	void init() {
		System.out.println("메모리 할당, 화면 세팅, 변수 초기화 등의 코드 100줄");
	}
}

class D extends C {
	void init() {
		super.init();
		System.out.println("클래스 D에서 추가된 1줄의 코드");
	}
	
}

public class SuperKeyword_2 {

	public static void main(String[]args) {
		
		/* SuperKeyword_1 자바 코드에서 먼저 간단하게 this 키워드의 용례를 복기하였음. 그렇다면 부모 클래스의 abc()를 자식 클래스에서
		   호출할 수 있을까? 이때 사용하는 것이 바로 super 키워드임. 외부 클래스 A와 B를 참조해 다음 예를 살펴보자.
		 */
		
		// 객체 생성
		B bb = new B();
		
		/*메서드 호출*/ System.out.println("매서드 호출");
		
		bb.abc();
		bb.bcd(); // super 키워드로 부모 클래스의 abc() 메서드를 출력함
		System.out.println();
		
		/*부모 메서드를 호출해야 할 경우의 예*/ System.out.println("부모 메서드를 호출해야 할 경우의 예");
		System.out.println();
		
		// 객체 생성
		
		D dd = new D();
		
		/*메서드 호출*/ System.out.println("매서드 호출");
		System.out.println();
		
		dd.init();
		   
		/* 부모 클래스 C에 100줄의 코드가 있다고 가정해보자. 여기에 메모리 할당 등과 같은 100여줄의 초기화 코드가 있는 상태에서, 자식 클래스를
		   통해 1줄의 코드만을 추가하고 싶은 경우, super 키워드를 사용하면 부모 클래스의 메서드 사용을 통해 쉽게 코드를 가져올 수 있음. 여기에
		   자식 클래스 D에 추가로 넣고 싶은 코드 1줄을 추가하면 작성 효율을 높일 수 있음.
		  
		 */
		
	}
	
}
