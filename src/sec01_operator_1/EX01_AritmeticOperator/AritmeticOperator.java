package sec01_operator_1.EX01_AritmeticOperator;

public class AritmeticOperator {

	public static void main(String[]args) {
		
		/*
		 
		 3.1 연산자의 종류
		 
		 자바의 연산자는 연산 결과의 특징에 따라 3가지로 나눌 수 있음.
		 첫번째, 연산 결과가 특정 값이 나오는 산술, 증감, 비트. 시프트 연산자.
		 
		 산술 연산자: 사칙 연산 및 나머지 연산. +, -, /, *, %(% 앞의 수를 뒷 수로 나눈 뒤에 나머지 반환)
		 증감 연산자: 값이 1씩 증가 및 감소. ++, --
		 비트 연산자: 비트 AND, OR, NOT, XOR. &, |, ~, ^
		 시프트 연산자: 비트 단위의 이동. >>, <<, >>>
		 		 
		 둘째, 연산 결과가 참true과 거짓false 중 하나의 값으로만 나타나는 비교, 논리 연산자
		 
		 비교 연산자: 값의 크기를 비교. <, >, <=, >=, ==, !-
		 논리 연산자: 논리 AND, OR, NOT, XOR. &&, ||, !, ^
		 
		 샛째, 값을 반환하는 것이 아닌 값을 대입하는 의미를 지녀 실행하는 대입 연산자와 삼항 연산자가 있음.
		 
		 대입 연산자: 산술 연산 결과의 대입('연산자' + '='의 축약 표현)
		           =, +=, -=, *=, /=, &=,|=, >>=, <<=. >>>=
		 삼항 연산자: 참 일때 x, 거짓일 때 y
		 
		 3.2 연산자의 연산 방법
		 
		 3.2.1 산술 연산자와 증감 연산자 
		 
		 증감 연산자 */
		 
		 int a = 3;
		 ++a; // 이 순간 이미 a에 대한 1단위의 증가가 일어남. 전위형과 후위형 차이 없음.
		 System.out.println(a);
		 
		 int b = 3;
		 b++; // 이 순간 이미 b에 대한 1단위의 증가가 일어남. 전위형과 후위형 차이 없음.
		 b  
		 ++; // 심지어 이렇게 써도 차이가 없음
		 System.out.println(b);
		 
		 // 전위형과 후위형의 차이가 발생하는 경우
		 
		 int a1 = 3;
		 int b1 = ++a1; // 연산 과정에서 전위형은 순서에 따라 증감 연산자 ++의 영향을 받아 1이 증가함.
		                // 그 후 a1의 대입값 3을 더해 최종적으로 4가 됨.
		 
		 System.out.println(a1); // 이미 증감 연산의 적용을 받았으므로 4를 출력
		 System.out.println(b1); // 증감 연산된 a1 4의 값을 대입 했으므로 4를 출력
		 System.out.println();
		 
		 int a2 = 3;
		 int b2 = a2++;
		 
		 System.out.println(a2); // a2는 b2의 대입 과정에서 일어난 증감 연산에 따라 1이 증가한 4가 됨.
		 System.out.println(b2); // b2는 증감 연산을 받기 전인 a2에 대한 값 3을 대입함.
		 System.out.println();
		 
		 // 산술 연산자 연습
		 
		 System.out.println(2+3); // 5
		 System.out.println(8-5); // 3
		 System.out.println(7*2); // 14
		 System.out.println(7/2); // 3 기본 자료형이 int 이므로 3.5 대신 3을 출력. 앞에서 한번 틀렸던 것 주의.
		 System.out.println(8%5); // 3 앞 수를 뒷 수로 나눈 뒤에 그 나머지를 반환함.
		 System.out.println(); // 
		 
		 // 증감 연산자 연습 @case1 
		 
		 int value1 = 3;
		 value1++;
		 System.out.println(value1); //4 
		 System.out.println();
		 
		 int value2 = 3;
		 ++value2;
		 System.out.println(value2); //4
		 System.out.println();
		 
		 // 증감 연산자 연습 @case2 
		 
		 int value3 = 3;
		 int value4 = value3++;
		 System.out.println(value3); // 4. value4의 대입에서 이뤄진 증감 연산과 무관함.
		 System.out.println(value4); // 4. value3을 불러온 뒤에 3에 대한 증감 연산이 이뤄짐.
		 System.out.println();
		 
		 int value5 = 3;
		 int value6 = ++value5;
		 System.out.println(value5); // 4. value6의 대입 과정에서 대한 증감 연산이 이뤄짐.
		 System.out.println(value6); // 4. 증감 연산된 value5 값인 4를 불러옴.
		 
		 // 증감 연산자 연습 @case3
		 
		 int value7 = 3;
		 int value8 = 4;
		 int value9 = 2+ value7-- + ++value8; // 2+3+5 = 10. 
		 System.out.println(value7); // 2. 증감 연산자 --의 영향으로 1 감소
		 System.out.println(value8); // 5. 증감 연산자 ++의 영향으로 1 증가
		 System.out.println(value9); // 10. value7은 후위형 증감 연산자이므로 증감 없음.
		 							 //     value8은 전위형 증감 연산자이므로 증감 있음.
 		 
	}
	
}
