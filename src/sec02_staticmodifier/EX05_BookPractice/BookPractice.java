package sec02_staticmodifier.EX05_BookPractice;

import sec02_staticmodifier.EX05_BookPractice.pack01.A;

public class BookPractice {

	public static void main(String[]args) {
		
		/*Q1. 클래스의 내부에 올 수 있는 4가지 구성 요소(필드, 메서드, 생성자, 이너 클래스)에서 사용 가능한 접근 지정자를 범위가 큰 순서대로 쓰시오.*/
		System.out.println("Q1. 클래스의 내부에 올 수 있는 4가지 구성 요소(필드, 메서드, 생성자, 이너 클래스)에서 사용 가능한 접근 지정자를 범위가 큰 순서대로 쓰시오.");
		
		System.out.println("public > protected > default > private");
		System.out.println();
		
		/*Q2. 패키지 pack01 내에서는 A.java, B.java 파일,패키지 pack02 내에는 C.java, D.java 파일이 있다. 이들 4개의 소스 파일에서*/
		System.out.println("Q2. 패키지 pack01 내에서는 A.java, B.java 파일,패키지 pack02 내에는 C.java, D.java 파일이 있다. 이들 4개의 소스 파일에서");
		/*클래스 A에 포함된 4개의 필드를 사용할 때, 각 클래스 위치에서 사용할 수 있는 모든 필드를 쓰시오.*/
		System.out.println("클래스 A에 포함된 4개의 필드를 사용할 때, 각 클래스 위치에서 사용할 수 있는 모든 필드를 쓰시오.");
		System.out.println();
		
		System.out.println("package sec02_staticmodifier.EX05_BookPractice.pack01;");
		System.out.println("");
		System.out.println("public class A {");
		System.out.println("   public int a;");
		System.out.println("   protected int b;");
		System.out.println("   int c;");
		System.out.println("   private int d;");
		System.out.println("");
		System.out.println("   void abc() {");
		System.out.println("		//System.out.println(this.□); 의 형식으로 출력할 것");
		System.out.println("		// a, b, c, d 중 사용 가능한 모든 필드를 입력할 것");
		System.out.println("		System.out.println(this.a);");
		System.out.println("		System.out.println(this.b);");
		System.out.println("		System.out.println(this.c);");
		System.out.println("		System.out.println(this.d);");
		System.out.println("   }");
		System.out.println("}");
		System.out.println();
		
		System.out.println("package sec02_staticmodifier.EX05_BookPractice.pack01;");
		System.out.println("");
		System.out.println("public class B {");
		System.out.println("	void bcd() {");
		System.out.println("		A a = new A();");
		System.out.println("		//System.out.println(a.□); 의 형식으로 출력할 것");
		System.out.println("		// a, b, c, d 중 사용 가능한 모든 필드를 입력할 것");
		System.out.println("		System.out.println(a.a);");
		System.out.println("		System.out.println(a.b);");
		System.out.println("		System.out.println(a.c);");
		System.out.println("		// System.out.println(a.d); // private는 해당 클래스 내에서만 사용 가능");
		System.out.println("	}");
		System.out.println("}");
		System.out.println();
		
		System.out.println("package sec02_staticmodifier.EX05_BookPractice.pack02;");
		System.out.println("");
		System.out.println("import sec02_staticmodifier.EX05_BookPractice.pack01.A;");
		System.out.println("");
		System.out.println("public class C {");
		System.out.println("	void cde() {");
		System.out.println("		A a = new A();");
		System.out.println("		//System.out.println(a.□); 의 형식으로 출력할 것");
		System.out.println("		// a, b, c, d 중 사용 가능한 모든 필드를 입력할 것");
		System.out.println("		System.out.println(a.a);");
		System.out.println("		// System.out.println(a.b); // 같은 패키지 또는 자식 클래스 내에서만 사용 가능");
		System.out.println("		// System.out.println(a.c); // 같은 패키지 내에서만 사용 가능");
		System.out.println("		// System.out.println(a.d); // 같은 클래스 내에서만 사용 가능");
		System.out.println("	}");
		System.out.println("}");
		System.out.println();
		
		System.out.println("package sec02_staticmodifier.EX05_BookPractice.pack02;");
		System.out.println("");
		System.out.println("import sec02_staticmodifier.EX05_BookPractice.pack01.A;");
		System.out.println("");
		System.out.println("public class D extends A {");
		System.out.println("	void def() {");
		System.out.println("		//System.out.println(this.□); 의 형식으로 출력할 것");
		System.out.println("		// a, b, c, d 중 사용 가능한 모든 필드를 입력할 것");
		System.out.println("		System.out.println(this.a);");
		System.out.println("		System.out.println(this.b); // 상속받았기 때문에 가능함");
		System.out.println("		// System.out.println(this.c); // 다른 패키지이므로 불가능");
		System.out.println("		// System.out.println(this.d); // 다른 패키지이므로 불가능");
		System.out.println("	}");
		System.out.println("}");
		System.out.println();
		
	}
	
}
