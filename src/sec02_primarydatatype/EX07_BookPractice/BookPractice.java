package sec02_primarydatatype.EX07_BookPractice;

public class BookPractice {

	public static void main(String[]args) {
	
		System.out.println();
		System.out.println("Q1. 다음 변수나 상수 선언 명령으로 이 가능한지, 불가능한지 구분하고 적절하지 않은"+
							  " 이유를 쓰시오.");
		System.out.println();
		
		// 변수 선언
		
		System.out.print("변수 선언 boolean flag; - ");
		System.out.println("가능");
		
		System.out.print("변수 선언 byte public; - ");
		System.out.println("가능"); // 자바에서 사용중인 예약어이기 때문에 사용 불가능
		
		System.out.print("변수 선언 short data$; - ");
		System.out.println("가능");
		
		System.out.print("변수 선언 char 이름; - ");
		System.out.println("가능");
		
		System.out.print("변수 선언 int name3; - ");
		System.out.println("가능");
		
		System.out.print("변수 선언 long 3name; - ");
		System.out.println("불가능 - 변수 이름의 맨 앞에 숫자가 올 수 없음");
		
		System.out.print("상수 선언 final double USER_DATA; - ");
		System.out.println("가능");
		
		System.out.print("상수 선언 final int $MY_DATA; - ");
		System.out.println("가능 - 특수 문자 중 예외적으로 $와 _는 사용 가능");
		
		System.out.print("상수 선언 final float HELLO^^; - ");
		System.out.println("불가능 - 예외적 특수 문자 2가지를 제외한 모든 특수 문자 사용 불가능");
		System.out.println();
		
		System.out.println("Q2. 다음 코드에서 변수 a, b, c가 메모리에 생성되는 행 번호와 사라지는 행 번호를 쓰시오.");System.out.println();
		
		{
			int a =3;
			{	int b;
				b= 5; // 변수 선언과 대입의 차이점을 이해하는지가 키 포인트
			}
			int c = 7;
		}
		
		System.out.println("변수 a: 생성 - 41행 / 소멸 - 46행 "); 
		System.out.println("변수 b: 생성 - 42행 / 소멸 - 43행 ");  
		System.out.println("변수 c: 생성 - 45행 / 소멸 - 46행 ");
		System.out.println();
		
		System.out.println("Q3. 소문자 'a'를 나타내는 유니코드값은 97(10진수), 1100001(2진수),  141(8진수),");
		System.out.println("또는 61(16진수)이다.char 변수 value에 'a'문자로 저장되는 값을 5가지 이상 나열하시오.");
		System.out.println();
		
		char value1 = '\u0061';
		char value2 = 97;
		char value3 = 0b1100001; // 유니코드 값 앞에 0b를 붙여 2진수임을 나타냄
		char value4 = 0141; // 유니코드 값 앞에 0을 붙여 2진수임을 나타냄
		char value5 = 0x61;  // 유니코드 값 앞에 0x를 붙여 2진수임을 나타냄
		
		System.out.println("유니코드 a: "+value1);
		System.out.println("10진수 97: "+value2);
		System.out.println("2진수 1100001: "+value3);
		System.out.println("8진수 141: "+value4);
		System.out.println("16진수 61: "+value4);
		System.out.println();
		
		System.out.println("Q4. 다음 코드에서 문법 오류가 발생하는 부분을 세군데 찾아 수정하시오.");
		System.out.println();
		
		System.out.println("01 byte a = 3;");
		System.out.println("02 byte b = 5;");
		System.out.println("03 byte c = 130;");
		System.out.println("04 byte d = a + b;");
		System.out.println("05 long e = 100;");
		System.out.println("06 float f = 3.5;");
		System.out.println();
		
		System.out.println("오류가 발생한 행 번호: 03 / 수정한 코드: short c = 130 or int c = 130");
		System.out.println("오류 사유 - byte 자료형이 허용 범위인 127을 넘어선 130이므로 오류 발생");
		System.out.println();
		System.out.println("오류가 발생한 행 번호: 04 / 수정한 코드: int d = a + b");
		System.out.println("오류 사유 - byte 자료형은 연산 단위에서 int 자료형으로 처리되므로 이미 a 와 b는");
		System.out.println("         연산 과정에서 int 자료형이기 때문에 byte 자료형으로 연산 불가능");
		System.out.println();
		System.out.println("오류가 발생한 행 번호: 06 / 수정한 코드: double f = 3.5 or float f = 3.5f");
		System.out.println("오류 사유 - 실수는 연산 과정에서 double 자로형으로 처리되므로 더 작은 범위의 float로");
		System.out.println("         처리가 불가능하므로 변수의 자료형을 바꿔주거나 대입값이 float임을 별도로 표시해야 함.");
		System.out.println();
		
		System.out.println("Q5. 다음 코드의 출력값을 쓰시오.");
		System.out.println();
		
		System.out.println("System.out.println((int)5.6+3.5); -> 8.5");
		System.out.println("System.out.println((int)5.6+(int)3.5); -> 8");
		System.out.println("System.out.println((int)(5.6+3.5)); -> 9");
		System.out.println("System.out.println(7/4); -> 1.75 ");
		//오답 1.75 -> 1, 괄호 안에서 먼저 int로 계산이 이뤄지므로, int 1.75 =1이 됨
		System.out.println("System.out.println((double)3/2); -> 1.5");
		System.out.println("System.out.println((double)(3/2)); -> 1.5");
		//오답 1.5 -> 1, 괄호 안에서 먼저 int로 계산이 이뤄지므로, int 1.5 =1이 됨
		
	}
	
}
