package sec02_typecasting.EX03_Typecasting_3;

class A{}
class B extends A{}

public class Typecasting_3 {

	public static void main(String[]args) {
		
		/* 10.2.4. 캐스팅 가능 여부를 확인하는 instanceof 키워드
		   
		   캐스팅 할 수 있는지를 확인하려면 실제 객체를 어떤 생성자로 만들었는지와 클래스 사이의 상속 관계를 알아야 함. 하지만 다른 사람이 만든
		   클래스를 사용할 때는 이런 정보를 하나 하나 확인하는 것이 여간 번거로운 일이 아님. 심지어 자신이 만든 코드라고 하더라도 프로젝트의
		   규모가 커지거나 길이가 길어지면 일일이 생성 객체의 타입을 확인하기가 쉽지 않음. 이를 위해 자바는 캐스팅 가능 여부를 불리언 타입으로
		   확인할 수 있는 문법 요소를 제공하고 있는데, 이것이 바로 instanceof 임.
		   
		   캐스팅 가능 여부 확인
		   
		   참조 변수 instanceof 타입 // -> true: 캐스팅 가능 / false: 캐스팅 불가능
		   
		   코드의 형태는 '참조 변수 instanceof 타입'과 같이 작성하며, 참조 변수가 해당 타입으로 캐스팅할 수 있을 때 true, 그렇지 않을 때
		   false를 리턴함. 여기서 instanceof 뒤의 타입은 참조 변수가 표현 될 수 있는 모든 다형적 타입을 의미함. 예를 들어서
		   A <- B <- C의 상속 구조에서 C c = new C()와 같이 생성했을 때 생성된 객체는 C 타입으로 선언돼 있지만, 다형적 표현 방법에 따라
		   A 및 B 타입으로도 선언이 가능함. 따라서 c instanceof A, c instanceof B의 값은 모두 true임.
		   
		   C c = new C();
		   System.out.println(c instanceof A); // true
		   System.out.println(c instanceof B); // true
		   System.out.println(c instanceof C); // true
		   
		   이렇게 instanceof 키워드를 사용하면 상속 관계나 객체를 만든 생성자를 직접 확인하지 않고도 캐스팅 가능 여부를 확인할 수 있음.
		   따라서 잘못된 캐스팅에 따른 실행 예외(ClassCastingException)로 프로그램이 종료되는 것을 방지하기 위해 일반적으로 다운캐스팅을
		   수행할 때 instanceof를 이용해 캐스팅 가능 여부를 확인하고, 가능한 때만 캐스팅을 수행함.
		   
		   A <- B의 상속 구조에서 instanceof 결괏값에 따른 캐스팅 구문 실행 예
		   
		   A ab = new B();
		   if (ab instanceof B) { // 만약 클래스 B의 생성자로 만들어진 A 타입의 ab를 B 타입으로 다운캐스팅이 가능하다면 - true
		      B b = (B)ab; // 캐스팅 구문 실행
		   }
		   
		   A aa = new A();
		   if (ab instanceof B) { // 만약 클래스 A의 생성자로 만들어진 A 타입의 aa를 B 타입으로 다운캐스팅이 가능하다면 - false
		      B b = (B)aa;
		   
		 */
		
		// instanceof
		
		A aa = new A();
		A ab = new A();
		
		System.out.println(aa instanceof A);
		System.out.println(ab instanceof A);
		
		System.out.println(aa instanceof B);
		System.out.println(ab instanceof B);
		
		
		
	}
	
}
