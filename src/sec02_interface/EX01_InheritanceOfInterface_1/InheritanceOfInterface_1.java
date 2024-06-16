package sec02_interface.EX01_InheritanceOfInterface_1;

interface A{}
interface B{}

class C implements A{ // 단일 인터페이스 상속 
}

class D implements A, B{ // 다중 인터페이스 상속
}

class E extends C implements A, B{ // 클래스와 인터페이스를 동시에 상속
}

public class InheritanceOfInterface_1 {

	public static void main(String[]args) {
		
		
	}
	
}
