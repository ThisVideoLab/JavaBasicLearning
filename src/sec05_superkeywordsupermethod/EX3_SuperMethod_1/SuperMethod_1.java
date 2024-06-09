package sec05_superkeywordsupermethod.EX3_SuperMethod_1;

class A {
	A() {
		System.out.println("A 생성자");
	}
}

class B {
	B() {
		super();
		System.out.println("B 생성자");
	}
}

class C {
		C(int a){
			System.out.println("C 생성자");
		}
	}
	class D extends C { // 빈 클래스만 생성할 경우에는 오류 발생, class D 생성 불가능
		 D(){
			 super(3); // 생성자 안에 부모 클래스 내 생성자를 호출할 수 있는 코드를 추가해줘야 오류가 발생하지 않음.
			 System.out.println("D 생성자");
		 }
	}

public class SuperMethod_1 {

	public static void main(String[]args) {
		
		/* 10.5.2 부모 클래스의 생성자를 호출하는 super() 메서드
		   
		   클래스 A를 상속받아 클래스 B를 생성하고, B() 생성자를 이용해 객체를 생성할 때 항상 부모 클래스 객체가 먼저 생성됨을 학습함. 그런데
		   어떻게 자식 클래스 생성자로 부모 클래스 객체를 먼저 만들 수 있을까? 이것이 바로 super() 메서드의 역할임. super()는 부모 클래스
		   생성자를 생성함. this()와 마찬가지로 생성자의 내부에서만 사용 가능하며, 반드시 첫 줄에 와야 함. this() 메서드도 생성자의
		   첫 줄에만 올 수 있으므로 이 둘은 1개의 생성자에서 절대로 같이 쓸 수 없을 것임. 외부 클래스 A와 B를 참고해서 살펴보자.
		   
		   B b = new B()와 같이 B() 생성자로 객체를 생성했을 때 메모리 구조는 다음과 같음. B() 생성자를 이용해 객체를 생성할 때는 가장
		   먼저 super() 메서드를 실행함. super()는 부모의 생성자를 호출하는 것이므로 A()가 실행될 것. A() 생성자의 실행이 완료되면
		   메모리에는 A 객체가 생성될 것임. 이후 다시 돌아와 나머지 코드를 실행함. 따라서 B b = new B()와 같이 객체를 생성하면 값이
		   "A 생성자", "B 생성자" 순으로 출력됨.
		   
		   여기서 매우 중요한 사실은 모든 생성자의 첫 줄에는 반드시 this() 또는 super()가 있어야 함. 만일 아무것도 써 주지 않으면 컴파일러는
		   자동으로 super()를 삽입함. 즉생성자를 호출할 때는 항상 부모 클래스의 생성자가 한 번은 호출된다는 것임. 이게 바로 자식 클래스의
		   생성자로 객체를 생성할 때 부모 클래스의 객체가 만들어지는 이유임. 외부 클래스 C를 살펴보자.
		   
		   class C {
				C(int a){
					System.out.println("A 생성자");
				}
			}
			class D extends C { // 오류 발생, class D 생성 불가능
				
			}
		   
		   클래스 A에는 int a 값을 받는 생성자 1개가 정의되어 있음. 기본 생성자는 아니지만 생성자가 있으므로, 컴파일러는 기본 생성자를 따로
		   추가하지 않는 상태임. 이후 클래스 B를 정의하고, 클래스 A를 상속하면 내부에 아무런 코드가 없음에도 불구하고 바로 오류가 발생함.
		   이유는, 클래스 B 안에는 생성자가 없으므로 컴파일러가 기본 생성자를 자동으로 삽입하게 되는데, 모든 생성자 앞에는 this() 또는
		   super()가 있어야 하므로, 컴파일러는 추가로 기본 생성자의 첫 줄에 super() 메서드를 추가하게 됨. 앞에서 설명한 것처럼 super()는
		   부모의 기본 생성자, 즉 A()를 호출하라는 의미임. 하지만 클래스 A는 기본 생성자가 없으므로, 클래스 B에 삽입된 super()의 대상이
		   없어 오류가 발생한다는 것. 이를 해결하기 위해서는 클래스 B에 생성자를 직접 작성하고 첫줄에 super(3)과 같이 클래스 A의 생성자에
		   대응하는 메서드를 넣어 명시적으로 이를 호출해야 함.
		   
		 */
		
		/*-실습- super() 메서드의 기능 및 컴파일러에 따라 super() 자동 추가*/
		System.out.println("-실습- super() 메서드의 기능 및 컴파일러에 따라 super() 자동 추가");
		System.out.println();
		
		// A 객체 생성
		
		A aa = new A();
		System.out.println();
		
		// B 객체 생성
		
		B bb = new B();
		System.out.println();
		
		// C 객체 생성
		
		C cc = new C(2);
		System.out.println();
		
		// D 객체 생성
		
		D dd = new D();
		System.out.println();
		
	}
	
}
