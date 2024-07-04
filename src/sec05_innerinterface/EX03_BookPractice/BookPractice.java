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

class A4{
	static class B{
		void bcd() {
			System.out.println("정적 이너 클래스의 메서드");
		}
	}
}

class A6{
	int m = 3;
	int n = 5;
	void abc() {
		int n = 5;
		class B{
			void bcd() {
				m = m + 1; System.out.println(m);
				A6.this.n = n + 1; System.out.println(n);
			}
		}
	}
}

class A7{
	interface B{
		void abc();
	}
}

class A8{
	interface B{
		static void bcd() {
			System.out.println("이너 인터페이스 내 static 메서드");
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
		System.out.println();

		//Q4. 클래스 A 내부에 정적 이너 클래스 B가 있을 때 다음 코드와 같이 b.bcd()의 결과가 
		//    "정적 이너 클래스의 메서드"가 출력되도록 정적 이너 클래스의 객체를 생성하는 코드를 작성하시오.
		
		System.out.println("Q4. 클래스 A 내부에 정적 이너 클래스 B가 있을 때 다음 코드와 같이 b.bcd()의 결과가");
		System.out.println("    \"정적 이너 클래스의 메서드\"가 출력되도록 정적 이너 클래스의 객체를 생성하는 코드를 작성하시오.");
		System.out.println();
		
		System.out.println("class A4{");
		System.out.println("	static class B{");
		System.out.println("		void bcd() {");
		System.out.println("			System.out.println(\"정적 이너 클래스의 메서드\");");
		System.out.println("		}");
		System.out.println("	}");
		System.out.println("}");
		System.out.println();
		
		System.out.println("// 정적 이너 클래스의 B의 객체 생성(참조 변수명 ab)");
		System.out.println("-이 칸에 가야할 코드를 작성하시오.-");
		System.out.println("ab4.bcd();");
		System.out.println();
		
		System.out.println("A4:");
		System.out.println("A4.B ab = new A4.B();");
		
		A4.B ab4 = new A4.B();
		ab4.bcd();
		
		System.out.println();
		
		//Q5. 다음과 같이 이너 클래스 B는 bcd() 메서드를 포함하고 있으며, 여기에는 4줄의 실행문이
		//    포함돼 있음. 각 실행문의 가능 여부를 O, X로 표기하고 X라면 그 이유를 쓰시오.
		
		System.out.println("Q5. 다음과 같이 이너 클래스 B는 bcd() 메서드를 포함하고 있으며, 여기에는 4줄의 실행문이");
		System.out.println("    포함돼 있음. 각 실행문의 가능 여부를 O, X로 표기하고 X라면 그 이유를 쓰시오.");
		System.out.println();
		
		System.out.println("class A5 {");
		System.out.println("	int a = 3;");
		System.out.println("	static int b = 4;");
		System.out.println("	void method1() {");
		System.out.println("	}");
		System.out.println("	static void method2() {");
		System.out.println("	}");
		System.out.println("");
		System.out.println("	static class B{");
		System.out.println("		void bcd() {");
		System.out.println("			System.out.println(a);");
		System.out.println("			System.out.println(b);");
		System.out.println("			method1();");
		System.out.println("			method2();");
		System.out.println("		}");
		System.out.println("	}");
		System.out.println("}");
		System.out.println();
		
		System.out.println("A5:");
		System.out.println("System.out.println(a); = X");
		System.out.println("System.out.println(b); = O");
		System.out.println("method1(); = x");
		System.out.println("method2(); = O");
		System.out.println();
		
		System.out.println("static 클래스에서는 외부의 static 멤버들만 사용 가능함 ");
		
		//Q6. 다음 코드는 오류를 포함하고 있다. 오류가 발생한 위치와 그 이유를 설명하시오.
		
		System.out.println("Q6. 다음 코드는 오류를 포함하고 있다. 오류가 발생한 위치와 그 이유를 설명하시오.");
		System.out.println();
		
		System.out.println("class A6{");
		System.out.println("	int m = 3;");
		System.out.println("	int n = 5;");
		System.out.println("	void abc() {");
		System.out.println("		int n = 5;");
		System.out.println("		class B{");
		System.out.println("			void bcd() {");
		System.out.println("				m = m + 1; System.out.println(m);");
		System.out.println("				n = n + 1; System.out.println(n);");
		System.out.println("			}");
		System.out.println("		}");
		System.out.println("	}");
		System.out.println("}");
		System.out.println();
		
		System.out.println("A6:");
		System.out.println("n = n + 1; System.out.println(n); 에서 오류 발생");
		System.out.println("지역 이너 클래스의 내부에서 사용되는 지역 변수는 final로 강제 선언되기");
		System.out.println("때문에 값을 바꿀 수 없음. 동일한 값 자체도 대입이 불가능함.");
		
		//Q7. 다음과 같이 클래스 A 내에 이너 인터페이스 B가 있을 때 이너 인터페이스의 객체를 생성하는
		//    코드를 익명 이너 클래스 방법으로 작성하시오.(객체의 변수명은 ab로 하고, 메서드 오버라이딩일 때
		//    메서드 내부는 비워둠)
		
		System.out.println("Q7. 다음과 같이 클래스 A 내에 이너 인터페이스 B가 있을 때 이너 인터페이스의 객체를 생성하는");
		System.out.println("    코드를 익명 이너 클래스 방법으로 작성하시오.(객체의 변수명은 ab로 하고, 메서드 오버라이딩일 때");
		System.out.println("    메서드 내부는 비워둠)");
		System.out.println();
		
		System.out.println("class A7{");
		System.out.println("	interface B{");
		System.out.println("		void abc();");
		System.out.println("	}");
		System.out.println("}");
		System.out.println();
		
		System.out.println("// 이너 인터페이스의 객체 생성(익명 이너 클래스 이용)");
		System.out.println("- 코드를 작성하시오 -");
		System.out.println("a.abc();");
		System.out.println();
		System.out.println("A7:");
		System.out.println("A7.B ab = new A7.B() {");
		System.out.println("	@Override");
		System.out.println("	public void abc() {}");
		System.out.println("};");
		System.out.println();
		
		A7.B ab = new A7.B() {
			@Override
			public void abc() {}
		};
		ab.abc();

		//Q8. 다음과 같이 이너 인터페이스 내부에 static 메서드가 있을 때 이 메서드를 호출하는
		//    코드를 작성하시오.
		
		System.out.println("Q8. 다음과 같이 이너 인터페이스 내부에 static 메서드가 있을 때 이 메서드를 호출하는");
		System.out.println("    코드를 작성하시오.");
		System.out.println();
		
		System.out.println("class A8{");
		System.out.println("	interface B{");
		System.out.println("		static void bcd() {");
		System.out.println("			System.out.println(\"이너 인터페이스 내 static 메서드\");");
		System.out.println("		}");
		System.out.println("	}");
		System.out.println("}");
		System.out.println();
		
		System.out.println("// 이너 인터페이스의 static 메서드 호출");
		System.out.println("- 코드를 작성하시오 -");
		System.out.println("}");
		System.out.println();
		
		System.out.println("A8:");
		System.out.println("A8.B.bcd();");
		
		A8.B.bcd();
		
	}
	
}
