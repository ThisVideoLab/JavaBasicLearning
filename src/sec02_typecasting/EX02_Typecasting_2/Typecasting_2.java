package sec02_typecasting.EX02_Typecasting_2;

class A {
	int m = 3;
	void abc() {
		System.out.println("A 클래스");
	}
}

class B extends A {
	int n = 4;
	void bcd() {
		System.out.println("B 클래스");
	}
}

public class Typecasting_2 {

	public static void main(String[]args) {
		
		/* 10.2.3 선언 타입에 따른 차이점
		   
		   다운캐스팅을 메모리 구조상에서 이해했다면 선언 타입에 따른 차이점은 어렵지 않게 이해할 수 있을 것. 다음과 같이 2개의
		   클래스 A, B가 있다고 가정을 해보자. 
		   
		   class A {
				int m = 3;
				void abc() {
					System.out.println("A");
				}
			}

			class B extends A {
				int n = 4;
					void bcd() {
					System.out.println("B");
				}
			}
			
			클래스 A는 필드 m과 메서드 abc()가 있고, 이 클래스를 상속한 클래스 B는 필드 n과 메서드 bcd()를 추가로 정의하였음. 즉 클래스
			B에서는 m, n, abc(), bcd()를 사용할 수 있다는 것. 이제 동일하게 B() 생성자로 객체를 생성하고, 이를 B타입과 A타입으로
			각각 선언했을 때의 차이를 알아보자. 먼저 B b = new B()일 때를 살펴보자.
			
			B의 객체를 B 타입으로 선언했을 때
			
			B b = new B(); // (o)
			System.out.println(b.m); // (o)
			System.out.println(b.n); // (o)
			b.abc(); // (o)
			b.bcd(); // (o)
		    
		    B() 생성자로 생성했으므로 힙 메모리에는 A 객체를 감싸고 있는 B 객체가 만들어질 것임. A 객체 내부에는 필드 m과 abc() 메서드가
		    있고, 그를 내포하는 B 객체에는 추가로 필드 n과 bcd()가 있음. 결국 B 객체 내부에는 m, n, abc(), bcd()가 있는 형태임.
		    참조 변수가 B 타입으로 선언돼 있으므로 참조 변수 b 객체를 가리키게 되고, 이때 참조 변수를 이용해 2개의 필드와 2개의 메서드를
		    모두 사용 할 수 있게 됨.
		    
		    B의 객체를 A 타입으로 선언했을 때
		    
		    A a = new B();
		    System.out.println(a.m); // (o)
		    System.out.println(a.n); // (x)
		    a.abc(); // (o)
		    a.bcd(); // (x)
		    
		    B() 생성자로 객체를 생성한 것은 동일하므로 힙 메모리에 생성되는 객체의 모양은 동일한 것. 그러나 참조 변수가 A 타입으로 선언돼
		    있으므로 실제로 힙 메모리에 B 객체가 있더라도 참조 변수 a는 A 객체만을 가리킴. 따라서 이 경우에는 m과 abc()만 사용 가능해짐.
		    
		  */
		
		 /*-실습- 선언 타입에 따른 사용할 수 있는 멤버*/ System.out.println("-실습- 선언 타입에 따른 사용할 수 있는 멤버");
		 
		 // A 타입 - A 생성자
		 
		 A aa = new A();
		 System.out.println(aa.m);
		 aa.abc();
		 
		 // B 타입 - B 생성자
		 
		 B bb = new B();
		 System.out.println(bb.m);
		 System.out.println(bb.n);
		 bb.abc();
		 bb.bcd();
		 
		 // A 타입 - B 생성자: 다형적 표현
		 
		 B ab = new B();
		 System.out.println(ab.m);
		 ab.abc();
		 
	}
	
}
