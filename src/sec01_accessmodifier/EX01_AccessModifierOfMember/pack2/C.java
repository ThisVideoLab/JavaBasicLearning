package sec01_accessmodifier.EX01_AccessModifierOfMember.pack2; // A.java 와 다른 pack2 패키지 사용

import sec01_accessmodifier.EX01_AccessModifierOfMember.pack1.A; // pack1의 클래스 A 임포트

public class C {

	public void print() {
		// 객체 생성
		A a = new A();
		
		// 멤버 활용
		System.out.print(a.a + " "); // 다른 패키지 내의 클래스에서는 자식 클래스가 아닌 경우 public 접근 지정자만 사용 가능함.
		// System.out.println(a.b + " ");
		// protected 접근 지정자를 가진 멤버, 필드 b를 외부 패키지에서 사용하려면 상속을 받은 자식 클래스만 사용 가능하므로 사용 불가능
		
		// System.out.println(a.c + " "); // 
		// System.out.println(a.d + " "); private 접근 지정자로 지정된 필드는 접근 불가능함.
		System.out.println();
		
	}
	
}
