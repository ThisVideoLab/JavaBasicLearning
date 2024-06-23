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
	System.out.println("다음과 같은 추상 클래스 A3가 정의돼 있다. 실행 코드가 \"반갑습니다\"를 출력하도록");
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
	
	}
	
}
