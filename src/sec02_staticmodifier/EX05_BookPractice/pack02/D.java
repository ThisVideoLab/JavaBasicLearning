package sec02_staticmodifier.EX05_BookPractice.pack02;

import sec02_staticmodifier.EX05_BookPractice.pack01.A;

public class D extends A {
	void def() {
		System.out.println(this.a);
		System.out.println(this.b); // 상속받았기 때문에 가능함
		// System.out.println(this.c); 다른 패키지이므로 불가능 
		// System.out.println(this.d); 다른 클래스이므로 불가능
	}
}
