package sec02_abstractmodifier.EX04_BookPractice;

class A1 {
	int a = 3;
	final int b = 5;
	A1(){
		a = 7;
		// b = 9;
	}
}

class A2{
	void abc() {System.out.println("클래스 A2의 abc() 메서드");}
	final void bcd() {System.out.println("클래스 A2의 bcd() 메서드");}
}
class B2 extends A2{
	void abc() {System.out.println("클래스 B2의 abc() 메서드");}
	// final void bcd() {System.out.println("클래스 B2의 bcd() 메서드");}
}

class A3{}
class B3 extends A3{}
final class C3 extends B3{}
// final class D3 extends C3{}

class A4{
	void abc() {};
}

public class BookPractice {

	public static void main(String[]args) {
		
		/*Q1 다음의 클래스 A1는 오류를 포함하고 있다. 오류가 발생한 위치와 그 이유를 설명하시오.*/
		System.out.println("Q1 다음의 클래스 A1는 오류를 포함하고 있다. 오류가 발생한 위치와 그 이유를 설명하시오.");
		System.out.println();
		
		System.out.println("b = 9;에서 오류 발생. fnial 접근 지정자를 사용하는 필드나 지역 변수는 최초 대입한 이후에는 어떠한 경우도 수정 불가능.");
		System.out.println("심지어 이미 대입된 같은 값으로 다시 입력하는 것 또한 불가능함.");
		System.out.println();
		
		/*Q2 다음은 2개의 메서드를 포함하고 있는 클래스 A2를 상속받아 클래스 B2를 정의하는 코드로, 오류를 포함하고 있다.*/
		/*오류가 발생한 위치와 그 이유를 설명하시오.*/
		System.out.println("Q2 다음은 2개의 메서드를 포함하고 있는 클래스 A2를 상속받아 클래스 B2를 정의하는 코드로, 오류를 포함하고 있다.");
		System.out.println("오류가 발생한 위치와 그 이유를 설명하시오.");
		System.out.println();
		
		System.out.println("final void bcd() {System.out.println(\"클래스 B2의 bcd() 메서드\");} 위치에서 오류 발생");
		System.out.println("final로 선언된 메서드는 오버라이딩 불가능.");
		System.out.println();
		
		/*Q3 다음은 A3, B3, C3, D3 클래스 간의 상속 구조를 자바 코드로 표현한 것으로, 오류를 포함하고 있다. 오류 위치와 이유를 설명하시오.*/
		System.out.println("Q3 다음D은 A3, B3, C3, D3 클래스 간의 상속 구조를 자바 코드로 표현한 것으로, 오류를 포함하고 있다. 오류 위치와 이유를 설명하시오.");
		System.out.println();
		
		System.out.println("final class D3 extends C3{} 위치에서 오류 발생. final로 선언된 클래스는 상속 불가능.");
		System.out.println();		
		
		/*Q4 다음은 추상 메서드 하나를 포함하고 있는 추상 클래스 A4를 정의한 것이다. 문법적으로 틀린 부분을 찾아 수정하시오.*/
		System.out.println("Q4 다음은 추상 메서드 하나를 포함하고 있는 추상 클래스 A4를 정의한 것이다. 문법적으로 틀린 부분을 찾아 수정하시오.");
		System.out.println();
		
		System.out.println("클래스 A4는 추상 메서드 하나를 포함하고 있는 추상 클래스라는 설명에도 불구하고 일반 클래스에 일반 메서드로 작성됨.");
		System.out.println("고로 클래스와 메서드 앞에 각각 abstract를 붙여주면 됨.");
		
	}
	
}
