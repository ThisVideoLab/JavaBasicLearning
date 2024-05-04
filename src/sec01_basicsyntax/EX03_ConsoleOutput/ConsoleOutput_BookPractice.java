package sec01_basicsyntax.EX03_ConsoleOutput;

public class ConsoleOutput_BookPractice {

	public static void main(String[] args) {
		// 본 클래스는 교재 p52 연습 문제에 대한 풀이임

		/*
		   Q1 자바 프로그램 개발 환경에 필요한 요소 중 자반 가상 머신(JVM), 가바개발도구(JDK), 자바 개발환경(JRE)의 포함 관계를
		   쓰시오. A. 자바 개발 도구JDK > 자바 개발 환경 JRE > 자바 가상 머신JVM
		  
		   Q2 이클립스에서 자주 사용되는 단축키를 쓰시오.
		   자동 임포트: CTRL + SHIFT + O 
		   1줄 주석 설정 및 해제:  CTRL + /
		   자동 정렬: CTRL + SHIFT + F
		   폰트 확대: CTRL + (+)
		   
		   Q3 자바의 가장 큰 특징인 플랫폼 독립성을 바르게 기술한 것을 고르시오. 
		   	1. 자바 가상 머신을 사용해 하나의 소스 코드를 컴파일 한 결과로, 어떤 플랫폼에서든 실행할 수 있다.
		   	2. 윈도우용은 윈도우용 자바 프로그램, 리눅스용은 리눅스용 자바 프로그램을 다로 만들어야 한다.
		   	A) 1번
		   	
		   Q4 다음과 같이 Exam 프로젝트의 소스 파일이 src/abc/bcd/cde/Test.java에 위치할 때 패키지명을 정확히 쓰시오.
		    A) abc.bcd.cde
		    
		   Q5 소스 코드가 다음과 같을 때 소스 코드의 파일명과 컴파일 이후에 생성되는 바이트 코드 파일명을 모두 쓰시오
		      (반드시 확장명을 함께 표기할 것)
		    class A{
		    	class B{
		    	}
		    }
		    public class C {
		    	class D {
		    		class E {
		    		}
		    	{
		    }

		    A) 바이트 코드 파일명: C.class  // C.java 로 저장됨. 바이트코드파일은 항상 java 파일로 저장.
		       소스 코드 파일명: A.class / A$B.class / C$D.class / C$D$E.class
		   
		   Q6 다음 코드를 콘솔에서 실행했을 때 실행 결과를 쓰시오.
		   
		   System.out.println("안녕"+5.8); // 문자열 + 문자열의 결합
		   System.out.print(3+5+"방가"+4+2); // 앞에선 연산 후 문자열과 결합해, 뒤 숫자도 문자열로 결합
		   System.out.println("%s:%d", "홍길동", 15); // 문자열 인자 + 10진법 
		       
		   A) 안녕5.8
		   	  8방가42홍길동15
		 */
		

	}

}

