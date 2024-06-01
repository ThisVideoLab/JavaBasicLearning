package sec02_staticmodifier.EX05_BookPractice.pack02;

import sec02_staticmodifier.EX05_BookPractice.pack01.A;

public class C {
	void cde() {
		A a = new A();
		System.out.println(a.a);
		// System.out.println(a.b); // 같은 패키지 또는 자식 클래스 내에서만 사용 가능
		// System.out.println(a.c); // 같은 패키지 내에서만 사용 가능
		// ystem.out.println(a.d); // 같은 클래스 내에서만 사용 가능 
	}

}
