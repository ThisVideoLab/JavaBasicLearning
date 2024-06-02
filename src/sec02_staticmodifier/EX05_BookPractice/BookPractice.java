package sec02_staticmodifier.EX05_BookPractice;

import sec02_staticmodifier.EX05_BookPractice.pack01.A;

class Q4A{
	int a = 2;
	static int b = 3;
	void abc() {
		System.out.println(a);
		System.out.println(b);
	}
	static void bcd() {
		// System.out.println(a);
		System.out.println(b);
	}
}

class Q5A{
	int a = 3;
	static int b = 5;
}

class Q6A{
	static int a;
	static {
		a = 8;
	}
	
}

public class BookPractice {

	public static void main(String[]args) {
		
		/*Q1. 클래스의 내부에 올 수 있는 4가지 구성 요소(필드, 메서드, 생성자, 이너 클래스)에서 사용 가능한 접근 지정자를 범위가 큰 순서대로 쓰시오.*/
		System.out.println("Q1. 클래스의 내부에 올 수 있는 4가지 구성 요소(필드, 메서드, 생성자, 이너 클래스)에서 사용 가능한 접근 지정자를 범위가 큰 순서대로 쓰시오.");
		
		System.out.println("public > protected > default > private");
		System.out.println();
		
		/*Q2. 클래스 자체에 사용할 수 있는 접근 지정자를 접근 범위가 큰 순서대로 쓰시오.*/ System.out.println("Q2. 클래스 자체에 사용할 수 있는 접근 지정자를 접근 범위가 큰 순서대로 쓰시오.");
		System.out.println("public > default");
		System.out.println();
		
		/*Q3. 패키지 pack01 내에서는 A.java, B.java 파일,패키지 pack02 내에는 C.java, D.java 파일이 있다. 이들 4개의 소스 파일에서*/
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
		
		/*4. 다음 코드는 오류를 포함하고 있다. 오류가 발생한 위치와 그 이유를 설명하시오.*/
		System.out.println("4. 다음 코드는 오류를 포함하고 있다. 오류가 발생한 위치와 그 이유를 설명하시오.");
		System.out.println();
		
		System.out.println("class Q4A{");
		System.out.println("	int a = 2;");
		System.out.println("	static int b = 3;");
		System.out.println("	void abc() {");
		System.out.println("		System.out.println(a);");
		System.out.println("		System.out.println(b);");
		System.out.println("	}");
		System.out.println("	static void bcd() {");
		System.out.println("		System.out.println(a);");
		System.out.println("		System.out.println(b);");
		System.out.println("	}");
		System.out.println("}");
		System.out.println();
		
		System.out.println("static void bcd() 메서드 내에 있는 변수 a에서 오류가 발생함. class Q4A가 생성되는 과정에서");
		System.out.println("클래스 내부에 포함되어 힙영역에 저장되는 반면 인스턴스 영역은 힙 영역에 생성되기 때문에 인스턴스 내부에서");
		System.out.println("대상을 가리키는 인스턴스 변수는 메서드가 작동함과 동시에 힙 영역에 생성됨. 그런데 힙영역에서 this 키워드를");
		System.out.println("사용해서 static int a를 지정하려 해도 대상이 힙 영역에 없기 때문에 오류가 발생함.");
		
		/*5. 다음과 같이 1개의 인스턴스 필드(a)와 1개의 정적 필드(b)를 포함하고 있는 클래스 A가 정의돼 있다.*/
		System.out.println("5. 다음과 같이 1개의 인스턴스 필드(a)와 1개의 정적 필드(b)를 포함하고 있는 클래스 A가 정의돼 있다.");
		System.out.println();
		
		System.out.println("class Q5A{");
		System.out.println("	int a = 3;");
		System.out.println("	static int b = 5;");
		System.out.println();
		
		/*이때 다음 코드의 실행 결과를 쓰시오.*/ System.out.println("이때 다음 코드의 실행 결과를 쓰시오.");
		System.out.println();
		
		System.out.println("Q5A q5a1 = new Q5A();");
		System.out.println("Q5A q5a2 = new Q5A();");
		System.out.println();
		System.out.println("q5a1.a = 30;");
		System.out.println("");
		System.out.println("q5a1.b = 40;");
		System.out.println();
		System.out.println("q5a2.a = 50;");
		System.out.println("q5a2.b = 60;");
		System.out.println();
		
		Q5A q5a1 = new Q5A();
		Q5A q5a2 = new Q5A();
		
		System.out.println("출력 결과:");		
		System.out.println();		
		q5a1.a = 30;
		q5a1.b = 40;
		
		q5a2.a = 50;
		q5a2.b = 60;
		
		System.out.println(q5a1.a);
		System.out.println(q5a1.b);
		System.out.println();
		
		System.out.println(q5a2.a);
		System.out.println(q5a2.b);
		System.out.println();
		
		/*6. 클래스 A가 다음과 같이 공란으로 선언돼 있다. 이 때 출력부분의 결과값이 8이 나오토록 클래스 A를 완성하시오.*/
		System.out.println("6. 클래스 Q6A가 다음과 같이 공란으로 선언돼 있다. 이 때 출력부분의 결과값이 8이 나오토록 클래스 Q6A를 완성하시오.");
		System.out.println();
		
		System.out.println("class Q6A{");
		System.out.println();
		System.out.println("	// 공란");
		System.out.println();
		System.out.println("}");
		System.out.println();
		
		System.out.println("출력부: ");
		System.out.println("System.out.println(Q6A.a);");
		System.out.println();
		
		System.out.println("공란에 들어갈 내용: ");
		System.out.println("	static {");
		System.out.println("		a = 8;");
		System.out.println("	}");
		System.out.println();
			
		System.out.println(Q6A.a);
		
	}
	
}
