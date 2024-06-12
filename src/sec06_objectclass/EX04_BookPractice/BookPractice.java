package sec06_objectclass.EX04_BookPractice;

class A{
	void hello() {
		System.out.println("안녕하세요");
	}
}
class B extends A{
	void hello() {
		System.out.println("반갑습니다");
	}
}

class AA{
	void method() {
	}
}
class BB extends AA{
	public void method() {
	}
}
class CC extends AA{
	protected void method() {
	}
}
class DD extends AA{
	void method() {
	}
}
class EE extends AA{
	// private void method() { // 자세한 내용은 Q7에 서술
}

class AAA {
	int m = 2;
	static int n = 4;
	void method1() {
		System.out.println("A 클래스 instance method");
	}
	static void method2() {
		System.out.println("A 클래스 static method");
	}
}
class BBB extends AAA {
	int m = 6;
	static int n = 8;
	void method1() {
		System.out.println("B 클래스 instance method");
	}
	static void method2() {
		System.out.println("B 클래스 static method");
	}
}

class AAAA{
	AAAA(int a){
		System.out.println("A 생성자");
	}
}
//class BBBB extends AAAA{ 	
	// 클래스 내부 내용 없음 
//}

class A5 {
	A5() {
		System.out.println("A5 생성자1");
	}
	A5(int a) {
		this();
		System.out.println("A5 생성자2");
	}
}
class B5 extends A5{
	B5() {
		System.out.println("B5 생성자1");
	}
	B5(int b) {
		super();
		System.out.println("B5 생성자2");
	}
}

class A6 {
	int data;
	A6(int data){
		this.data = data;
	}
}

class A7 extends A6 { // 클래스 A6를 바로 수정하면 Q11번 문제의 출력값이 달라지므로 클래스 A7을 외부에 생성하고, 이를 오버라이딩하는 방법으로 진행.
	 
    A7(int data) { // 상위 클래스를 호출하고 초기화함. 없으면 오류가 발생함.
        super(data);
    }
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof A6) { // 타입 비교를 통해서, 주어진 객체가 A6 생성자의 매개변수의 자료형과 같은지를 판단함.
			return this.data == ((A6)obj).data; // 필드 값 자체의 비교.
		}
			return false;
	}
	
}

public class BookPractice {

