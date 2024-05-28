package sec02_externalclass.EX3_BookPractice;

import sec02_externalclass.EX3_BookPractice.pack01.A;

public class BookPractice {

	public static void main(String[]args) {
		
		/*Q1 패키지를 사용하는 2가지 이유를 쓰시오.*/ System.out.println("Q1 패키지를 사용하는 2가지 이유를 쓰시오.");
		System.out.println();
		
		System.out.println("A1: 패키지를 사용할 경우에는 관련있는 파일들을 패키지 안에 수납해 폴더처럼 사용해 관리의 용이성을 높힘");
		System.out.println("A2: 패키지 명을 달리할 수 있어서 중복되는 이름의 클래스 간의 충돌을 방지 가능함");
		System.out.println();
		
		/*Q2~3 다음과 같이 pack01 패키지 내부에는 클래스 A, pack02 패키지 내부에는 클래스B가 정의돼 있음. 클래스 B 내부의 bcd() 메서드를*/
		/*     실행해 클래스 A의 객체를 생성한 후 필드를 출력하려고 하니 오류가 발생했다.  이를 참고해 Q2~3 에 답하라.*/
		System.out.println("Q2~3 다음과 같이 pack01 패키지 내부에는 클래스 A, pack02 패키지 내부에는 클래스B가 정의돼 있음. 클래스 B 내부의 bcd() 메서드를");
		System.out.println("     실행해 클래스 A의 객체를 생성한 후 필드를 출력하려고 하니 오류가 발생했다. 이를 참고해 Q2~3 에 답하라.");
		System.out.println();
		
		System.out.println("package sec02_externalclass.EX3_BookPractice.pack01;");
		System.out.println();
		System.out.println("public class A {");
		System.out.println("	public int m = 3;");
		System.out.println("	public int n = 5;");
		System.out.println("}");
		System.out.println();
		
		System.out.println("----------------------------------------------------");
		System.out.println();
		
		System.out.println("package sec02_externalclass.EX3_BookPractice.pack01;"); 
		System.out.println(); 
		System.out.println("public class B {"); 
		System.out.println("	void bcd(){"); 
		System.out.println("		A a = new A(); // 오류 발생"); 
		System.out.println("		System.out.println(a.m);"); 
		System.out.println("		System.out.println(a.n);"); 
		System.out.println("	}"); 
		System.out.println("}"); 
		System.out.println(); 
		
		/*Q2 임포트를 사용하지 않고 클래스 B의 코드를 수정하시오.*/ System.out.println("Q2 임포트를 사용하지 않고 클래스 B의 코드를 수정하시오.");
		System.out.println();
		
		System.out.println("클래스 B에서 다른 패키지의 클래스A를 써주려면 풀네임을 써야 함. 고로 수정할 코드 내용은 다음과 같음.");
		System.out.println("sec02_externalclass.EX3_BookPractice.pack01.A a =");
		System.out.println("new sec02_externalclass.EX3_BookPractice.pack01.A();");
		System.out.println();
		
		/* 클래스 B에서 다른 패키지의 클래스A를 써주려면 풀네임을 써야 함. 고로 수정할 코드 내용은 다음과 같음.
		   sec02_externalclass.EX3_BookPractice.pack01.A a =
		   new sec02_externalclass.EX3_BookPractice.pack01.A();
	     */
		
		/*Q3 임포트를 사용해 클래스 B의 코드를 수정하시오.*/ System.out.println("Q3 임포트를 사용해 클래스 B의 코드를 수정하시오.");
		System.out.println();
		
		System.out.println("임포트를 사용하기 위해서는 원하는 클래스의 풀네임을 import에 넣어줘야 함. 그리고 이 문장은 패키지명과 외부 클래스 사이에 위치해야 함.");
		System.out.println("import sec02_externalclass.EX3_BookPractice.pack01.A;");
		System.out.println();
		
		/* 임포트를 사용하기 위해서는 원하는 클래스의 풀네임을 import에 넣어줘야 함. 그리고 이 문장은 패키지명과 외부 클래스 사이에 위치해야 함.
		   import sec02_externalclass.EX3_BookPractice.pack01.A;
		 */
		
		/*Q3 임포트를 사용해 클래스 B의 코드를 수정하시오.*/ System.out.println("Q3 임포트를 사용해 클래스 B의 코드를 수정하시오.");
		System.out.println("클래스 B의 소스 코드에 import sec02_externalclass.EX3_BookPractice.pack01.A; 를 추가함");
		System.out.println();
		
	}
}
