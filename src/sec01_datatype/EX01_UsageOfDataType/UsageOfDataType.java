package sec01_datatype.EX01_UsageOfDataType;
// 2.1 변수와 자료형
public class UsageOfDataType {

	public static void main(String[] args) {
				
		/* 자료형 선언하기
		 
		 C, 자바같은 컴파일 언어는 변수를 사용하기 전에 반드시 자료형을 선언해야 함. 변수의 자료형을 선언할 때는 반드시
		 변수의 이름 앞에 자료형을 표기해야 함. 변수에 자료형이 선언되어야 메모리에 변숫값을 저장할 수 있는 공간이 만들어짐.
		 이때 주의점으로 첫째는, 자료형은 반드시 사용 전에 선언해야 함. 선언하지 않았다면 사용이 불가능함. 둘째론, 자료형은
		 반드시 한 번만 선언해야 함.한 번 선언도니 자료형은 변경이 불가능함.
		 
		 a = 3; // 자료형을 선언하지 않아 사용 불가능
		 int b = 3; // 정상
		 int b = 4; // 기존 int b에 대한 선언이 있었으므로 불가능. 
		 int c = d; // 정수형 int에 문자열이 오므로 선언 불가능. 
		
		 */
		
		// 변수 선언과 함께 값 대입
		int a = 3;
		
		// 변수 선언과 값 대입 분리
		
		int b;
		b = 4;
		
		System.out.println(a);
		System.out.println(b);
		
		}

}
