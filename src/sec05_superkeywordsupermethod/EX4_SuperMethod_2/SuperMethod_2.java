package sec05_superkeywordsupermethod.EX4_SuperMethod_2;

class A {
	A() {
		this(3);
		System.out.println("A 생성자 1");
		
	}
	A(int a){
		System.out.println("A 생성자 2");
	}
}

class B extends A {
	B() {
		this(3);
		System.out.println("B 생성자 1");
	}
	B(int a) {
		System.out.println("B 생성자 2");
	}
}

public class SuperMethod_2 {

	public static void main(String[]args) {
		
		/* 이번에는 this()와 super()가 여러 개 섞여 있는 예제를 외부 클래스 A와 B를 통해 살펴보자. 가장 마지막의 경우만 살펴보면, 
		   B bb2 = new B(2)와 같이 클래스 B의 두 번째 생성자를 호출해 객체를 생성함. 두 번째 생성자의 첫 줄에는 this(), super()가
		   모두 없으므로 컴파일러가 자동으로 super()를 추가해 줄 것임. 따라서 부모의 기본 생성자인 A()가 먼저 호출됨. A()의 첫 줄에는
		   다시 this(3)와 같이 int 자료형을 받는 자신의 생성자를 호출하고 있으므로, 다시 클래스 a의 두번째 생성자가 호출됨. 이제 각각의
		   메서드를 순차적으로 실행하면 결과적으로 "A 생성자2", "A 생성자 1", "B 생성자2" 순서로 출력될 것임. 
		   
		 */
		
		/*A 객체 생성*/ System.out.println("A 객체 생성");
		System.out.println();
		
		A aa1 = new A();
		System.out.println();
		
		A aa2 = new A(3);
		System.out.println();
				
		/*B 객체 생성*/ System.out.println("B 객체 생성");
		System.out.println();
		
		B bb1 = new B();
		System.out.println();
		
		B bb2 = new B(3);
		System.out.println();
		
		/* 여기까지 살펴보다 보면 뭔가 이상함을 느낄 것임. 클래스 A의 두 번째 생성자의 첫 줄에는 this()도 super()도 없으므로 역시 super()
		   코드가 들어가야 하는데, 클래스 A는 아무것도 상속받지 않음. 그렇다면 오류가 발생하지 않을까? 이 질문에 대한 대답이 바로 다음 절에서
		   학습할 최상위 클래스 Object 클래스임.
		   
		 */
		
	}
}
