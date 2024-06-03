package sec01_inheritanceplymorphism.EX2_Polymorphism;

class A{}
class B extends A{}
class C extends B{}
class D extends B{}


public class Polymorphism {

	public static void main(String[]agrs) {
		
		/* 10.1.6 객체의 다형적 표현
		   
		   앞에서 개념적으로만 알아본 객체의 다형적 표현을 통해, 실제 코드에서 객체를 다형적으로 표현 하는 방법에 대한 내용임. 먼저 간단하게
		   클래스 A를 상속받아 클래스 생성한 예(A<-B)를 들어보자.
		   
		   상속 관계에서 다형성의 코드 표현
		   
		   A a1 = new A();
		   A a2 = new B();
		   
		   앞에서 언급한 것처럼 생성한 객체와 동일한 타입으로 선언하는 것은 물론, 자식 클래스의 객체를 부모 클래스 타입으로 선언하는 모든
		   다형적 표현을 할 수 있음. 따라서 클래스 A, B, C, D가 다음과 같은 삭송 구조일 때 다음 객체 생성 코드는 모두 옳게 됨.
		   
		   class A{}
		   class B extends A{}
		   class C extends B{}
		   class D extends B{}
		   
		   A a1 = new A(); // (O)
		   B a2 = new B(); // (O)
		   C a3 = new C(); // (O)
		   D a4 = new D(); // (O)
		   
		   A a1 = new B(); // (O)
		   A a2 = new C(); // (O)
		   A a3 = new D(); // (O)
		   
		   B b1 = new C(); // (O)
		   B b2 = new D(); // (O)
		   
		   반면 동일한 상속 구조에서 상속 방향을 역행하는 구조의 코드는 모두 틀림.
		   
		   B b1 = new A();
		   
		   C c1 = new A();
		   D C2 = new A();
		   
		   D d1 - new A(); // (X)
		   D d2 = new B(); // (X)
		   D d3 = new C(); // (X)
		   
		 */
		
		/*-실습- 상속을 이용한 객체의 다형적 표현*/ System.out.println("-실습- 상속을 이용한 객체의 다형적 표현");
		
		// A 타입의 다형적 표현
		
		A a1 = new A(); // (O)
		B a2 = new B(); // (O)
		C a3 = new C(); // (O)
		D a4 = new D(); // (O)
		
		// B 타입의 다형적 표현
		
		// B b1 = new A(); // (X)
		B b2 = new B(); // (O)
		B b3 = new C(); // (O)
		B b4 = new D(); // (O)
		
		// C 타입의 다형적 표현
		
		// C c1 = new A(); // (X)
		// C c2 = new B(); // (X)
		C c3 = new C(); // (O)
		// C c4 = new D(); // (X)
		
		// D 타입의 다형적 표현
		
		// D d1 = new A(); // (X)
		// D d2 = new B(); // (X)
		// D d3 = new C(); // (X)
		D d4 = new D(); // (O)
	}
	
}
