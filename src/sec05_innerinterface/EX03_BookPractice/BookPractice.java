package sec05_innerinterface.EX03_BookPractice;

class A2{
	class B{
		void bcd() {
			System.out.println("이너 클래스의 메서드");
		}
	}
}

class A3{
	void print() {
		System.out.println("클래스 A 메서드");
	}
	class B{
		void print() {
			System.out.println("클래스 B 메서드");
		}
		void bcd() {
			A3.this.print();
		}
	}
	
}

public class BookPractice {

	public static void main(String[]args) {
		
		//Q1. 다음과 같이 클래스 내부에 이너 클래스와 이너 인터페이스가 위치할 때 컴파일 이후 생성되는
		//    모든 .class 파일명을 쓰시오
		
		System.out.println("Q1. 다음과 같이 클래스 내부에 이너 클래스와 이너 인터페이스가 위치할 때 컴파일 이후 생성되는");
		System.out.println("    모든 .class 파일명을 쓰시오");
		System.out.println();
		
		System.out.println("class A {");
		System.out.println("   class B {}");
		System.out.println("   interface C{}");
		System.out.println("   class D{");
		System.out.println("      void def() {");
		System.out.println("      class E{}");
		System.out.println("      }");
		System.out.println("   }");
		System.out.println("}");
		
		System.out.println("A1.");
		System.out.println();
		
		System.out.println("A.class");
		System.out.println("A$B.class");
		System.out.println("A$C.class");
		System.out.println("A$D.class");
		System.out.println("A$D$1E.class // 클래스 A 내부의, 클래스 D 내부의");  
		System.out.println("             // 첫번째 메서드 내부의, 클래스 E");  

		// Q2. 클래스 A 내부에 이너 클래스 B가 있을 때 다음 코드와 같이 b.bcd()의 결과가
		//     "이너 클래스의 메서드"로 출력되도록 이너 클래스 객체를 생성하는 코드를 작성하시오.
		
		System.out.println("Q2. 클래스 A 내부에 이너 클래스 B가 있을 때 다음 코드와 같이 b.bcd()의 결과가");
		System.out.println("    \"이너 클래스의 메서드\"로 출력되도록 이너 클래스 객체를 생성하는 코드를 작성하시오.");
		System.out.println();
		
		System.out.println("class A2{");
		System.out.println("	class B{");
		System.out.println("		void bcd() {");
		System.out.println("			System.out.println(\"이너 클래스의 메서드\");");
		System.out.println("		}");
		System.out.println("	}");
		System.out.println("}");
		System.out.println();
		
		System.out.println("-- 들어갈 내용 --");
		
		System.out.println("A2 a = new A2();");
		System.out.println("A2.B b = a.new B();");
		A2 a = new A2();
		A2.B b = a.new B();
		System.out.println("-- 들어갈 내용 --");
		System.out.println();
		
		b.bcd();
		
		System.out.println();
		
		//Q3. 실행 결과가 "클래스 A 메서드"가 나오도록 이너 클래스 B의 bcd() 메서드에서
		//    클래스 A의 print() 메서드를 호출하는 코드를 작성하시오.
		
		System.out.println("Q3. 실행 결과가 \"클래스 A 메서드\"가 나오도록 이너 클래스 B의 bcd() 메서드에서");
		System.out.println("    클래스 A의 print() 메서드를 호출하는 코드를 작성하시오.");
		System.out.println();
		
		A3 a3 = new A3();
		A3.B ab3 = a3.new B();
		
		ab3.bcd();
	}
	
}
