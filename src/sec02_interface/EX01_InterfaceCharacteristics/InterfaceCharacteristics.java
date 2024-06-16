package sec02_interface.EX01_InterfaceCharacteristics;

interface A {
	   int a = 3; // 컴파일러가 자동으로 int a 앞에 public static final을 입력함.
	   public abstract void abc();  // 컴파일러가 자동으로 abc() 앞에 public static final을 입력함.
}

interface B {
	   int b = 4; // 컴파일러가 자동으로 int a 앞에 public static final을 입력함.
	   public abstract void bcd();  // 컴파일러가 자동으로 abc() 앞에 public static final을 입력함.
}

public class InterfaceCharacteristics {

	public static void main(String[]args) {

		/* 12.2 인터페이스
		   
		   이번에는 마지막 객체지향 프로그래밍 요소인 인터페이스에 대해 학습해보자. 우리가 일상에서 쓰는 인터페이스의 의미는 입출력 방식의
		   호환성을 의미함. 가령 가전제품과 콘센트를 보자. 여러 가전 제품들은 220v 컨센트의 규격을 맞추면 그 모양이나 용도가 어떻든 간에
		   전기를 끌어다 사용이 가능함. 그러나 110v 규격의 전자 제품들은 220v 콘센트에 사용이 불가능함. 이렇듯 특정 인터페이스를 구축하고
		   그 인터페이스에 맞춰서 다양한 객체를 생성하면, 이미 구축된 환경을 편리하게 사용이 가능함. 이러한 개념을 프로그래밍에 녹인 것이 바로
		   인터페이스 프로그래밍 요소임.
		   
		   12.2.1 인터페이스의 정의와 특징
		   
		   인터페이스는 내부의 모든 필드가 public static final로 정의되고, static과 default 메서드 이외의 모든 메서드는
		   public abstract로 정의된 객체지향 프로그래밍 요소임. class 키워드 대신 interface 키워드를 사용해 선언함.
		   
		   인터페이스의 구조
		   
		   interface 인터페이스명 {
		      public static final 자료형 필드명 = 값;
		      public abstract 리턴 타입 메서드명();
		   }
		   
		   interface A {
		      public static final int a = 3;
		      public abstract void abc();
		   }
		   
		   이처럼 인터페이스 내에서 필드와 메서드에 사용할 수 있는 제어자 modifier가 확정돼 있으므로 필드와 메서드 앞에 제어자를 생략해도
		   다음과 같이 컴파일러가 자동으로 각각의 제어자를 삽입함.
		   
		   interface A {
		   int a = 3; // 컴파일러가 자동으로 int a 앞에 public static final을 입력함.
		   public abstract void abc();  // 컴파일러가 자동으로 abc() 앞에 public static final을 입력함.
		}
		   
		   이렇게 제어자를 명시적으로 적어 주지 않은 인터페이스 내의 필드와 메서드 앞에 각각 public static final과 public abstract가
		   자동으로 추가됐다는 것은 몇가지 방법으로 확인 가능함. 먼저 메서드명 뒤에 중괄호가 없는데도 오류가 발생하지 않음. 고로 컴파일러가 자동으로
		   abstract를 붙였다는 것을 알 수 있음.
		   
		 */
		
		// satatic 자동 추가 확인
		
		System.out.println(A.a);
		System.out.println(B.b);
		// A.a = 2; // 오류 발생// final이 붙었으므로 값의 변경이 불가능.
	    // B.b = 4; // 오류 발생// 심지어 같은 값이라도 추후 대입이 불가능.
		
	}
	
}
