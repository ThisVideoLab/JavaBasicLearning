package sec04_overlapmember.EX02_OverlapStaticField;

class A{
	static int m = 3;
}
class B extends A{
	static int m = 4;
}

public class OverlapStaticField {

	public static void mian(String[]args) {
		
		/* 10.4.2 정적 필드의 중복
		   
		   이번에는 정적static 필드를 살펴보자. 정적 필드의 저장 공간은 정적 영역의 클래스 내부에 생성되고, 모든 객체가 이를 공유함. 다음의
		   예에서 클래스 A는 정적 필드 m = 3을 포함하고 있고, 이를 상속한 클래스 B에서도 동일한 이름의 정적 필드 m = 4를 정의함. 
		   이때 각 여러 호출 방법을 통해서 각각의 방법이 서로 필드를 구분해서 호출하고 있어서 오버라이딩이 일어나지 않음을 확인할 수 있음.
		   
		   A.m = 3; // 객체 생성 없이 외부 클래스의 필드값을 직접 지정
		   B.m = 3; // 객체 생성 없이 외부 클래스의 필드값을 직접 지정
		   
		   A a = new A();
		   a.m = 3; // A 객체를 생성한 후 필드 값을 지정 
		   
		   B b = new B();
		   b.m = 4; // B 객체를 생성한 후 필드 값을 지정
		   
		   A ab = new B();
		   ab.m = 3;
		   
		 */

		/*-실습- 정적 필드의 중복*/ System.out.println("-실습- 정적 필드의 중복");
		System.out.println();
		
		/*클래스명으로 바로 접근*/ System.out.println("클래스명으로 바로 접근");
		System.out.println();
		
		System.out.println(A.m);
		System.out.println(B.m);
		System.out.println();
		
		// 객체 생성
		
		A aa = new A();
		B bb = new B();
		A ab = new B();
		
		/*객체 생성 후 생성한 객체로 정적 필드 호출*/ System.out.println("객체 생성 후 생성한 객체로 정적 필드 호출");
		System.out.println();
		
		System.out.println(aa.m);
		System.out.println(bb.m);
		System.out.println(ab.m);
		
	}
	
}
