package sec02_primarydatatype.EX02_PrimaryDataType_1;

public class PrimaryDataType_1 {

	public static void main(String[]args) {
		/* 2.4 부울 대수 자료형 boolean: true / false
		   
		   boolean은 참true과 거짓false로만 값을 저장할 수 있는 자료형임. 불리언은 이렇게 2가지 값만 포함하기에
		   실제로는 1bit로도 충분하지만, 자료 처리의 최소 단위가 바이트 이므로 1byte가 할당 됨. 나머지  7bit는 미사용.
		*/
		
		boolean bool1 = true;
		boolean bool2 = false;
		
		System.out.println(bool1);
		System.out.println(bool2);
		System.out.println();
		
		/* 2.3.4 정수 자료형 (byte, short, int, long): 음의 정수, 0, 양의 정수
		   
		   정수를 저장할 수 있는 자료형들로 크기는 byte : 1byte, short : 2byte, int : 4byte, long : 8byte
		   같은 값의 정수라도 다른 자료형으로 다르게 저장이 가능하지만 본질 적인 값이 변하는 것은 아님.
		   ex) byte a = 3이나 short a = 3이나 결국 값은 같음
		   
		   그럼에도 불구하고 다른 자료형들이 존재하는 이유는, 앞서 말했다시피 자료형별로 할당받는 크기가 다르기 때문에
		   메모리 효율성의 차이가 발생하기 때문임. 너무 작은 자료형에는 큰 값을 담을 수 없고, 너무 큰 자료형만 쓰기엔
		   작은 값을 담을 때 발생하는 메모리 과사용이 너무 큼.
		   
		   잘못된 자료형 선택으로 인한 문법 오류
		   
		   자바에서는 대입 연산자를 기준으로, 양쪽 자료형이 일치해야 함. 다만 큰 자료형에 작은 크기의 자료형을 대입하면
		   자바에서 자동 타입변환type casting이 발생하기 때문에 요류가 발생하지 않음. 가령 long a = 3; 의 경우는
		   long = int 이지만, 캐스팅 처리로 인해 정상 작동하는 것. 다만 작은 크기의 자료형에 큰 자료형을 넣으면 캐스팅이
		   작동하지 않으므로 이에 주의해야 함.
		   		   
		*/
		
		byte value1 = 10;
		short value2 = -10;
		int value3 = 100;
		long value4 = -100L; // L 리터럴을 추가해 Long 자료형으로 인식함.
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		System.out.println();
		
		/* 2.3.5 실수(float, double): 음의 실수, 0, 양의 실수
		
		   실수형 자료형 2가지 타입 또한 서로 다른 자리수를 가짐. float는 7자리, double은 15자리.
		   자바는 실수 리터럴을 doube 자료형으로 인식함. 단 float를 나타내는 F(f)를 붙이면 float 자료형으로 인식. 
		
		*/
		float value5 = 1.2F;
		double value6 = -1.5;
		double value7 = 5; // 자료형이 더 큰 double 이기 때문에 type casting 발생
		
		System.out.println(value5);
		System.out.println(value6);
		System.out.println(value7); // 실수 값으로 출력
		
	}
}
