package sec03_localinnerclass.EX02_GeneratedClassNames;

class A{
	void abc() {
		class B{} // A$1B.class
		class C{} // A$1C.class
	}
	
	void bcd() {
		class C{} // A$2C.class 
		class D{} // A$2D.class
	}
}

public class GeneratedClassNames {

	public static void main(String[]args) {
		
		/* 지역 이너 클래스명이 중복될 때 클래스가 어떻개 생성되는지를 확인하기 위해 다음 예를 살펴보자.
		   아우터 클래스 A에는 2개의 메서드, 각각의 메서드 내부에는 2개의 지역 이너 클래스가 있음.
		   그중 지역 이너 클래스 C는 2개의 메서드 내에 동일한 이름으로 존재함. 이때 컴파일 이후 생성된
		   클래스 파일명은 A.class A$1B.class, A$1C.class, A$2C.class, A$1D.class가 됨.
		   
		   이 중 하나인 A$1D.class의 이름을 풀어서 설명해보면 클래스 내부에 있는 첫번째 메서드 속에
		   D라는 이름의 지역 이너 클래스임을 가리킴.
		   
		 */
		
	}
	
}
