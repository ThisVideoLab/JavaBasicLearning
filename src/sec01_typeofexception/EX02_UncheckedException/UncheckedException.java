package sec01_typeofexception.EX02_UncheckedException;

class A{}

class B extends A{}

public class UncheckedException {

	public static void main(String[]args) {
		
		/* 14.1.4 실행 예외
		   
		   일반 예외는 예외 처리를 해 주지 않으면 문법 오류가 발생하기 때문에 실행 자체가 불가능한 반면,
		   실행 예외는 문법 오류가 발생하지 않음. 그렇기 때문에 예외 처리 없이 컴파일과 실행이 가능하지만,
		   실행 중 실행 예외가 발생하면 프로그램은 강제 종료됨. 실행 예외를 처리하는 클래스는 Exception의
		   자식 클래스인 Runtime Exception 클래스의 자식 클래스들임. 그럼 대표적인 실행 예외 클래스를
		   하나씩 알아보자.
		   
		   ArithmeticException
		   
		   Arithmetic 단어의 사전적인 뜻은 '산술' 또는 '연산'임. 즉 ArithmeticException은 연산
		   자체가 불가능할 때 발생하는 실행 예외임. 수학식에서 절대 존재할 수 없는 대표적인 연산은 분모가 0인
		   경우임. 이 연산을 수행하도록 하면 예외가 발생함. 이때 예외 처리를 하지 않으면 예외가 발생했을 때
		   실행 중인 프로그램은 예외 발생 상황을 출력하고 강제 종료됨.
		   
		   public class A{
		       public static void main(String[]args){
		           System.out.println(3/0); // 연산 불가(분모가 0), ArithmeticException
		       }
		   
		   }
		   		   
		   ClassCastException
		   
		   상속 관계에 있는 클래스 간의 업캐스팅은 항상 가능하지만, 다운 캐스팅은 경우에 따라 달라질 수 있음.
		   ClassCastException은 이러한 다운 캐스팅이 불가능한 상황에서 다운 캐스팅을 시도할 때 발생함.
		   
		   class {}
		   class B extends A{}
		   
		   public class Test{
		       public static void main(String[]args){
		       A a = new A();
		       B b = (B) a; // class 캐스팅이 불가능하면 ClassCastException이 발생함. 
		       }
		   }
		   
		   ArrayIndexOutOfBoundException
		   
		   이름도 긴 ArrayIndexOutOfBoundException은 이름처럼 배열의 인덱스를 잘못 사용했을 때
		   발생함. 배열의 인덱스는 항승 0 ~ (배열의 길이 - 1)까지의 값만 사용할 수 있음. 만약 이 범위
		   밖에 있는 인덱스를 사용하면 이 예외가 발생함.
		   
		   public class A {
		       public static void main(String[]args){
		       
		       int[] a = {1, 2, 3};
		       System.out.println(a[3]); // 배열의 길이가 3이므로, 4번째 배열이 존재하지 않음
		                                 // ArrayIndexOutOfBoundException 발생 
		       }
		   }
		   
		   NumberFormatException
		   
		   문자열을 정숫값으로 변환하고자 할 때는 Integer.parseInt("문자열), 실숫값으로 변환하고자
		   할 때는 Double.parseDouble("문자열")을 사용해야 함. 이렇게 문자열을 숫자 또눈 실수로
		   변활할 때 문자열이 변환하고자 하는 숫자 형식이 아니면 변환이 실패하는데, 이때 발생하는 실행
		   예외가 NumberFormatException임.
		   
		   public class A{
		       public static void main(String[]args){
		       int num = Integer.parseInt("10!"); // Number가 아닌 것을 숫자로 바꿀 때
		       }                                  // NumberFormatException 발생
		   }
		   
		   문자열을 불리언으로 변환하기
		   
		   문자열을 불리언값(true, false)으로 변환하는 과정은 문자열을 정수나 실수로 변환할때와 다르게
		   동작함. 숫자가 아니기 때문에 변환하는 과정에서는 NumberFormatException이 발생하지 않음.
		   다음 예를 살펴보자.
		   
		   Boolean.parseBoolean("true"); // true
		   Boolean.parseBoolean("false"); // false
		   Boolean.parseBoolean("true123"); // false
		   Boolean.parseBoolean(""); // false
		   
		   이 예에서 알 수 있는 것ㅊ러럼 문자열을 불리언값으로 변경할 때는 문자열이 "true"인지만 확인하면 됨.
		   불리언값으로 변환하고자 하는 문자열이 "true"일 때만 true 값으로 변환되고, 이외의 모든 문자열,
		   심지어 비어 있는 문자열도 false 값으로 변환함.
		   
		   NullPointerException
		   
		   참조 변수가 실제 객체를 가리키고 있지 않은 상황에서 필드나 메서드를 호출할 때 발생함. 여기서 null은
		   위칫값을 저장하는 참조 변수의 초깃값으로만 사용할 수 있으며, 현재 가리키고 pointing 있는 객체가
		   없다는 것을 의미함. 객체를 가리키고 있지도 않은데 해당 위치에 가서 객체 안에 있는 멤버를 실행하라고
		   명령하니 수행할 수 없는 것임.
		   
		   public class A{
		       public static void main(String[]args){
		       String a = null;
		       System.out.println(str.charAt(2)); // 객체를 생성하지 않고 멤버를 사용할 때
		       }                                // NullPointerException 발생
		   }
		   
		 */
		
		// UncheckedException = RuntimeException (실행 예외)
		
		// 1. Arithmetic Exception
		
		System.out.println(3/0);
		
		// 2. ClassCastException
		
		A a2 = new A();
	    B b = (B) a2;
		
		// 3. ArrayIndexOutOfBoundException
	    
	    int[] a3 = {1, 2, 3};
	    System.out.println(a3[3]);
	    
	    // 4. NumberFormatException
	    
	    int num = Integer.parseInt("10!");
	    
	    // 5. NullPointerException
	    
	    String str = null;
	    System.out.println(str.charAt(2));
	    
	    // 추가. 
	    
	    Boolean.parseBoolean("true"); // true
		Boolean.parseBoolean("false"); // false
		Boolean.parseBoolean("true123"); // false
		Boolean.parseBoolean(""); // false
		
		/* 실행 예외는 예외 처리를 하지 않아도 문법 오류가 발생하지 않지만, 실행 중인 프로그램이 강제 종료
		   되는 주요 원인이 됨. 실행 중인 프로그램이 예외로 강제 종료된다는 것은 매우 치명적이므로 이를
		   방지하기 위해서 실행 예외들도 적절한 예외 처리가 필요함.
		 
		 */
	}
	
}
