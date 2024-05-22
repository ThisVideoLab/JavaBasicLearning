package sec03_constructor.EX02_ConstructorOverloading;

class A{
	A(){
		System.out.println("첫 번째 생성자");
	}
	A(int a){
		System.out.println("두 번째 생성자");
	}
	A(int a, int b){
		System.out.println("세 번째 생성자");
	}
}

public class ConstructorOverloading {

	public static void main(String[]args) {
		
		/* 7.3.3 생성자와 객체의 생성 방법
		   
		   앞서 생성자를 통한 값의 조정을 예제 외의 코드로 작성해 본 것처럼, 생성자의 모양에 따라 객체를 생성하는 방법이 결정됨. 어떤 클래스 안에
		   기본 생성자만 있다면 기본 생성자 모양으로만 객체를 생성할 수 있고, int형을 입력매개변수로 포함하고 있는 생성자만 있다면 int형 값을
		   입력으로 받아 생성자를 호출해야만 객체를 만들 수 있음. 생성자도 메서드처럼 오버로딩이 가능함. 즉, 메서드처럼 생성자의 입력매개변수
		   자료형이나 개수에 따라 여러 개의 생성자를 정의할 수 있음. 가령 다음 예제와 같이 클래스 A에 서로 다른 내용의 생성자 3개가 오버로딩되어
		   있다면 클래스 A로 객체를 만드는 3가지 방법이 존재하게 되는 것.
		   
		 */
		
		A a1 = new A();
		A a2 = new A(1);
		A a3 = new A(2, 3);
		
	}
	
}
