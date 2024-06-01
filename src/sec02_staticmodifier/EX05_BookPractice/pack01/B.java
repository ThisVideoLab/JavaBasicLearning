package sec02_staticmodifier.EX05_BookPractice.pack01;

public class B {
	void bcd() {
		A a = new A();
		System.out.println(a.a);
		System.out.println(a.b);
		System.out.println(a.c); 
		// System.out.println(a.d); // private는 해당 클래스 내에서만 사용 가능
	}
}