	public static void main(String[]args) {
		
		/*10 연습문제*/ System.out.println("10 연습문제");
		System.out.println();
		
		/*Q1 생성자의 2가지 문법적 조건은 무엇인가?*/ System.out.println("10 연습문제");
		
		System.out.println("클래스의 이름과 동일");
		System.out.println("리턴 타입이 없음");
		System.out.println();
		
		/*Q2 다음과 같은 상속 구조도가 있을 때 이를 코드로 작성하시오(클래스의 내용은 작성하지 않음)*/
		System.out.println("Q2 다음과 같은 상속 구조도가 있을 때 이를 코드로 작성하시오(클래스의 내용은 작성하지 않음)");
		System.out.println();
		
		System.out.println("A <- B <- D");
		System.out.println("  <- B <- C");
		System.out.println();
		
		System.out.println("class B extends A");
		System.out.println("class D extends B");
		System.out.println("class C extends B");
		
		/*Q3 다음과 같은 상속 관계에서 다형적 표현을 사용한 객체 생성 코드 중 올바른 것은 O, 잘못된 것은 X에 표시하시오.*/
		System.out.println("Q3 다음과 같은 상속 관계에서 다형적 표현을 사용한 객체 생성 코드 중 올바른 것은 O, 잘못된 것은 X에 표시하시오.");
		System.out.println();
		
		System.out.println("A <- B <- D");
		System.out.println("  <- C");
		System.out.println();
		
		System.out.println("A a1 = new A();     (O)"); 
		System.out.println("A a2 = new B();     (O)");
		System.out.println("A a3 = new C();     (O)");
		System.out.println("A a4 = new D();     (O)");
		System.out.println();
		
		System.out.println("B b1 = new A();     (X)");
		System.out.println("B b2 = new B();     (O)");
		System.out.println("B b3 = new C();     (X)");
		System.out.println("B b4 = new D();     (O)");
		System.out.println();
		
		System.out.println("C c1 = new A();     (X)");
		System.out.println("C c2 = new B();     (X)");
		System.out.println("C c3 = new C();     (O)");
		System.out.println("C c4 = new D();     (X)");
		System.out.println();
		
		System.out.println("D d1 = new A();     (X)");
		System.out.println("D d2 = new B();     (X)");
		System.out.println("D d3 = new C();     (X)");
		System.out.println("D d4 = new D();     (O)");
		System.out.println();
		
		/*Q4 상속 구조가 다음과 같음. 다음 중 타입 변환이 올바른 것은 O, 잘못된 것은 X에 표시하시오.*/
		System.out.println("Q4 상속 구조가 다음과 같음. 다음 중 타입 변환이 올바른 것은 O, 잘못된 것은 X에 표시하시오.");
		System.out.println();
		
		System.out.println("A <- B <- C <- D");
		System.out.println("     B <- E");
		System.out.println();
		
		System.out.println("A a1 = new A();");
		System.out.println("B b1 = (B)a1     (X)");
		System.out.println("C c1 = (C)a1     (X)");
		System.out.println("D d1 = (D)a1     (X)");
		System.out.println("E e1 = (E)a1     (X)");
		System.out.println();
		
		System.out.println("A a2 = new A();");
		System.out.println("B b2 = (B)a2     (O)");
		System.out.println("C c2 = (C)a2     (X)");
		System.out.println("D d2 = (D)a2     (X)");
		System.out.println("E e2 = (E)a2     (X)");
		System.out.println();
		
		System.out.println("A a3 = new A();");
		System.out.println("B b3 = (B)a3     (O)");
		System.out.println("C c3 = (C)a3     (O)");
		System.out.println("D d3 = (D)a3     (X)");
		System.out.println("E e3 = (E)a3     (X)");
		System.out.println();
		
		/*Q5 상속 구조가 다음과 같을 때 알맞은 출력 결과를 고르시오*/
		System.out.println("Q5 상속 구조가 다음과 같을 때 알맞은 출력 결과를 고르시오");
		System.out.println();
		
		System.out.println("A <- B <- D");
		System.out.println("  <- C");
		System.out.println();
				
		System.out.println("A aa = new A()");
		System.out.println("System.out.println(aa instanceof A)     (O)");
		System.out.println("System.out.println(aa instanceof B)     (X)");
		System.out.println("System.out.println(aa instanceof B)     (X)");
		System.out.println("System.out.println(aa instanceof D)     (X)");
		System.out.println();
		
		System.out.println("A ad = new D()");
		System.out.println("System.out.println(ad instanceof A)     (O)");
		System.out.println("System.out.println(ad instanceof B)     (O)");
		System.out.println("System.out.println(ad instanceof B)     (X)");
		System.out.println("System.out.println(ad instanceof D)     (O)");
		System.out.println();
		
		/*Q6 클래스 A와 B가 다음과 같다.*/ System.out.println("Q6 클래스 A와 B가 다음과 같다.");
		System.out.println();
		
		System.out.println("class A{");
		System.out.println("	void hello() {");
		System.out.println("		System.out.println(\"안녕하세요\");");
		System.out.println("	}");
		System.out.println("}");
		System.out.println("class B extends A{");
		System.out.println("	void hello() {");
		System.out.println("		System.out.println(\"반갑습니다\");");
		System.out.println("	}");
		System.out.println("}");
		System.out.println();
		
		/*다음 실행 코드의 결과를 쓰시오.*/ System.out.println("다음 실행 코드의 결과를 쓰시오.");
		System.out.println();
		
		System.out.println("A aa =  new A();");
		System.out.println("aa.hello();");
		System.out.println();
		System.out.println("B bb = new B();");
		System.out.println("bb.hello();");
		System.out.println();
		System.out.println("A ab = new B();");
		System.out.println("ab.hello();");
		System.out.println();
		
		A aa =  new A();
		aa.hello();
		
		B bb = new B();
		bb.hello();
		
		A ab = new B();
		ab.hello();
		
		/*Q7 다음과 같이 클래스 A를 상속받아 B, C, D, E 클래스를 생성하고자 한다. 다음중 오류를 포함하고 있는*/
		/*   클래스는 무엇이고, 오류가 발생한 이유는 무엇인지 쓰시오.*/
		System.out.println("Q7 다음과 같이 클래스 A를 상속받아 B, C, D, E 클래스를 생성하고자 한다. 다음중 오류를 포함하고 있는");
		System.out.println("   클래스는 무엇이고, 오류가 발생한 이유는 무엇인지 쓰시오.");
		System.out.println();
		
		System.out.println("class AA{");
		System.out.println("	void method() {");
		System.out.println("	}");
		System.out.println("}");
		System.out.println("class BB extends AA{");
		System.out.println("	public void method() {");
		System.out.println("	}");
		System.out.println("}");
		System.out.println("class CC extends AA{");
		System.out.println("	protected void method() {");
		System.out.println("	}");
		System.out.println("}");
		System.out.println("class DD extends AA{");
		System.out.println("	void method() {");
		System.out.println("	}");
		System.out.println("}");
		System.out.println("class EE extends AA{");
		System.out.println("	private void method() {");
		System.out.println("	}");
		System.out.println("}");
		System.out.println();
		
		System.out.println("클래스 E의 경우, 자식 클래스가 오버라이딩을 하게 될 때 자식 클래스 내부의 메서드는 부모 클래스의");
		System.out.println("메서드가 가지는 접근 지정자보다 좁아질 수 없기 때문에 오류가 발생함.");
		
		/*Q8 다음과 같이 인스턴스 멤버와 정적 멤버를 포함하고 있는 클래스 A와 B가 있다.*/
		System.out.println("Q8 다음과 같이 인스턴스 멤버와 정적 멤버를 포함하고 있는 클래스 A와 B가 있다.");
		System.out.println();
		
		System.out.println("class AAA {");
		System.out.println("	int m = 2;");
		System.out.println("	static int n = 4;");
		System.out.println("	void method() {");
		System.out.println("		System.out.println(\"A 클래스 instance method\");");
		System.out.println("	}");
		System.out.println("	static void method2() {");
		System.out.println("		System.out.println(\"A 클래스 static method\");");
		System.out.println("	}");
		System.out.println("}");
		System.out.println("class BBB extends AAA {");
		System.out.println("	int m = 6;");
		System.out.println("	static int n = 8;");
		System.out.println("	void method1() {");
		System.out.println("		System.out.println(\"B 클래스 instance method\");");
		System.out.println("	}");
		System.out.println("	static void method2() {");
		System.out.println("		System.out.println(\"B 클래스 static method\");");
		System.out.println("	}");
		System.out.println("}");
		System.out.println();
		
		/*다음 실행 코드의 결과를 쓰시오.*/ System.out.println("다음 실행 코드의 결과를 쓰시오.");
		System.out.println();
		
		System.out.println("AAA aaabbb = new BBB();");
		System.out.println("System.out.println(aaabbb.m);");
		System.out.println("System.out.println(aaabbb.n);");
		System.out.println("aaabbb.method1();");
		System.out.println("aaabbb.method2();");
		System.out.println();
		
		AAA aaabbb = new BBB();
		System.out.println(aaabbb.m);
		System.out.println(aaabbb.n);
		aaabbb.method1();
		aaabbb.method2(); //static 접근 지정자로 인해서 오버라이딩이 불가능. AAA의 method2()를 그대로 출력함.
		
		/* static의 바인딩 타이밍.
		   
		   바인딩(Binding) 프로그램에서 메소드 호출이나 변수 참조와 실제 실행될 코드나 데이터가 연결되는 과정을 의미함. 바인딩에는 두 종류의
		   유형이 있음. 정적 바인딩(static binding)과 동적 바인딩(dynamic binding).
		 
		   정적 바인딩 (Static Binding)
		   정적 바인딩은 컴파일 시점에 메소드 호출과 실제 메소드가 연결되는 것을 의미함. 즉, 컴파일러가 어떤 메소드를 호출해야 할지 미리
		   결정하는 것. 정적 바인딩은 주로 static 메소드, private 메소드, final 메소드, 그리고 멤버 변수에서 발생함. 이러한 접근
		   지정자들의 특징은 바로 매우 명확solid하다는 것. 복잡한 실행의 결과를 주시할 필요 없이 직관적으로 연결이 가능함.
		   
		   동적 바인딩 (Dynamic Binding)
		   동적 바인딩은 실행 시점에 메소드 호출과 실제 메소드가 연결되는 것을 의미함. 즉, 런타임에 객체의 실제 타입에 따라 호출할 메소드를
		   결정하는 것. 동적 바인딩은 주로 오버라이딩된 인스턴스 메소드에서 발생함. 이는 정적 바인딩에 비해서 고려할 요소들이 많기 때문에
		   실행 과정을 연산해봐야 하는 의미이기도 함.
		 
		 */
		
		/*Q9 다음과 같이 클래스 B는 클래스 A를 상속한 후 내부에 아무것도 추가하지 않은 상태다. 이때 오류가 발생하는 이유를 설명하시오.*/
		System.out.println("Q9 다음과 같이 클래스 B는 클래스 A를 상속한 후 내부에 아무것도 추가하지 않은 상태다. 이때 오류가 발생하는 이유를 설명하시오.");
		System.out.println();
		
		System.out.println("class AAAA{");
		System.out.println("	AAAA(int a){");
		System.out.println("		System.out.println(\"A 생성자\");");
		System.out.println("	}");
		System.out.println("}");
		System.out.println("class BBBB extends AAAA{");
		System.out.println("	// 클래스 내부 내용 없음");
		System.out.println("}");
		System.out.println();
		
		System.out.println("클래스BBBB 내부에 아무 코드가 없더라도, 컴파일러 과정에서 자동으로 추가되는 생성자의 첫줄에 super() 메서드가");
		System.out.println("호출되는데, 이 super는 부모클래스의 기본 생성자를 호출함. 하지만 정작 클래스 AAAA에는 기본 생성자가 없고");
		System.out.println("AAAA(int a) 생성자만 있기 때문에 호출 대상이 없어서 오류가 발생함.");
		System.out.println();
		
		/*Q10 클래스 A5와 B5의 구조는 다음과 같다.*/ System.out.println("Q10 클래스 A5와 B5의 구조는 다음과 같다.");
		System.out.println();

		System.out.println("class A5 {");
		System.out.println("	A5() {");
		System.out.println("		System.out.println(\"A5 생성자1\");");
		System.out.println("	}");
		System.out.println("	A5(int a) {");
		System.out.println("		this();");
		System.out.println("		System.out.println(\"A5 생성자2\");");
		System.out.println("	}");
		System.out.println("}");
		System.out.println("class B5 extends A5{");
		System.out.println("	B5() {");
		System.out.println("		System.out.println(\"B5 생성자1\");");
		System.out.println("	}");
		System.out.println("	B5(int b) {");
		System.out.println("		super();");
		System.out.println("		System.out.println(\"B5 생성자2\");");
		System.out.println("	}");
		System.out.println("}");
		System.out.println();
		
		/*Q11 다음과 같은 클래스 A가 있다.*/ System.out.println("Q11 다음과 같은 클래스 A가 있다.");
		System.out.println();
		
		System.out.println("class A6 {");
		System.out.println("	int data;");
		System.out.println("	A6(int data){");
		System.out.println("		this.data = data;");
		System.out.println("	}");
		System.out.println("}");
		System.out.println();
		
		/*다음 코드의 실행 결과로 false가 출력되는 이유를 설명하시오.*/
		System.out.println("다음 코드의 실행 결과로 false가 출력되는 이유를 설명하시오.");
		System.out.println();
		
		A6 a61 = new A6(3);
		A6 a62 = new A6(3);
		System.out.println(a61.equals(a62)); // false
		System.out.println();
		
		System.out.println("equals() 메서드는 스택 메모리의 값, 즉 객체의 참조 위치를 가지고 비교를 하기 때문에 new 키워드로");
		System.out.println("생성한 a61과 a62는 서로 다른 위치에 존재하기 때문에 false값이 출력됨.");
		System.out.println();
		
		/*Q12 앞선 문제의 코드의 출력값이 true가 되도록 클래스 A6를 수정하시오.*/
		System.out.println("Q12 앞선 문제의 코드의 출력값이 true가 되도록 클래스 A6를 수정하시오.");
		System.out.println();
		
		// 클래스 A6를 바로 수정하면 Q11번 문제의 출력값이 달라지므로 클래스 A7을 외부에 생성하고, 이를 오버라이딩하는 방법으로 진행. 
		
		A6 a71 = new A7(3);
		A6 a72 = new A7(3);
		System.out.println(a71.equals(a72)); // false
		System.out.println();
		

	}
	
}