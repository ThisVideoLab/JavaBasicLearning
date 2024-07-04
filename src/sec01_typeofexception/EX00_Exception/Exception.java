package sec01_typeofexception.EX00_Exception;

public class Exception {

	public static void main(String[]args) {
		
		/* 14.1 예외 
		   
		   개발자가 프로그램을 작성하는 과정에서 실수를 하거나 사용자가 잘못된 값을 입력하면 오류가 발생할
		   수 있음. 다양한 원인으로 발생하는 오류 중 개발자가 해결할 수 있는 오류를 '예외' exception,
		   이러한 예외가 발생했을 때 이를 적절히 처리하는 것을 '예외 처리'라고 칭함.
		   
		   14.1.1 예외와 에러의 차이점
		   
		   자바에서 제공하는 예외 처리 메커니즘을 이해하기 전에 예외 exception와 에러 error의 의미를
		   정리할 필요하 있음. 먼제 예외는 '연산 오류, 숫자 포맷 오류 등과 같이 상황에 따라 개발자가
		   해결할 수 있는 오류'를 말함. 여기서 '해결할 수 있는'의 의미는 오류 자체를 수정하는 것이 아니라
		   오류가 발생했을 때 그것 대신 차선책을 선택하는 것임. 반면 에러는 자바 가상 머신 자체에서 발생하는
		   오류로, '개발자가 해결할 수 없는 오류'를 의미함. 요컨데 처리 가능한 오류는 오류가 아니라는 것.
		   
		   int a = 1/0을 연살 할 때를 예로 들어보자. 분모는 절대 0이 될 수 없기 때문에 연산 자체가
		   불가능해서 예외가 발생하고, a에는 어떤 값도 대입하지 못할 것임. 예외 처리는 이 상황에서 1/0을
		   계산할 수 있게 하는 것이 아니라, a = -1, a = 1000 등과 같은 명령으로 a에 특정 값을 직접
		   대입하는 것을 예외처리라고 함. 이렇게 개발자가 예외 처리하면 프로그램은 종료되지 않고 계속 실행할
		   수 있게 됨. 에러는 차선책을 선택하는 것 자체도 불가능할 때를 말하며, 대표적인 예로는 메모리가
		   꽉 찼을 때, 쓰레가 죽었을 때 등을 예로 들 수 있음. 
		   
		   우리가 윈도우 컴퓨터를 사용하는 도중 가끔 보게되는 블루스크린이 이런 에러에 해당함. 즉, 예외는
		   '개발자가 처리할 수 있는 오류', 에러는 '개발자가 처리할 수 없는 오류'를 의미함. 자바에서
		   예외의 최상위 클래스는 Exception 클래스, 에러의 최상위 클래스는 Error 클래스임. 이 2개의
		   클래스는 모두 Throwalbe 클래스를 상속하고 있음. 따라서 에러와 예외 모두 Throwable 클래스의
		   모든 기능을 포함한. 어차피 에러가 발생하면 할 수 있는 것이 없으므로 예외에 대해 좀 더 알아볼
		   필요가 있음.
		   
		   14.1.2 예외 클래스의 상속 구조
		   
		   Throwable 클래스를 상속받은 Exception 클래스는 다시 일반 예외 checked excepiton 클래스와
		   실행 예외 unchecked(runtime) exception 클래스로 나뉨.
		   
		   Exception - ClassNotFoundExcepton
		             - InterruptedExcepton
		             - IOExcepton
		             - FileNotFoundExcepton
		             - CloneNotSupportedExcepton
		             
		             - RuntimeExcepton           - ArithmeticExcepton
		                                         - ClassCastExcepton
		                                         - IndexOutOfBoundExcepton
		                                         - NumberFormatExcepton
		                                         -          ...
		                                         - NullPointerExcepton
		              
		   Exception 클래스에게 직접 상속받은 예외 클래스들이 처리하는 일반 예외는 컴파일 전에 예외 문법을
		   검사 check하며, 예외 처리를 하지 않으면 문법 오류가 발생함. 반면 RuntimeException 클래스를
		   상속받는 예외 클래스들이 처리하는 실행 예외는 컴파일 전이 아니라 실행할 때 발생하는 예외로, 예외
		   처리를 따로 하지 않더라도 문법 오류가 발생하지 않음. 다만 프로그램 실행 시 프로그램이 강제 종료되는
		   이유는 대부분 실행 예외 때문이므로 이에 대한 세심한 주의가 필요함.
		   
		 */
		
	}
	
}
