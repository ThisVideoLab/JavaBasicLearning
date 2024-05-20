package sec02_method.EX02_InternalCallMethods;

public class InternalCallMethods {

	public static void main(String[]args) {
		
		/* 클래스 내부에서 메서드 호출하기
		   
		   이제 클래스 내부에서 메서드 간에 상호 호출할 때를 살펴보자. 클래스 내부에 있는 메서드끼리는 객체를 생성하지 않고 서로 호출이 가능함.
		   말 그대로 같은 멤버이기 때문임. 필드 또한 멤버이므로 클래스 내부의 모든 메서드 안에서 객체를 생성하지 않고 자신이 속한 클래스의
		   필드를 사용 가능함. 다만 메서드 앞에 static이 붙어있을 때는 static이 붙은 필드 또는 메서드만 호출이 가능함. 이는 후출하기로 하고
		   일단은 같은 멤버끼리는 클래스 내부에서 객체 생성 없이 서로를 호출할 수 있다는 것을 중점적으로 익힐 것.
		   
		 */
		
		/*- 실습 - 클래스 내부에서의 메서드 호출*/ System.out.println("- 실습 - 클래스 내부에서의 메서드 호출");
		System.out.println();
		
		/*같은 클래스 안에 있는 내부 메서드 호출*/ System.out.println("같은 클래스 안에 있는 내부 메서드 호출");
		System.out.println();
		
		print();
		System.out.println();
		
		int a = twice(3);
		System.out.println(a);
		System.out.println();
		
		double b = sum(a, 5.8);
		System.out.println(b);
		
	}
	
	public static void print() {
		System.out.println("print() 메서드 실행");
		System.out.println("안녕");
	}
	public static int twice(int k) {
		System.out.println("twice() 메서드 실행");
		return k * 2;
	}
	public static double sum(int m, double n) {
		System.out.println("sum() 메서드 실행");
		return m +n;
	}
	
}

