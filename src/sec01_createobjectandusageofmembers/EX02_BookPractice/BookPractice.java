package sec01_createobjectandusageofmembers.EX02_BookPractice;

class A{
	int m;
	void method() {
		System.out.println("외부 클래스 A 내 메서드를 출력한 결과입니다.");
	}
}

public class BookPractice {
	
	public static void main(String[]args) {
		
		// 6장 연습문제
		
		/*Q1 클래스 내부에 올 수 있는 4가지 구성요소와 외부에 올 수 있는 3가지 구성요소를 쓰시오.*/
		System.out.println("Q1 클래스 내부에 올 수 있는 4가지 구성요소와 외부에 올 수 있는 3가지 구성요소를 쓰시오.");
		
		/*클래스 내부*/	System.out.println("클래스 내부");
		System.out.println("필드, 메서드, 생성자, 이너 클래스");
		
		/*클래스 외부*/	System.out.println("클래스 외부");
		System.out.println("패키지, 임포트, 외부 클래스");
		
		/*Q2 다음과 같이 클래스 A가 정의돼 있을 때 다음 코드를 작성하시오.*/
		System.out.println("Q2 다음과 같이 클래스 A가 정의돼 있을 때 다음 코드를 작성하시오.");
		System.out.println();
		
		System.out.println("class A{");
		System.out.println("	int m;");
		System.out.println("	void method() {");
		System.out.println("		System.out.println(\"외부 클래스 A 내 메서드\");");
		System.out.println("	}");
		System.out.println("}");
		System.out.println("// 외부 클래스인 관계로 부득이하게 아래가 아닌 프로젝트 상단에 기재함");
		System.out.println();
		
		/*참조변수 a를 선언하고 클래스 A의 객체를 생성하시오.*/ System.out.println("참조변수 a를 선언하고 클래스 A의 객체를 생성하시오.");
		
		System.out.println("A a = new A();");
		A a = new A();
		System.out.println();
		
		/*객체 내부의 필드 m에 대한 값 5를 대입하시오.*/ System.out.println("객체 내부의 필드 m에 대한 값 5를 대입하시오.");
		
		System.out.println("a.m = 5;");
		a.m = 5;
		System.out.println();
		
		/*필드 m의 값을 콘솔에 출력하시오.*/ System.out.println("필드 m의 값을 콘솔에 출력하시오.");
		
		System.out.println("System.out.println(a.m);");
		System.out.println(a.m);
		System.out.println();
		
		/*메서드 method()를 호출하시오.*/ System.out.println("메서드 method()를 호출하시오.");
		System.out.println("a.method();");
		a.method();
		System.out.println();
		
	}

}
