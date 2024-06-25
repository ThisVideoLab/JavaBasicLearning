package sec02_interface.EX11_BookPractice;

abstract class A1{
	abstract void abc(); 
}

class B1 extends A1{
	 void abc() {}
}

abstract class A2{
	abstract void abc(); 
}

class B2 extends A2{
	@Override
	void abc() {
		System.out.println("안녕하세요");
	}
}

abstract class A3{
	abstract void abc(); 
}

interface A6{
}
interface B6{
}
class C6{
}
class D6 extends C6 implements A6, B6 {
}


interface A7{
	void abc();
}

class B7 implements A7{
	public void abc() {
		// ...
	};
	
}

interface A8{
	default void abc() {
		System.out.println("A8 인터페이스의 abc()");
	}
}

class B8 implements A8 {
	@Override
	public void abc() {
		A8.super.abc(); // 들어갈 내용
		System.out.println("B8 클래스의 abc()");
	}
}

public class BookPractice {

	public static void main(String[]args) {
		
	//Q1 다음은 추상 클래스 A를 상속해 클래스 B를 정의한 코드로, 오류를 포함하고 있다.
	//   오류가 발생한 이유와 그 해결책을 쓰시오.
	System.out.println("Q1 다음은 추상 클래스 A1 상속해 클래스 B1를 정의한 코드로, 오류를 포함하고 있다.");
	System.out.println("   오류가 발생한 이유와 그 해결책을 쓰시오.");
	System.out.println();
	
	System.out.println("abstract class A1{");
	System.out.println("	abstract void abc();");
	System.out.println("}");
	System.out.println();
	System.out.println("class B1 extends A1{");
	System.out.println("");
	System.out.println("}");
	System.out.println();
	
	System.out.println("추상 클래스를 상속하는 일반 클래스는 반드시 부모 클래스 내에 있는 메서드를");
	System.out.println("구체화해야 함.");
	
	//Q2 다음과 같이 클래스 A와 클래스 B의 상속 관계가 있을 때 실행 코드(a.abc())의 결과가 
	//   "안녕하세요"가 나오도록 클래스 B 내부의 코드를 완성하시오.
	System.out.println("Q2 다음과 같이 클래스 A2와 클래스 B2의 상속 관계가 있을 때 실행 코드(a.abc())의 결과가");
	System.out.println("   \"안녕하세요\"가 나오도록 클래스 B2 내부의 코드를 완성하시오.");
	System.out.println();
	
	System.out.println("abstract class A2{");
	System.out.println("	abstract void abc();");
	System.out.println("}");
	System.out.println();
	System.out.println("class B2 extends A2{");
	System.out.println("");
	System.out.println("}");
	System.out.println();
	
	System.out.println("A2 a2 = new B2();");
	System.out.println("a2.abc();");

	System.out.println("추상 메서드를 상속했으므로, 오류가 나지 않도록 abc() 메서드를 구현하면서");
	System.out.println("해당 메서드 안에 안녕하세요를 입력해면 됨.");
	
	A2 a2 = new B2();
	a2.abc();
	
	//Q3 다음과 같은 추상 클래스 A가 정의돼 있다. 실행 코드가 "반갑습니다"를 출력하도록
	//   익명 이너클래스를 이용해 객체를 생성하는 코드를 완성하시오.
	System.out.println("Q3 다음과 같은 추상 클래스 A3가 정의돼 있다. 실행 코드가 \"반갑습니다\"를 출력하도록");
	System.out.println("   익명 이너클래스를 이용해 객체를 생성하는 코드를 완성하시오.");
	System.out.println();
	
	System.out.println("abstract class A3{");
	System.out.println("	abstract void abc();");
	System.out.println("}");
	System.out.println();
	
	System.out.println("A3 a3 = ");
	System.out.println();
	System.out.println("a3.abc();");
	System.out.println();
	
	System.out.println("A3 a3 = ");
	System.out.println("        @Override");
	System.out.println("        void abc(){");
	System.out.println("           System.out.println(\"반갑습니다\");");
	System.out.println("        }");
	System.out.println("}");

	//Q4 추상 클래스의 객체를 생성하는 방법은 크게 다음과 같다. 각 방법의 장단점을 기술하시오.
	//   1) 추상 클래스를 일반 클래스로 상속해 객체 생성
	//   2) 익명 이너 클래스 사용
	
	System.out.println("Q4 추상 클래스의 객체를 생성하는 방법은 크게 다음과 같다. 각 방법의 장단점을 기술하시오.");
	System.out.println("   1) 추상 클래스를 일반 클래스로 상속해 객체 생성");
	System.out.println("   2) 익명 이너 클래스 사용");
	System.out.println();	
	
	System.out.println("1) 장점 - 다수의 객체를 생성할 경우, 클래스의 생성자로 빠르게 생성 가능");
	System.out.println("   단점 - 추가 클래스를 따로 정의해야 함.");
	System.out.println("2) 장점 - 일회성으로 객체를 생성할 경우, 별도의 클래스 정의가 필요 없음");
	System.out.println("   단점 - 다수의 객체를 생성할 경우 계속 오버로딩을 코드로 짜야 함.");
	System.out.println();
	
	//Q5 다음은 클래스와 인터페이스 간의 상속 문법이다. extrends, implements, 
	//   불가능 중 적절한 상속 키워드를 넣으시오.
	
	System.out.println("Q5 다음은 클래스와 인터페이스 간의 상속 문법이다. extrends, implements,");
	System.out.println("   불가능 중 적절한 상속 키워드를 넣으시오.");
	System.out.println();
	
	System.out.println("클래스 ( 1 ) 클래스 {");
	System.out.println("   //... ");
	System.out.println("}");
	System.out.println("인터페이스 ( 2 ) 인터페이스 {");
	System.out.println("   //... ");
	System.out.println("}");
	System.out.println("클래스 ( 3 ) 인터페이스 {");
	System.out.println("   //... ");
	System.out.println("}");
	System.out.println("인터페이스 ( 4 ) 클래스 {");
	System.out.println("   //... ");
	System.out.println("}");
	System.out.println();
	
	System.out.println("1) extends");
	System.out.println("2) extends");
	System.out.println("3) implements");
	System.out.println("3) 불가능");
	
	//Q6 다음과 같이 클래스 D가 인터페이스 A, B, 클래스 C를 상속하고자 할 때의 상속 문법을 완성하시오.
	System.out.println("Q6 다음과 같이 클래스 D가 인터페이스 A, B, 클래스 C를");
	System.out.println("   상속하고자 할 때의 상속 문법을 완성하시오.");
	System.out.println();
	
	System.out.println("interface A6{");
	System.out.println("}");
	System.out.println("interface B6{");
	System.out.println("}");
	System.out.println("class C6{");
	System.out.println("}");
	System.out.println("class D6 ( ? ) {");
	System.out.println("}");
	System.out.println();
	
	System.out.println("정답: ");
	System.out.println("extends C6 implements A6, B6");
	System.out.println();
	
	//Q7 다음과 같이 클래스 D가 인터페이스 A, B, 클래스 C를 상속하고자 할 때의 상속 문법을 완성하시오. 
	//   불가능 중 적절한 상속 키워드를 넣으시오.
	
	System.out.println("Q7 다음과 같이 클래스 D가 인터페이스 A, B, 클래스 C를 상속하고자 할 때의");
	System.out.println("   상속 문법을 완성하시오.");
	System.out.println();
	
	System.out.println("interface A7{");
	System.out.println("	void abc();");
	System.out.println("}");
	System.out.println();
	System.out.println("class B7 implements A7{");
	System.out.println("	void abc() {");
	System.out.println("		// ...");
	System.out.println("	};");
	System.out.println("}");
	System.out.println();
	
	System.out.println("오류 발생 사유:");
	System.out.println("인터페이스 내부의 모든 메서드는 public 접근 지정자가 붙음. 따라서 해당");
	System.out.println("자식 클래스의 메서드가 추상 클래스의 접근 지정자보다 좁아서 오류가 발생함");
	System.out.println("");
	
	System.out.println("해결책:");
	System.out.println("자식 클래스 내부의 abc() 메서드의 접근 지정자를 public으로 변경");
	
	//Q8 다음 인터페이스 A는 디폴트 메서드를 포함하고 있다. 자식 클래스에서 부모 클래스의
	//   abc() 메서드를 홀출하는 코드를 추가해 다음과 같은 실행 결과가 나오도록 빈칸을 완성하시오.
	
	System.out.println("Q8 다음 인터페이스 A는 디폴트 메서드를 포함하고 있다. 자식 클래스에서 부모 클래스의");
	System.out.println("   abc() 메서드를 홀출하는 코드를 추가해 다음과 같은 실행 결과가 나오도록 빈칸을 완성하시오.");
	System.out.println();

	System.out.println("interface A8{");
	System.out.println("	default void abc() {");
	System.out.println("		System.out.println(\"A8 인터페이스의 abc()\");");
	System.out.println("	}");
	System.out.println("}");
	System.out.println();
	System.out.println("class B8 implements A8 {");
	System.out.println("	@Override");
	System.out.println("	public void abc() {");
	System.out.println("		// 들어갈 내용");
	System.out.println("		System.out.println(\"B8 클래스의 abc()\");");
	System.out.println("	}");
	System.out.println("}");
	System.out.println();
	System.out.println("B8 b8 = new B8();");
	System.out.println("b8.abc();");
	System.out.println();
	
	System.out.println("들어갈 내용:");
	System.out.println("A8.super.abc();");
	System.out.println();
	
	B8 b8 = new B8();
	b8.abc();
	
	}
	
}
