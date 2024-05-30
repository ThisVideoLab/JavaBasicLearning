package sec02_staticmodifier.EX02_StaticField_2;

class A {
	int m = 3; // 인스턴스 필드
	static int n = 5; // 정적 필드
}

public class StaticField_2 {
	
	public static void main(String[]args) {
		
		A a1 = new A();
		A a2 = new A();
		
		/*인스턴스 필드*/ System.out.println("인스턴스 필드");
		
		a1.m = 5; 
		a2.m = 6;
		System.out.println(a1.m);
		System.out.println(a2.m);
		System.out.println();
		
		/*정적 필드*/ System.out.println("정적 필드");
		a1.n = 7;  
		a1.n = 8;
		System.out.println(a1.n);
		System.out.println(a2.n);
		System.out.println();
		
		A.n = 9;
		System.out.println(a1.n);
		System.out.println(a2.n);
		
	}

}
