package sec02_exceptionhandlingsyntax.EX01_TryCatchFinally;

public class TryCatchFinally {

	public static void main(String[]args) {
		
		/* 14.2 예외 처리
		   
		   앞에서 예외의 종류를 배웟으므로 이제 예외 처리 방법을 알아보자. 일단 예외처리는 예외가 발생했을 때
		   처리하는 방법을 제공하는 문법 요소로, 예외처리하는 방법을 제공하는 문법 요소로, 예외 처리 구문이
		   포함되면 예외가 발생하더라도 프로글매이 계속 실행됨.
		   
		   14.2.1 예외 처리 문법
		   
		   예외 처리 문법은 다음과 같이 크게 3가지 요소(try, catch, finally)로 구성돼 있음.
		   
		   try{
		       // 일반 예외, 실행 예외 발생 가능
		   }catch (예외 클래스명 참조 변수명) {
		       // 예외가 발생했을 때 처리
		   }finally {
		       // 예외 발생 여부에 상관 없이 무조건 실행함
		   }
		   
		  우선 try{} 블록 안에는 예외가 발생할 수 있는 코드가 포함되어 있음. catch{} 블록에는 예외가
		  발생했을 때 처리할 코드가 포함됨. 하나의 catch{} 블록이 모든 예외를 처리하는 것은 아니며, 소괄호
		  안의 예외 타입에 해당하는 예외에 한해서만 처리할 수 있음. 이 블록은 예외가 발생했을 때만 동작하며
		  예외 없이 정상적으로 동작할 때는 실행되지 않음. 마지막 finally {} 블록은 예외가 발생하든,
		  발생하지 않든 항상 실행되는 블록으로, 일반적으로 리소르 해제 또는 try{}, catch {} 블록의
		  공통 기능 코드가 포함돼 있고, 생략할 수 있음.
		  
		  다른 예를 들어보면, try{} 블록과 catch {} 블록으로만 이뤄져 있고, 각 블록에는 공통된 코드가 
		  포함돼 있음.  
		  
		try {
			System.out.println(3 / 0); // 실행 예외 ArithmeticException
			System.out.println("프로그램 종료");
		}
		catch (ArithmeticException e) {
			System.out.println("숫자는 0으로 나눌 수 없습니다.");
			System.out.println("프로그램 종료");
		}
		
		위의 try{} 블록과 catch{}블록 내의 공통된 코드는 예외 발생 여부와 상관없이 항상 실행되는 코드임.
		따라서 다음과 같이 finally{} 블록을 사용해 작성하면 코드의 중복이 제거 가능함.

		  finally {
			System.out.println("프로그램 종료");
		} // 중복된 코드는 finally {} 블록에서 입력
		   
		 */
		
		// 1. try-catch
		
		try {
			System.out.println(3 / 0); // 실행 예외 ArithmeticException
			System.out.println("프로그램 종료");
		}
		catch (ArithmeticException e) {
			System.out.println("숫자는 0으로 나눌 수 없습니다.");
			System.out.println("프로그램 종료");
		}
		
		// 2. try-catch-finally
		
		try {
			System.out.println(3/0); // 실행 예외 ArithmeticException
		}
		catch (ArithmeticException e) {
			System.out.println("숫자는 0으로 나눌 수 없습니다.");
		}
		finally {
			System.out.println("프로그램 종료");
		}
			
	}
}
