package sec01_accessmodifier.EX01_AccessModifierOfMember;

import sec01_accessmodifier.EX01_AccessModifierOfMember.pack1.A; // 서로 다른 패키지에 있는 클래스 임포트
import sec01_accessmodifier.EX01_AccessModifierOfMember.pack1.B; // 서로 다른 패키지에 있는 클래스 임포트
import sec01_accessmodifier.EX01_AccessModifierOfMember.pack2.C;
import sec01_accessmodifier.EX01_AccessModifierOfMember.pack2.D;

public class AccessModifierOfMember {

	public static void main(String[]args){

		/*클래스의 객체 생성 및 print() 메서드 호출*/ System.out.println("클래스의 객체 생성 및 print() 메서드 호출");
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		
		a.print();
		b.print();
		c.print();
		d.print();
		
	}
}
