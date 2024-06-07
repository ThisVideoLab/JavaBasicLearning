package sec03_methodoverriding.EX03_MethodOverriding_3;

class A {
	void print1() {
		System.out.println("A 클래스 print1");
	}
	void print2() {
		System.out.println("A 클래스 print2");
	}
}

class B extends A {
	@Override
	void print1() {
		System.out.println("B 클래스 print1");
	}
	void print2(int a) {
		System.out.println("B 클래스 print2");
	}
}

public class MethodOverriding_3 {

	public static void main(String[]args) {
		
		/* 10.3.3 메서드 오버라이딩과 메서드 오버로딩 
		   
		   간혹 메서드 오버라이딩과 메서드 오버로딩의 혼동이 있을 수 있음. 오버로딩은 이름은 동일하지만 시그니처가 다른 여러개의 메서드를 같은
		   공간에서 정의하는 것을 의미함. 오버라이딩과 오버로딩을 폴더 내의 파일에 빗대어 이해해보자. 오버라이딩은 파일명과 확장명이 완벽하게
		   동일한 파일을 같은 공간에 복사하는 경우에 해당함. 이때는 익히 아는 파일 덮어쓰기가 수행될 것임. 반면 오버로딩은 파일명은 동일하지만
		   확장자가 다른 파일들(jpg, bmp, jpeg 등)을 같은 폴더에 복사해 넣는 경우에 해당함. 이때 각각의 파일은 확장자로 인해 서로 다른
		   객체로 인식되어 모두 같은 공간에 존재할 수 있음. 예시를 위해 외부 클래스 A와 B를 살펴보자. 
		   이때 클래스 B에서 사용 할 수 있는 메서드의 갯수는 총 3개임. 먼저 자신의 내부에 있는 print1() 과 print2(int a)가 있음.
		   그리고 자신의 내부 메서드 시그니처와 일치하는 print1() 메서드 또한 사용 가능함. 그러나 print2() 메서드와 print2(int a)는
		   메서드 시그니처 2종류, 메서드 이름과 매개변수 리스트 중에서 매개 변수 리스트가 일치하지 않음. 따라서 갯수는 총 3개임. 
		   
		 */
		
		/*A 타입 선언 / A 생성자 사용*/ System.out.println("A 타입 선언 / A 생성자 사용");
		System.out.println();
		
		A aa =new A();
		aa.print1();
		aa.print2();
		System.out.println();
		
		/*A 타입 선언 / B 생성자 사용*/ System.out.println("A 타입 선언 / B 생성자 사용");
		System.out.println();
		
		B ab =new B();
		ab.print1();
		ab.print2(); // print2()의 경우는 클래스 B에 없기 때문에 클래스 A의 메서드를 출력함
		System.out.println();
		
	}
	
}
