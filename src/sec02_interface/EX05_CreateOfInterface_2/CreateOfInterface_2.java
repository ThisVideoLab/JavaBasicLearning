package sec02_interface.EX05_CreateOfInterface_2;

interface A{
	int a = 3;
	void abc();
}

public class CreateOfInterface_2 {

	public static void main(String[]args) {
		
		// 객체 생성
		
		A a1 = new A() {
			public void abc() {
				System.out.println("방법 2. 익명 이너 클래스를 이용한 객체 생성 from a1");
			}
		};
		A a2 = new A() {
			public void abc() {
				System.out.println("방법 2. 익명 이너 클래스를 이용한 객체 생성 from a2");
			}
		};
		
		// 메서드 호출
		
		a1.abc();
		a2.abc();
		
	}
	
}
